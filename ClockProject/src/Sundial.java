
public class Sundial extends Clock {

	public Sundial(ClockType cType, double driftPerSecond) {
		super(cType, driftPerSecond);
	}

	@Override
	public void display() {
		System.out.println(String.format("%45s%.2f",
				this.getClockType() + " sun dial time [" + this.time.formattedReportedTime() + "], total drift = ",
				this.time.getTotalDrift()) + " seconds");
	}

}
