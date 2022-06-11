package it.unibs.fp.adventuretime;

import it.unibs.fp.mylib.EstrazioniCasuali;
//*La classe ListaArmi elenca e denomina le armi.
public class ListaArmi {
	
	Arma spada = new Arma("Spada degli Abissi", EstrazioniCasuali.estraiIntero(35, 55) );
	Arma ascia = new Arma("Accetta del Boscaiolo", EstrazioniCasuali.estraiIntero(35, 55));
	Arma sciabola = new Arma("Sciabola dell'Inferno", EstrazioniCasuali.estraiIntero(35, 55));
	Arma lancia = new Arma("Bastone della Giustizia", EstrazioniCasuali.estraiIntero(35, 55));
	Arma tirapugni = new Arma("ScassaMandibole", EstrazioniCasuali.estraiIntero(35, 55));
	
	/**
	 * il metodo estraiArma sceglie casualmente un arma.
	 * @return
	 */
	public Arma estraiArma() {
		int sceltaArma = EstrazioniCasuali.estraiIntero(1, 5);
		Arma arma = new Arma(null,0);
		switch(sceltaArma) {
		case 1:
			arma = spada;
		case 2:
			arma = ascia;
		case 3:
			arma = sciabola;
		case 4:
			arma = lancia;
		case 5:
			arma = tirapugni;
		}
		return arma;
	}
}
