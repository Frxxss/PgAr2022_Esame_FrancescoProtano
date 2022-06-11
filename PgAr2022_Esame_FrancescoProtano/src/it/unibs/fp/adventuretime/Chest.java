package it.unibs.fp.adventuretime;

import it.unibs.fp.mylib.EstrazioniCasuali;
import it.unibs.fp.mylib.InputDati;
/**
 * La classe Chest gestisce le casse sparse per la mappa.
 * @author Francesco
 *
 */
public class Chest {
	
	Arma armaCasuale = new Arma(null,0);
	
	private double Pozione;
	private int extrOggetto;
	
	
	public double getPozione() {
		return Pozione;
	}

	public void setPozione(double pozione) {
		Pozione = pozione;
	}

	public int getExtrOggetto() {
		return extrOggetto;
	}

	public void setExtrOggetto(int extrOggetto) {
		this.extrOggetto = extrOggetto;
	}
 /**
  * Il metodo generaOggetto sceglie in maniera casuale che tipo di oggetto dara' la chest.
  * @return
  */
	public int generaOggetto() {
		int prob =	EstrazioniCasuali.estraiIntero(1, 100);
		if(prob <= 40) setExtrOggetto(1);
		else if(prob > 40 &&  prob <= 75) setExtrOggetto(2);
		else setExtrOggetto(3);
		return getExtrOggetto();
		
	}
	/**
	 * Il metodo aperturaChest apre la chest.
	 * @param P1
	 */
	public void aperturaChest(Personaggio P1) {
		generaOggetto();
		if(getExtrOggetto()== 1) {
			ListaArmi lista = new ListaArmi();
			Arma armaTrovata = lista.estraiArma();
			System.out.println("Hai trovato" + " " + armaTrovata.getNomeA());
			P1.armiPG.add(armaTrovata);
			}
			
			else if(getExtrOggetto() == 2) {
			System.out.println("Hai ricevuto uno scudo, la tua vita aumenta di 5!");
			P1.setVitaInizialeP(P1.getVitaInizialeP() + 5);
			}
			else if(getExtrOggetto() == 3) {
				System.out.println("Hai ricevuto una pozione!");
				Oggetto pozione = new Oggetto();
				pozione.setNome("Pozione");
				P1.Inventario.add(pozione);
		}
		
	}
}	
	


