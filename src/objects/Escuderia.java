package objects;

import java.io.Serializable;
import java.util.ArrayList;

public class Escuderia implements Serializable {

	private String nom;
	private ArrayList<Pilot> pilots = new ArrayList<>();
	private int puntsTotals;

	public Escuderia(String nom) {
		this.nom = nom;
		this.puntsTotals = 0;
	}

	public String getNom() {
		return nom;
	}

	public int getPuntsTotals() {
		calculPunts();
		return puntsTotals;
	}

	public String llsitarPiots() {
		String llista = "";
		for(int i = 0; i<this.pilots.size(); i++) {
			llista+=" - "+this.pilots.get(i).getNom()+"\n";
		}
		return llista;
	}

	private void calculPunts() {
		int calcul = 0;
		for (int i = 0; i < this.pilots.size(); i++) {
			calcul += this.pilots.get(i).getPunts();
		}
		this.puntsTotals = calcul;
	}
}
