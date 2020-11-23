package builder_method;

import java.util.ArrayList;
import java.util.List;

public class Mcdonalds {

	private List<AinesOsa> burgeri = new ArrayList();

	public void lisääOsa(AinesOsa ainesosa) {
		burgeri.add(ainesosa);
	}

	public void näytäBurgeri() {
		System.out.println("Mäkkärin burger sisältää:");
		for (AinesOsa ainesosa : burgeri) {
			System.out.println(ainesosa.getAines());
		}
	}

}
