package visitor_pattern;

public class DigimonVisitor implements Visitor {

	int nPisteet = 0;
	int sPisteet = 0;
	int pPisteet = 0;

	@Override
	public void visit(Numemon numemon) {
		nPisteet++;
		System.out.println("Numemonilla lisää pisteitä " + nPisteet);
	}

	@Override
	public void visit(Sukamon sukamon) {
		sPisteet++;
		System.out.println("Paskalla lisää pisteitä " + sPisteet);
	}

	@Override
	public void visit(PlatinumSukamon platinumsukamon) {
		pPisteet++;
		System.out.println("Platinapaskalla lisää pisteitä " + pPisteet);
	}

	
}
