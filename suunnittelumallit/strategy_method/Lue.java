package strategy_method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lue {
	
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	
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

}
