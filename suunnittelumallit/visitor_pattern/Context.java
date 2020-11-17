package visitor_pattern;

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
		Visitor visitor = new DigimonVisitor();
		while (isRun()) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int action = rand.nextInt(5) + 1;
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
			case 5: {
				state.accept(visitor);
			}
			}
		}
		
	}
}
