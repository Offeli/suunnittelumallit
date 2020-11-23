package builder_method;

public class Hesburger {

	StringBuilder hesburgeri = new StringBuilder("Hesen burgerin sisältö: ");

	public void lisääOsat() {
		hesburgeri.append(new Pulla().getAines());
		hesburgeri.append(" ");
		hesburgeri.append(new Salaatti().getAines());
		hesburgeri.append(" ");
		hesburgeri.append(new Suolakurkku().getAines());
		hesburgeri.append(" ");
		hesburgeri.append(new Tomaatti().getAines());
		hesburgeri.append(" ");
		hesburgeri.append(new Pihvi().getAines());
	}

	public void näytäBurgeri() {
		System.out.println(hesburgeri);
	}

}
