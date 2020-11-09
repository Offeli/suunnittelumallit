package strategy_method;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class SortAlgorithms {

	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	final static int MAX = 100000;

	public static char merkki() {
		String rivi = rivi();
		try {
			return rivi.charAt(0);
		} catch (Exception e) {
			return ' ';
		}
	}

	public static String rivi() {
		String arvo = null;
		boolean ok;
		do {
			try {
				arvo = stdin.readLine();
				ok = true;
			} catch (Exception e) {
				System.out.println("Virhe rivin lukemisessa. Anna uusi!");
				ok = false;
			}
		} while (!ok);
		return arvo;
	}

	public static void selectSort() {

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
		merkki();
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
		merkki();

	}

	public static void mergeSort() {

		int[] a = new int[MAX];
		int i;
		Random r = new Random(); // luodaan satunnaislukugeneraattori
		System.out.println("\nGeneroidaan syöttöaineisto: ");
		for (i = 0; i < MAX; i++) {
			a[i] = r.nextInt(1000); // generoidaan luvut
			System.out.print(a[i] + " ");
			if (i > 0 && i % 40 == 0) // rivinvaihto
				System.out.println();
		}
		System.out.println("\nSuoritetaan lomituslajittelu, paina Enter");
		merkki();
		long start = System.currentTimeMillis();

		mergeSort(a, 0, MAX - 1);
		for (i = 0; i < MAX; i++) {
			System.out.print(a[i] + " ");
			if (i > 0 && i % 40 == 0) // rivinvaihto
				System.out.println();
		}
		long stop = System.currentTimeMillis();
		long stopTime = stop -= start;
		System.out.println("\nKuittaa tulos, paina Enter aika=" + stopTime);
		merkki();
	}

	private static int[] tau = new int[MAX]; // aputaulukko (ei varata tätä pinosta!)

	// oletus: osataulukot t[p..q] ja t[q+1...r] ovat järjestyksess„
	public static void merge(int t[], int p, int q, int r) {
		// i osoittaa 1. osataulukkoa, j osoittaa 2. osataulukkoa
		// k osoittaa aputaulukkoa, johon yhdiste kirjoitetaan.
		int i = p, j = q + 1, k = 0;

		while (i < q + 1 && j < r + 1) {

			if (t[i] < t[j]) {
				tau[k++] = t[i++];
			} else {
				tau[k++] = t[j++];
			}

		}
		// toinen osataulukko käsitelty, siirretään toisen käsittelemättömät

		while (i < q + 1) {
			tau[k++] = t[i++];

		}

		while (j < r + 1) {
			tau[k++] = t[j++];

		}
		// siirretään yhdiste alkuperäiseen taulukkoon

		for (i = 0; i < k; i++) {
			t[p + i] = tau[i];

		}
	}

	public static void mergeSort(int t[], int alku, int loppu) {
		int ositus;
		long la, ll, lt;

		if (alku < loppu) { // onko väh. 2 alkiota, että voidaan suorittaa ositus

			la = alku;
			ll = loppu;
			lt = (la + ll) / 2;
			ositus = (int) lt;
			mergeSort(t, alku, ositus);// lajitellaan taulukon alkupää
			mergeSort(t, ositus + 1, loppu);// lajitellaan taulukon loppupää
			merge(t, alku, ositus, loppu);// yhdistetään lajitellut osataulukot
		}

	}

	public static void quickSortLoop() {
		int taulukko[] = new int[MAX];
		Random r = new Random();

		for (int i = 0; i < MAX; i++) {
			taulukko[i] = r.nextInt(1000);
			System.out.print(taulukko[i] + " ");
			if (i > 0 && i % 40 == 0) {// rivinvaihto
				System.out.println();
			}
		}
		System.out.println("\nJärjestellään käyttämällä Quicksorttia, paina Enter");
		merkki();
		long start = System.currentTimeMillis();
		qs(taulukko, MAX);
		long stop = System.currentTimeMillis();
		long stopTime = stop -= start;
		System.out.println("aika " + stopTime);
	}

	public static void quickSort(int table[], int lo0, int hi0) {
		int lo = lo0;
		int hi = hi0;
		int mid, swap;

		mid = table[(lo0 + hi0) / 2];

		while (lo <= hi) {

			while (table[lo] < mid) {
				++lo;

			}

			while (table[hi] > mid) {
				--hi;

			}

			if (lo <= hi) {
				swap = table[lo];
				table[lo] = table[hi];
				++lo;
				table[hi] = swap;
				--hi;

			}
		}

		if (lo0 < hi) {
			quickSort(table, lo0, hi);

		}

		if (lo < hi0) {
			quickSort(table, lo, hi0);

		}
	}

	public static void qs(int table[], int values) {
		quickSort(table, 0, values - 1);

		System.out.println("\nJärjestetty aineisto:\n");
		for (int i = 0; i < values; i++) {
			System.out.print(table[i] + " ");
			if (i > 0 && i % 40 == 0) { // rivinvaihto
				System.out.println();
			}
		}
	}

}