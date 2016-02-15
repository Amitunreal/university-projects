
public class CuckooClock extends Clock {

	public CuckooClock(ClockType cType, double driftPerSecond) {
		super(cType, driftPerSecond);
	}

	@Override
	public void display() {
		System.out
				.println(String
						.format("%45s%.2f", this.getClockType() + " cuckoo clock time ["
								+ this.time.formattedReportedTime() + "], total drift = ", this.time.getTotalDrift())
				+ " seconds");
	}

}
