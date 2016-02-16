/**
 * 
 * @author Jace Brady
 * 
 * This is a type of clock which is digital in nature.
 * The amount of drift in this type of clock is 0.000034722
 *
 */
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
