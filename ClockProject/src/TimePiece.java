
public interface TimePiece {
	
	// A method that must be implemented to provide feature resetting the time of the clock.
	public void reset();
	
	// A method that must be implemented to get a clock running or ticking per second.
	public void tick();
	
	// A method that must be implemented to display time in a clock at particular instance.
	public void display();
}
