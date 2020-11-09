package state_method;

public abstract class Digimon {
	int xp = 0;
	void changeState(Context context, Digimon state) {
		context.changeState(state);
	}
	abstract void physicalAttack();
	abstract void magicalAttack();
	abstract void block();
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp += xp;
	}
	abstract void evolve(Context context);
}
