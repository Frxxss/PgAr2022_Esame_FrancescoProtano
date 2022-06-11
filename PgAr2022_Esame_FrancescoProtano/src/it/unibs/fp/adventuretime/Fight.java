package it.unibs.fp.adventuretime;

import it.unibs.fp.mylib.EstrazioniCasuali;
import it.unibs.fp.mylib.InputDati;

public class Fight {
	private int potenzaAtt;
	private int attacco;
	private int difesa;
	private double modif;
	
	
	public int getPotenzaAtt() {
		return potenzaAtt;
	}
	public void setPotenzaAtt(int potenzaAtt) {
		this.potenzaAtt = potenzaAtt;
	}
	public int getAttacco() {
		return attacco;
	}
	public void setAttacco(int attacco) {
		this.attacco = attacco;
	}
	public int getDifesa() {
		return difesa;
	}
	public void setDifesa(int difesa) {
		this.difesa = difesa;
	}
	public double getModif() {
		return modif;
	}
	public void setModif(double modif) {
		this.modif = modif;
	}
	
	
	public double generaModificatore() {
	int prob =	EstrazioniCasuali.estraiIntero(1, 100);
	if(prob <= 7.5) setModif(1.5);
	else setModif(1);
	return getModif();
	}
		
	
	public double generaDannoP(Personaggio P) {
		double modifP = generaModificatore();
		double dannoP = ((((2*P.armaPG.getPotenzaA()) * P.getAttaccoInizialeP())/ (25*P.getDifesaInizialeP())) + 2) * modifP;;
		return dannoP;
		}
	public double generaDannoM(Mostro M) {
		double modifM = generaModificatore();
		double dannoM = ((((2*M.armaMostro.getPotenzaA()) * M.getAttaccoInizialeM())/ (25*M.getDifesaInizialeM())) + 2) * modifM;;
		return dannoM;
		}
	
	public boolean generaScontro(Personaggio P1, Mostro M1 ) {
	 boolean win;
	do {
	M1.setVitaInizialeM(M1.getVitaInizialeM() - generaDannoP(P1));
	P1.setVitaInizialeP(P1.getVitaInizialeP() - generaDannoM(M1));
	}while(P1.getVitaInizialeP() > 0 && M1.getVitaInizialeM() > 0);
	if(M1.getVitaInizialeM() <= 0) {
		System.out.println("HAI VINTO LO SCONTRO");
		win = true;
	}
	else {
		System.out.println("HAI PERSO LO SCONTRO");
		win = false;
	}
	return win;
	}
	
	public Mostro generaMostro() {
		Mostro M = new Mostro(null,1,1,1);
		M.setNomeM("Mostro");
		M.setAttaccoInizialeM(5);
		M.setDifesaInizialeM(5);
		M.setVitaInizialeM(EstrazioniCasuali.estraiIntero(15, 25));
		return M;
	}
	public Arma sceltaArma(Personaggio P1) {
		if(P1.armiPG.size() == 0) 
		{
			System.out.println("Risolvero' con le mani!");
			return P1.armaPG;
		}
		else {
		for(int i=0;i<P1.armiPG.size();i++) {
	System.out.println(i + " , " + P1.armiPG.get(i+1).getNome());	
	  
		}
		int scelta = InputDati.leggiIntero("Scegli l'arma desiderata,", 0, P1.armiPG.size());
		 P1.armaPG = P1.armiPG.get(scelta);
		 	return P1.armaPG;
		}
}
}
