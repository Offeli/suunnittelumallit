package composite_method;

import java.util.ArrayList;

public class Emolevy implements Koostekomponentti, Laiteosa {
	
	int hinta = 150;
	
	ArrayList <Laiteosa> osat = new ArrayList();
	
	@Override
	public int getOsanHinta() {
		// TODO Auto-generated method stub
		for(Laiteosa osa : osat) {
			hinta += osa.getOsanHinta();
		}
		return hinta;
	}

	@Override
	public void addOsa(Laiteosa osa) {
		osat.add(osa);
	}

}
