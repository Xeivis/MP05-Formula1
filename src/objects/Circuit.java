package objects;

import java.io.Serializable;

public class Circuit implements Serializable {

	private String nom;
	private int metres;
	private String lloc;
	private String tipus;

	public Circuit(String nom, int metres, String lloc, String tipus) {
		this.nom = nom;
		this.metres = metres;
		this.lloc = lloc;
		this.tipus = tipus;
	}

	public String getNom() {
		return nom;
	}

	public int getMetres() {
		return metres;
	}

	public String getLloc() {
		return lloc;
	}

	public String getTipus() {
		return tipus;
	}

}
