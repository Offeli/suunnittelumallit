package state_method;

public class Numemon extends Digimon {

	private static Numemon INSTANCE = new Numemon();

	private Numemon() {

	}

	public static Numemon getState() {
		return INSTANCE;
	}

	public void physicalAttack() {
		System.out.println("Numemon hit for 50 damage");
		setXp(1);
		System.out.println(getXp());
	}

	public void magicalAttack() {
		System.out.println("Numemon casted a spell for 50 damage");
		setXp(1);

	}

	public void block() {
		System.out.println("Numemon blocked 50 damage");
		setXp(1);
	}

	@Override
	void evolve(Context context) {
		if (getXp() > 10) {
			changeState(context, Sukamon.getState());
			System.out.println("OMEGAPOGGERS NUMEMONINI MUUTTUI PASKAKASAKSI");
		}

	}

}
