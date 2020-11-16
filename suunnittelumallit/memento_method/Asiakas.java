package memento_method;

import java.util.Random;

public class Asiakas extends Thread {

	private Arvuuttaja arvuuttaja;

	private static Random r = new Random();

	public Asiakas(Arvuuttaja arvuuttaja) {
		this.arvuuttaja = arvuuttaja;
	}

	public void run() {

		int i;
		Memento j = Arvuuttaja.liityPeliin();
		Boolean b = false;
		while (!b) {
			i = r.nextInt(6) + 1;
			System.out.println("Arvasit " + i);
			b = Arvuuttaja.vertailu(j, i);
		}
		System.out.println("Voitit pelin");
	}

}
