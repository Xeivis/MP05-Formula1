package main;

import java.util.RandomAccess;
import java.util.Scanner;
import java.io.RandomAccessFile;
import java.io.File;

public class TemporadaF1 {
	static Scanner lector = new Scanner(System.in);

	public void main(String[] args) {

		int opcio = 0;
		opcio = lector.nextInt();
		lector.nextLine();
		do {
			switch (opcio) {
			case 1:
				Visualitzar();
				break;
			case 2:
				EntrarGranPremi();
				break;
			case 3:

				break;
			}
		} while (opcio != 99);

	}

	private void EntrarGranPremi() {
	}

	public static void Visualitzar() {
		int opcio = 0;
		opcio = lector.nextInt();
		lector.nextLine();
		do {
			switch (opcio) {
			case 1:
				VisualitzarGransPremis();
				break;
			case 2:
				VisualitzarClasssificacióPilots();
				break;
			case 3:
				VisalitzarClassificacióEscuderies();
				break;
			case 4:
				VisualitzarResultatsDeGranPremi();
			}
		} while (opcio != 99);

	}

	private static void VisalitzarClassificacióEscuderies() {
	}

	private static void VisualitzarClasssificacióPilots() {
	}

	private static void VisualitzarGransPremis() {
	}

	private static void VisualitzarResultatsDeGranPremi() {
	}
}
