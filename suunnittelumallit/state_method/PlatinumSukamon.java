package state_method;

public class PlatinumSukamon extends Digimon {

	private static PlatinumSukamon INSTANCE = new PlatinumSukamon();

	private PlatinumSukamon() {

	}

	public static PlatinumSukamon getState() {
		return INSTANCE;
	}

	public void physicalAttack() {
		System.out.println("PlatinumSukamon hit for 150 damage");
		setXp(1);
	}

	public void magicalAttack() {
		System.out.println("PlatinumSukamon casted a spell for 150 damage");
		setXp(1);

	}

	public void block() {
		System.out.println("PlatinumSukamon blocked 150 damage");
		setXp(1);

	}

	@Override
	void evolve(Context context) {
		if (getXp() > 100) {
			System.out.println("PlatinumSukamon kuoli");
			context.setRun(false);
		}

	}

}
