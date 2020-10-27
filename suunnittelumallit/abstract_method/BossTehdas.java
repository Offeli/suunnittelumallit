package abstract_method;

public class BossTehdas implements VaateTehdas {

	@Override
	public Farmarit createFarmarit() {
		// TODO Auto-generated method stub
		return new BossFarmarit();
	}

	@Override
	public Paita createPaita() {
		// TODO Auto-generated method stub
		return new BossPaita();
	}

	@Override
	public Lippis createLippis() {
		// TODO Auto-generated method stub
		return new BossLippis();
	}

	@Override
	public Kengät createKengät() {
		// TODO Auto-generated method stub
		return new BossKengät();
	}

}
