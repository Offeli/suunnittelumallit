package strategy_method;

public class MergeSort implements StrategyInterface {
	 
    private int[] tau;
    static int lkm = 100000;
 
    @Override
    public void sort(int[] taulukko, int MAX) {
        this.tau = new int[MAX];
        mergeSort(taulukko, MAX);
 
    }
 
    public void mergeSort(int[] taulukko, int MAX) {
 
        int[] a = taulukko;
        int i;
		System.out.println("\nSuoritetaan lomituslajittelu, paina Enter");
		Lue.merkki();
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
		Lue.merkki();
    }
 
    public void merge(int t[], int p, int q, int r) {
 
        int i = p, j = q + 1, k = 0;
 
        while (i < q + 1 && j < r + 1) {
 
            if (t[i] < t[j]) {
                tau[k++] = t[i++];
            } else {
                tau[k++] = t[j++];
            }
 
        }
 
        while (i < q + 1) {
            tau[k++] = t[i++];
 
        }
 
        while (j < r + 1) {
            tau[k++] = t[j++];
 
        }
 
        for (i = 0; i < k; i++) {
            t[p + i] = tau[i];
 
        }
    }
 
    public void mergeSort(int t[], int alku, int loppu) {
        int ositus;
        long la, ll, lt;
 
        if (alku < loppu) {
 
            la = alku;
            ll = loppu;
            lt = (la + ll) / 2;
            ositus = (int) lt;
            mergeSort(t, alku, ositus);
            mergeSort(t, ositus + 1, loppu);
            merge(t, alku, ositus, loppu);
        }
 
    }
 
}