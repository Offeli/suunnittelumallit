package template_method;

import java.io.InputStreamReader;
import java.util.Scanner;

public class TemplateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Noppapeli();
		System.out.println("Montako pelaajaa laitetaan tulille?");
		Scanner s = new Scanner(new InputStreamReader(System.in));
		int pelaajat = s.nextInt();
		game.playOneGame(pelaajat);
	}

}
