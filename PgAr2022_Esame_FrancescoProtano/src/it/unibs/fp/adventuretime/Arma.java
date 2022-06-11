package it.unibs.fp.adventuretime;
/**
 * La classe Arma crea le armi.
 * @author Francesco
 *
 */
public class Arma extends Oggetto{
	
	private String nomeA;
	private int potenzaA;
	
	public String getNomeA() {
		return nomeA;
	}
	public void setNomeA(String nomeA) {
		this.nomeA = nomeA;
	}
	public int getPotenzaA() {
		return potenzaA;
	}
	public void setPotenzaA(int potenzaA) {
		this.potenzaA = potenzaA;
	}
	public Arma(String nomeA, int potenzaA) {
		super();
		this.nomeA = nomeA;
		this.potenzaA = potenzaA;
	}
	
	
	

}
