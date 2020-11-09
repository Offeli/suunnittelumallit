package state_method;

public class Sukamon extends Digimon {

	private static Sukamon INSTANCE = new Sukamon();

	private Sukamon() {

	}

	public static Sukamon getState() {
		return INSTANCE;
	}

	public void physicalAttack() {
		System.out.println("Sukamon hit for 100 damage");
		setXp(1);
	}

	public void magicalAttack() {
		System.out.println("Sukamon casted a spell for 100 damage");
		setXp(1);

	}

	public void block() {
		System.out.println("Sukamon blocked 100 damage");
		setXp(1);
	}

	@Override
	void evolve(Context context) {
		if (getXp() > 25) {
			changeState(context, PlatinumSukamon.getState());
			System.out.println("OMEGAPOGGERS SUKAMONINI MUUTTUI PLATINAISEKSI");
		}

	}

}
