package abstract_method;

public class Jasper {
	
	private Farmarit farmarit;
	private Paita paita;
	private Lippis lippis;
	private Kengät kengät;
	
	public Jasper(VaateTehdas tehdas) {
		farmarit = tehdas.createFarmarit();
		paita = tehdas.createPaita();
		lippis = tehdas.createLippis();
		kengät = tehdas.createKengät();
	}
	
	public String toString() {
		String vaatteet = "Päälläni on ";
		
		vaatteet += farmarit + ", ";
		vaatteet += paita + ", ";
		vaatteet += lippis + ", ";
		vaatteet += kengät + " ";
		
		return vaatteet;
		
	}
}
