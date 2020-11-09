package template_method;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Player {
	
	String name;
	int pisteet = 0;
	Scanner s = new Scanner(new InputStreamReader(System.in));

	private int player;

	public Player(int player) {
		super();
		this.player = player;
		System.out.println("Anna pelaajalle nimi");
		this.name = s.next();		
	}
	
	public String getName() {
		return name;
	}
	
	public int getPisteet() {
		return pisteet;
	}

	public void setPisteet(int pisteet) {
		this.pisteet += pisteet;
		if(this.pisteet>50) {
			this.pisteet = 0;
		}
	}
	
	public int getPlayer() {
		return player;
	}
}
