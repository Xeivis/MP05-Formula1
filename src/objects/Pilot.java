package objects;

import java.io.Serializable;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Duration;

public class Pilot implements Serializable {
	
	private int[] puntsPos = {25,18,15,12,10,8,6,4,2,1,0};
	private String nom;
	private LocalDate dataNaix;
	private String escuderia;
	private ArrayList<Integer> posicions = new ArrayList<>();
	private ArrayList<Duration> temps = new ArrayList<>();
	private ArrayList<Integer> punts = new ArrayList<>();
	private int puntsTotals;

	public Pilot(String nom, LocalDate dataNaix, String escuderia) {
		this.nom = nom;
		this.dataNaix = dataNaix;
		this.escuderia = escuderia;
		this.puntsTotals = 0;
	}

	public String getNom() {
		return this.nom;
	}

	public LocalDate getDataNaix() {
		return this.dataNaix;
	}

	public String getEscuderia() {
		return this.escuderia;
	}

	public int getPunts() {
		calcularPuntsTotals();
		return this.puntsTotals;
	}
	
	public void entrarResultatCursa(int pos, Duration tempsCursa, boolean voltaRapida) {
		this.posicions.add(pos);
		this.temps.add(tempsCursa);
		int puntsCalculats = 0;
		if(pos<10) {
			puntsCalculats = this.puntsPos[pos-1];
			if(voltaRapida) puntsCalculats++;
		}
		this.punts.add(puntsCalculats);
	}

	private void calcularPuntsTotals() {
		int calcul = 0;
		for (int i = 0; i < this.punts.size(); i++) {
			calcul += this.punts.get(i);
		}
		this.puntsTotals = calcul;
	}

}
