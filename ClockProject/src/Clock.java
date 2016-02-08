
abstract class Clock implements TimePiece {

	private ClockType clockType;
	protected Time time;

	public Clock(ClockType cType, double driftPerSecond) {
		setClockType(cType);
		time = new Time(0, 0, 0, driftPerSecond);
	}

	@Override
	public void reset() {
		time.resetToStartTime();
	}

	@Override
	public void tick() {
		time.incrementTime();
	}

	@Override
	public abstract void display();

	public ClockType getClockType() {
		return clockType;
	}

	public void setClockType(ClockType clockType) {
		this.clockType = clockType;
	}
	
	public enum ClockType {
		natural,

		digital,

		mechanical,

		quantum;
	}

}