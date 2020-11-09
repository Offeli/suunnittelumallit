package chain_method;

public class PalkkaPyyntö {
	private int palkka;
	private double pyyntö;
	private String syy;
	
	public PalkkaPyyntö(int palkka, double pyyntö, String syy) {
		this.palkka = palkka;
		this.pyyntö = pyyntö;
		this.syy = syy;
	}
	
	public int getPalkka() {
		return palkka;
	}
	public void setPalkka(int palkka) {
		this.palkka = palkka;
	}
	public double getPyyntö() {
		return pyyntö;
	}
	public void setPyyntö(double pyyntö) {
		this.pyyntö = pyyntö;
	}
	public String getSyy() {
		return syy;
	}
	public void setSyy(String syy) {
		this.syy = syy;
	}
}
