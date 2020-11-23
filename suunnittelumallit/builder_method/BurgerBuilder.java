package builder_method;

public class BurgerBuilder {

	public Mcdonalds mcBurger() {
		Mcdonalds burgeri = new Mcdonalds();
		burgeri.lisääOsa(new Pulla());
		burgeri.lisääOsa(new Suolakurkku());
		burgeri.lisääOsa(new Salaatti());
		burgeri.lisääOsa(new Tomaatti());
		burgeri.lisääOsa(new Pihvi());
		return burgeri;
	}

	public Hesburger hesBurger() {
		Hesburger burgeri = new Hesburger();
		burgeri.lisääOsat();
		return burgeri;
	}

}
