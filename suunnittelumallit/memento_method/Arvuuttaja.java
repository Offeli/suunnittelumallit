package memento_method;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arvuuttaja {

	private static Random r = new Random();

	public static Memento liityPeliin() {
		int rNumber = r.nextInt(6) + 1;
		return new Memento(rNumber);
	}

	public static boolean vertailu(Memento m, int rNumber) {
		if (m.getState() == rNumber) {
			return true;
		}
		return false;
	}
}
