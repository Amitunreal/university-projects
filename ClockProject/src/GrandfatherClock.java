
public class GrandfatherClock extends Clock {

	public GrandfatherClock(ClockType cType, double driftPerSecond) {
		super(cType, driftPerSecond);
	}

	@Override
	public void display() {
		System.out.println(String
				.format("%45s%.2f", this.getClockType() + " grandfather clock time ["
						+ this.time.formattedReportedTime() + "], total drift = ", this.time.getTotalDrift())
				+ " seconds");
	}

}
