package chain_method;

public abstract class Handler {

	protected Handler johtaja;
	
	public void setHandler(Handler johtaja) {
		this.johtaja = johtaja;
	}
	
	public void handle() {
		if(johtaja != null) {
			johtaja.handle();
		}
	}
	
	public abstract void prosessoiPyyntö(PalkkaPyyntö pyyntö);

}
