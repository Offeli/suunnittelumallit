package memento_method;

import java.util.Scanner;

public class MementoMain {

	public static void main(String[] args) {
		
		
		Arvuuttaja arvuuttaja = new Arvuuttaja();
		Asiakas asiakas = new Asiakas(arvuuttaja);
		
		asiakas.start();
	}

}
