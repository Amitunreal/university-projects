
public class GrandfatherClock extends Clock {

	public GrandfatherClock(ClockType cType, double driftPerSecond) {
		super(cType, driftPerSecond);
	}

	@Override
	public void display() {
		System.out
				.println("mechanical grandfather clock time [" + this.time.actualHour() + ":" + this.time.actualMinute()
						+ ":" + this.time.actualSecond() + "], total drift = " + this.time.getTotalDrift());
	}

}
