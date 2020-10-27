package abstract_method;

public class AdidasTehdas implements VaateTehdas {

	@Override
	public Farmarit createFarmarit() {
		// TODO Auto-generated method stub
		return new AdidasFarmarit();
	}

	@Override
	public Paita createPaita() {
		// TODO Auto-generated method stub
		return new AdidasPaita();
	}

	@Override
	public Lippis createLippis() {
		// TODO Auto-generated method stub
		return new AdidasLippis();
	}

	@Override
	public Kengät createKengät() {
		// TODO Auto-generated method stub
		return new AdidasKengät();
	}

}
