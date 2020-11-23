package adapter_method;

public class DCI4Kto2Kadapter implements DCI4K {

	private DCI2K dci2k;

	public DCI4Kto2Kadapter(DCI2K dci2k) {
		this.dci2k = dci2k;
	}

	@Override
	public void show4KVideo() {

		dci2k.show2KVideo();

	}

}
