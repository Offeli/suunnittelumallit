package singleton_method;

public class Jasper {
	
	private static Jasper instance = new Jasper();
	private Farmarit farmarit;
	private Paita paita;
	private Lippis lippis;
	private Kengät kengät;
	
	private Jasper() {}
	
	public void pueVaatteet(VaateTehdas tehdas) {
		farmarit = tehdas.createFarmarit();
		paita = tehdas.createPaita();
		lippis = tehdas.createLippis();
		kengät = tehdas.createKengät();
	}
	
	public String kerroVaatteet() {
		String vaatteet = "Päälläni on ";
		
		vaatteet += farmarit + ", ";
		vaatteet += paita + ", ";
		vaatteet += lippis + ", ";
		vaatteet += kengät + " ";
		
		return vaatteet;
		
	}

	public static Jasper getInstance() {
		if(instance == null) {
			instance = new Jasper();
		}
		return instance ;
	}
}
