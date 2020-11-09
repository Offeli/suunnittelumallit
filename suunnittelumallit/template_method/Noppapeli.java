package template_method;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Noppapeli extends Game {
	
	ArrayList <Player> pelaajat = new ArrayList();
	Random noppa = new Random();
	String winner = null;
	int yhteensä;
	
	@Override
	void initializeGame(int playersCount) {
		for (int i= 0; i<playersCount; i++ ) {
			Player p = new Player(i);
			pelaajat.add(p);
		}
	}

	@Override
	void makePlay(int player) {
		for (Player peluri : pelaajat) {
			int silmäluku1 = noppa.nextInt(6)+1;
			int silmäluku2 = noppa.nextInt(6)+1;
			System.out.println("Pelaaja " + peluri.getName() + " heitti silmäluvut " + silmäluku1 + " ja " + silmäluku2);
			int yhteensä = silmäluku1 + silmäluku2;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			peluri.setPisteet(yhteensä);
			System.out.println("Pelaajalla " + peluri.getName() + " on " + peluri.getPisteet() + " pistettä.");
		}
	}

	@Override
	boolean endOfGame() {
		for (Player peluri : pelaajat) {
			if(peluri.getPisteet() == 50) {
				winner = peluri.getName();
				return true;
			}
		}
		return false;
	}

	@Override
	void printWinner() {

		System.out.println(winner + " ON VOITTAJA!!!");

	}
}
