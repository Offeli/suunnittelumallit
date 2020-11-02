package observer_method;
import java.util.Observable;

public class ClockTimer extends Observable implements Runnable {
	
	private int hour;
	private int min;
	private int sec;
	
	public ClockTimer() {
		super();
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	
	public int getHour() {
		return hour;
	}

	public int getMin() {
		return min;
	}
	
	public int getSec() {
		return sec;
	}
	
	void tick() {
		if(min == 59 && sec == 59) {
			hour ++;
			min = 0;
			sec = 0;
		} else if (sec == 59) {
			min ++;
			sec = 0;
		} else {
			sec ++;
		}

		setChanged();
		notifyObservers();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
