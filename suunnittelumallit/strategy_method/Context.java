package strategy_method;

import java.util.Scanner;

public class Context implements StrategyInterface{

	public Context() {

	}

	public void sort(int aineisto[], int MAX) {
		Scanner s = new Scanner(System.in);
		System.out.println();
		System.out.println("Paina 1 mergesorttiin, 2 quicksorttiin tai 3 selectsorttiin");
		
		int valinta = s.nextInt();
		if (valinta == 1) {
			StrategyInterface merge = new MergeSort();
			merge.sort(aineisto, MAX);
		} else if(valinta == 2) {
			StrategyInterface quick = new QuickSort();
			quick.sort(aineisto, MAX);
		} else if(valinta == 3) {
			StrategyInterface select = new SelectSort();
			select.sort(aineisto, MAX);
		}
	}
}
