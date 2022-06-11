package it.unibs.fp.adventuretime;

import java.util.ArrayList;
import java.util.List;

import it.unibs.fp.mylib.InputDati;
/**
 * La classe Personaggio crea il personaggio.
 * @author Francesco
 *
 */
public class Personaggio {
	
	private String nomeP;
	private double vitaInizialeP;
	private int attaccoInizialeP;
	private int difesaInizialeP;
	Arma armaPG = new Arma("Schiaffi", 1);
	ListaArmi lista = new ListaArmi();
	ArrayList<Arma> armiPG = new ArrayList<>();
	ArrayList<Oggetto> Inventario = new ArrayList<>();
	
	public String getNomeP() {
		return nomeP;
	}
	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}
	public double getVitaInizialeP() {
		return vitaInizialeP;
	}
	public void setVitaInizialeP(double vitaInizialeP) {
		this.vitaInizialeP = vitaInizialeP;
	}
	public int getAttaccoInizialeP() {
		return attaccoInizialeP;
	}
	public void setAttaccoInizialeP(int attaccoInizialeP) {
		this.attaccoInizialeP = attaccoInizialeP;
	}
	public int getDifesaInizialeP() {
		return difesaInizialeP;
	}
	public void setDifesaInizialeP(int difesaInizialeP) {
		this.difesaInizialeP = difesaInizialeP;
	}
	
	
	
	public Personaggio(String nomeP, double vitaInizialeP, int attaccoInizialeP, int difesaInizialeP) {
		super();
		this.nomeP = nomeP;
		this.vitaInizialeP = vitaInizialeP;
		this.attaccoInizialeP = attaccoInizialeP;
		this.difesaInizialeP = difesaInizialeP;
	}
	
	
	/**
	 * Il metodo apriInventario apre l'inventario e consente di bere le pozioni.
	 * @param P
	 */
	public void apriInventario(Personaggio P) {
		
		int scelta = InputDati.leggiIntero("Vuoi aprire l'inventario?\n 1. SI \n 2. NO\n", 1, 2);
		if(scelta == 1) {
			
			for(int i =0; i< armiPG.size(); i ++) {
				System.out.println(armiPG.get(i).getNomeA() + "\n");
				}
			if(Inventario.size()!= 0) {
				int sceltaP = InputDati.leggiIntero("Vuoi usare la pozione?\n 1. SI \n 2. NO\n", 1, 2);
				if(sceltaP == 1) P.setVitaInizialeP(getVitaInizialeP() + 10); 
			}
			for(int j = 0; j< Inventario.size(); j++) {
			
				System.out.println(Inventario.get(j).getNome() + "\n");
				
				
			}
		}
		else System.out.println("Ok!");
		
	}

}
