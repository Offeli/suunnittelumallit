package adapter_method;

public class AdapterDemo {
	
	static void showVideoOn4K(DCI4K dci4k) {
		dci4k.show4KVideo();
	}
	
	static void showVideoOn2K(DCI2K dci2k) {
		dci2k.show2KVideo();
	}

	public static void main(String[] args) {
		CheapMonitor cheapmonitor = new CheapMonitor();
		ExpensiveMonitor expensivemonitor = new ExpensiveMonitor();
		
		showVideoOn2K(cheapmonitor);
		showVideoOn4K(expensivemonitor);
		
		showVideoOn4K(new DCI4Kto2Kadapter(cheapmonitor));

	}

}
