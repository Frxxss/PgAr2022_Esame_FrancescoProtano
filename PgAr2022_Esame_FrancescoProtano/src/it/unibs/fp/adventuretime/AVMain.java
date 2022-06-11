
package it.unibs.fp.adventuretime;

import it.unibs.fp.mylib.InputDati;

public class AVMain {

	public static void main(String[] args) {
	Personaggio P = new Personaggio(InputDati.leggiStringa("Come si chiama il nostro eroe?\n"),20,5,5);
	 Mappa map = new Mappa();
	 map.leggiMappa("livello1.xml");
	 map.stampaMappa();
	 Input in = new Input();
	 for(int i=0; i<30; i++) in.ispezionaInput(map, P);
	 
	 
	
	
	
	}
}
