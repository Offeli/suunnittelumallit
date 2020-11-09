package state_method;

import java.util.Random;

public class Context implements State {

	private Digimon state;
	Random rand = new Random();
	private boolean run = true;

	public boolean isRun() {
		return run;
	}

	public void setRun(boolean run) {
		this.run = run;
	}

	public Context() {
		this.state = Numemon.getState();
	}

	protected void changeState(Digimon state) {
		this.state = state;

	}

	public void start() {
		while (isRun()) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int action = rand.nextInt(4) + 1;
			switch (action) {
			case 1: {
				state.physicalAttack();
				break;
			}
			case 2: {
				state.magicalAttack();
				break;
			}
			case 3: {
				state.block();
				break;
			}
			case 4: {
				state.evolve(this);
				break;
			}
			}
		}
	}
}
