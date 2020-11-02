package observer_method;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
	
	private ClockTimer timer;
	
	public DigitalClock(ClockTimer ct){
		timer = ct;

	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (o == timer){
			draw();
		}
		
	}

	private void draw(){
		int hour = timer.getHour();
		int min = timer.getMin();
		int sec = timer.getSec();
		
		System.out.println("H: " + hour + " M: " + min + " S: " + sec);
	}


}