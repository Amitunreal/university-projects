
public class CuckooClock extends Clock {

	public CuckooClock(ClockType cType, double driftPerSecond) {
		super(cType, driftPerSecond);
	}

	@Override
	public void display() {
		System.out.println("mechanical cuckoo clock time [" + this.time.actualHour() + ":" + this.time.actualMinute()
				+ ":" + this.time.actualSecond() + "], total drift = " + this.time.getTotalDrift());
	}

}
