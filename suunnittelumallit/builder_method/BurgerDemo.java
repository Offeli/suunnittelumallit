package builder_method;

public class BurgerDemo {

	public static void main(String[] args) {

		BurgerBuilder builder = new BurgerBuilder();

		Mcdonalds mcBurger = builder.mcBurger();
		Hesburger hesburgeri = builder.hesBurger();

		mcBurger.näytäBurgeri();
		hesburgeri.näytäBurgeri();
	}

}
