package composite_method;

public class Verkkokortti implements Laiteosa {
	
	int hinta = 50;
	
	@Override
	public int getOsanHinta() {
		// TODO Auto-generated method stub
		return this.hinta;
	}

}
