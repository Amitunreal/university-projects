/**
 * 
 * @author Jace Brady 
 * 
 * This is a Parent Clock class responsible for ticking of a
 * clock and resetting its value to a defined time.
 *
 */
abstract class Clock implements TimePiece {

	private ClockType clockType;
	protected Time time;

	public Clock(ClockType cType, double driftPerSecond) {
		setClockType(cType);
		time = new Time(0, 0, 0, driftPerSecond);
	}

	@Override
	/**
	 * A method responsible for resetting time of a particular 
	 * clock and inherited from the TimePiece interface
	 */
	public void reset() {
		time.resetToStartTime();
	}

	@Override
	/**
	 * A method responsible for ticking of a particular 
	 * clock with a period of one second and is inherited 
	 * from the TimePiece interface
	 */
	public void tick() {
		time.incrementTime();
	}

	@Override
	/**
	 * And abstract method which supposed to display time of a clock 
	 * at particular instance and must be implemented by each type of clock.
	 */
	public abstract void display();

	// Getter for clock type of a Clock
	public ClockType getClockType() {
		return clockType;
	}

	// Setter for clock tpe of a Clock
	public void setClockType(ClockType clockType) {
		this.clockType = clockType;
	}

	/**
	 * ClockType : a public enumeration
	 * this enumeration contains all the possible clock types
	 * mentioned in this project
	 */
	public enum ClockType {
		natural,

		digital,

		mechanical,

		quantum;
	}

}