package strategy_method;

import java.util.Random;

public class QuickSort implements StrategyInterface {

	@Override
	public void sort(int[] taulukko, int MAX) {

		System.out.println("\nJärjestellään käyttämällä Quicksorttia, paina Enter");
		Lue.merkki();
		long start = System.currentTimeMillis();
		qs(taulukko, MAX);
		long stop = System.currentTimeMillis();
		long stopTime = stop -= start;
		System.out.println("aika " + stopTime);

		// TODO Auto-generated method stub

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
