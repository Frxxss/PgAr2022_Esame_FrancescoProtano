package it.unibs.fp.adventuretime;

import it.unibs.fp.mylib.InputDati;

public class Input {

	private char input;
	char map[][] = new char[22][31];
	
	
	
	

	public char getInput() {
		return input;
	}

	public void setInput(char input) {
		this.input = input;
	}
	
	public void ispezionaInput(Mappa mappa,Personaggio P) {
		input = InputDati.leggiChar("Scegli cosa fare.\n");
		
		if(input == 'd') { //destra
			mappa.destra(P);
			}
		if(input == 'a') { //sinistra
			mappa.sinistra(P);
			}
		if(input == 'w') { //avanti
			mappa.dritto(P);
			}
		if(input == 's') { //indietro
			mappa.indietro(P);
			}
		if(input == 'e') {
			P.apriInventario(P);
		}
	}
		
		
}