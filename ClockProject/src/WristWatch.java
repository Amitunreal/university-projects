
public class WristWatch extends Clock {

	public WristWatch(ClockType cType, double driftPerSecond) {
		super(cType, driftPerSecond);
	}

	@Override
	public void display() {
		System.out.println("digital wrist watch time [" + this.time.actualHour() + ":" + this.time.actualMinute() + ":"
				+ this.time.actualSecond() + "], total drift = " + this.time.getTotalDrift());
	}

}
