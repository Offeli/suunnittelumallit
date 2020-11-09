package chain_method;

public class CEO extends Handler {
	
	private final double ALLOWABLE = 1.10;

	@Override
	public void prosessoiPyyntö(PalkkaPyyntö pyyntö) {
		if((pyyntö.getPyyntö()/pyyntö.getPalkka()) < ALLOWABLE ) {
            System.out.println("CEO hyväksyy "+ (pyyntö.getPyyntö() - pyyntö.getPalkka()) + "€ palkankorotuspyyntösi. Palkkasi on nyt " + pyyntö.getPyyntö() + "€");
		}
        else if (johtaja != null) {
        	johtaja.prosessoiPyyntö(pyyntö);
        } else if (johtaja == null && (pyyntö.getPyyntö()/pyyntö.getPalkka()) > ALLOWABLE) {
        	System.out.println("Pyyntösi on hylätty. '" + pyyntö.getSyy() + "' ei ole hyvä syy palkankorotukseen. ");
        }
		
	}
}
