package it.unibs.fp.adventuretime;

public class Mostro {
	private String nomeM;
	private double vitaInizialeM;
	private int attaccoInizialeM;
	private int difesaInizialeM;
	
	ListaArmi lista = new ListaArmi();
	Arma armaMostro = lista.estraiArma();
	
	public String getNomeM() {
		return nomeM;
	}
	public void setNomeM(String nomeM) {
		this.nomeM = nomeM;
	}
	public double getVitaInizialeM() {
		return vitaInizialeM;
	}
	public void setVitaInizialeM(double vitaInizialeM) {
		this.vitaInizialeM = vitaInizialeM;
	}
	public int getAttaccoInizialeM() {
		return attaccoInizialeM;
	}
	public void setAttaccoInizialeM(int attaccoInizialeM) {
		this.attaccoInizialeM = attaccoInizialeM;
	}
	public int getDifesaInizialeM() {
		return difesaInizialeM;
	}
	public void setDifesaInizialeM(int difesaInizialeM) {
		this.difesaInizialeM = difesaInizialeM;
	}
	
	
	
	public Mostro(String nomeM, double vitaInizialeM, int attaccoInizialeM, int difesaInizialeM) {
		super();
		this.nomeM = nomeM;
		this.vitaInizialeM = vitaInizialeM;
		this.attaccoInizialeM = attaccoInizialeM;
		this.difesaInizialeM = difesaInizialeM;
	}
	public boolean morteM() {
		if(getVitaInizialeM() == 0) return true;
		else return false;
	}
	

}
