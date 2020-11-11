package strategy_method;

import java.util.Random;
import java.util.Scanner;

public class StrategyMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Anna aineiston koko");
		int MAX = s.nextInt();
		
		
		int taulukko[] = new int[MAX];
		Random r = new Random();

		for (int i = 0; i < MAX; i++) {
			taulukko[i] = r.nextInt(1000);
			System.out.print(taulukko[i] + " ");
			if (i > 0 && i % 40 == 0) {// rivinvaihto
				System.out.println();
			}
		}
		
	   StrategyInterface strategy = new Context();
	   strategy.sort(taulukko, MAX);
	}

}
