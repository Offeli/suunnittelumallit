package decorator_method_täytteet;

import decorator_method.Pizza;
import decorator_method.PizzanKoristaja;

public class Kinkku extends PizzanKoristaja {
	
	Pizza pizza;
	int hinta = 2;

	
	public Kinkku(Pizza pizza) {
		super();
		this.pizza = pizza;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getHinta() {
		// TODO Auto-generated method stub
		return pizza.getHinta() + this.hinta;
	}

	@Override
	public String getNimi() {
		// TODO Auto-generated method stub
		return pizza.getNimi() + "Kinkku ";
	}

}
