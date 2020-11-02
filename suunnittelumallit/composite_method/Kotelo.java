package composite_method;

import java.util.ArrayList;

public class Kotelo implements Koostekomponentti, Laiteosa {
	
	int hinta = 100;
	
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
		// TODO Auto-generated method stub
		osat.add(osa);
	}
	
}
