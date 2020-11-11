package strategy_method;

import java.util.Random;

public class SelectSort implements StrategyInterface {

	public void sort(int[]taulukko, int MAX) {

		int[] taul = new int[MAX]; // taul tallettaa lajiteltavat tiedot
		int i, j, k, apu, pienin;
		Random r = new Random(); // luodaan satunnaislukugeneraattori
		System.out.println("Generoidaan syöttöaineisto: ");
		for (i = 0; i < MAX; i++) {

			taul[i] = r.nextInt(1000); // generoidaan luvut
			System.out.print(taul[i] + " ");
			if (i > 0 && i % 40 == 0) // rivinvaihto
				System.out.println();
		}
		System.out.println("\nSuoritetaan valintalajittelu, paina Enter ");
		Lue.merkki();
		long start = System.currentTimeMillis();

		// ulompi for-lause

		for (i = 0; i < MAX; i++) {
			pienin = i;
			// sisempi for-lause
			for (j = i + 1; j < MAX; j++) {
				/* löytyykö taulukon loppupäästä pienempää alkiota? */
				// if-lause alla
				if (taul[j] < taul[pienin]) {
					pienin = j;
				}
				// if-lause alla
			}
			if (pienin != i) {
				/* jos löytyi suoritetaan alkioiden vaihto */
				apu = taul[pienin];
				taul[pienin] = taul[i];
				taul[i] = apu;
			}
			// ulompi for-lause
		}
		System.out.println();
		for (i = 0; i < MAX; i++) {
			System.out.print(taul[i] + " ");
			if (i > 0 && i % 40 == 0) // rivinvaihto
				System.out.println();
		}
		long stop = System.currentTimeMillis();
		long stopTime = stop -= start;
		System.out.println("\nKuittaa tulos, paina Enter aika=" + stopTime);
		Lue.merkki();

	}
}
