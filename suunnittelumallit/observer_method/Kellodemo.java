package observer_method;

import java.util.concurrent.TimeUnit;

public class Kellodemo {

	public static void main(String[] args) throws InterruptedException {
		
		ClockTimer timer = new ClockTimer();
		
		DigitalClock digitalClock = new DigitalClock(timer);
		
		timer.addObserver(digitalClock);

		while(true) {
			TimeUnit.SECONDS.sleep(1);
			timer.tick();
		}
		
		
	}
}
