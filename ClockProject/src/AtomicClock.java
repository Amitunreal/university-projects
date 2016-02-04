
public class AtomicClock extends Clock {

	public AtomicClock(ClockType cType, double driftPerSecond) {
		super(cType, driftPerSecond);
	}

	@Override
	public void display() {
		System.out.println("quantum atomic clock time [" + this.time.actualHour() + ":" + this.time.actualMinute() + ":"
				+ this.time.actualSecond() + "], total drift = " + this.time.getTotalDrift());
	}

}
