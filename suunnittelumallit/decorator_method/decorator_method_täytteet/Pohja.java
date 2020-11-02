package decorator_method_täytteet;

import decorator_method.PizzanKoristaja;

public class Pohja extends PizzanKoristaja {
	
	int hinta = 3;
	

	@Override
	public int getHinta() {
		// TODO Auto-generated method stub
		return this.hinta;
	}

	@Override
	public String getNimi() {
		// TODO Auto-generated method stub
		return "Pohja ";
	}

}
