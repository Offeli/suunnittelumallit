package chain_method;

public class AliJohtaja extends Handler {

	private final double ALLOWABLE = 1.02;

	@Override
	public void prosessoiPyyntö(PalkkaPyyntö pyyntö) {
		 if((pyyntö.getPyyntö()/pyyntö.getPalkka()) < ALLOWABLE ) {
			 System.out.println("Alijohtaja hyväksyy "+ (pyyntö.getPyyntö() - pyyntö.getPalkka()) + "€ palkankorotuspyyntösi. Palkkasi on nyt " + pyyntö.getPyyntö() + "€");
		 }
        else if(johtaja != null) {
        	   johtaja.prosessoiPyyntö(pyyntö);
           }
               
		
	}


}
