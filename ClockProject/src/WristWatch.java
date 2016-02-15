
public class WristWatch extends Clock {
	public WristWatch(ClockType cType, double drift) {
		super(cType, drift);
	}

	@Override
	public void display() {
		System.out
				.println(String
						.format("%45s%.2f", this.getClockType() + " wrist watch time ["
								+ this.time.formattedReportedTime() + "], total drift = ", this.time.getTotalDrift())
				+ " seconds");
	}

}
