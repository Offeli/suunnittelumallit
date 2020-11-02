package composite_method;

public class Kokoamisdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Verkkokortti verkkokortti = new Verkkokortti();
		Muistipiiri muistipiiri = new Muistipiiri();
		Prosessori prosessori = new Prosessori();
		Näytönohjain näytönohjain = new Näytönohjain();
		Tuuletin tuuletin = new Tuuletin();
		Emolevy emolevy = new Emolevy();
		Kotelo kotelo = new Kotelo();
		
		emolevy.addOsa(prosessori);
		emolevy.addOsa(näytönohjain);
		emolevy.addOsa(verkkokortti);
		emolevy.addOsa(muistipiiri);
		kotelo.addOsa(emolevy);
		kotelo.addOsa(tuuletin);
		
		System.out.println("Tietokoneen hinta yhteenlaskettuna on " + kotelo.getOsanHinta() + "€");
	}

}
