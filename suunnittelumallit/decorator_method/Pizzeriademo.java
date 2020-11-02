package decorator_method;

import decorator_method_täytteet.Ananas;
import decorator_method_täytteet.Jalapeno;
import decorator_method_täytteet.Kinkku;
import decorator_method_täytteet.Pepperoni;
import decorator_method_täytteet.Pohja;
import decorator_method_täytteet.Punasipuli;
import decorator_method_täytteet.Rucola;

public class Pizzeriademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza pohja = new Pohja();
		pohja = new Rucola(pohja);
		pohja = new Ananas(pohja);
		pohja = new Punasipuli(pohja);
		Pizza pohja1 = new Pohja();
		pohja1 = new Pepperoni(pohja1);
		pohja1 = new Punasipuli(pohja1);
		pohja1 = new Jalapeno(pohja1);
		Pizza pohja2 = new Pohja();
		pohja2 = new Pepperoni(pohja2);
		pohja2 = new Jalapeno(pohja2);
		pohja2 = new Kinkku(pohja2);

		System.out.println("Päivän menu:");
		System.out.println(pohja.getNimi() +" "+ pohja.getHinta()+ "€");
		System.out.println(pohja1.getNimi() +" "+ pohja1.getHinta()+ "€");
		System.out.println(pohja2.getNimi() +" "+ pohja2.getHinta()+ "€");
		
	}

}
