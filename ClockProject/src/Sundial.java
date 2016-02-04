
public class Sundial extends Clock {

	public Sundial(ClockType cType, double driftPerSecond) {
		super(cType, driftPerSecond);
	}

	@Override
	public void display() {
		System.out.println("natural sun dial time [" + this.time.actualHour() + ":" + this.time.actualMinute() + ":"
				+ this.time.actualSecond() + "], total drift = " + this.time.getTotalDrift());
	}

}
