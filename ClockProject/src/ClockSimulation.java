
public class ClockSimulation {

	private Bag<Clock> bag;
	
	public ClockSimulation() {
		bag = new Bag<>();
		bag.add(new AtomicClock(ClockType.quantum, 0.0));
	}

}
