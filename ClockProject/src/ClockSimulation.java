/**
 * 
 * @author Jace Brady
 * 
 *         ClockSimulation class is responsible for providing all the
 *         instructions that are required to test the project and provide the
 *         out put in s specific format.
 *
 */
public class ClockSimulation {

	// A bag that will contain instance of each type of clock. [POLYMORPHISM]
	private Bag<Clock> bag;

	/**
	 * Constructor of ClockSimulation Responsible for creation of each type of
	 * clock instances and adding them into a container called bag
	 */
	public ClockSimulation() {
		bag = new Bag<>();
		bag.add(new AtomicClock(Clock.ClockType.quantum, 0.0));
		bag.add(new WristWatch(Clock.ClockType.digital, 0.000034722));
		bag.add(new GrandfatherClock(Clock.ClockType.mechanical, 0.00034722));
		bag.add(new CuckooClock(Clock.ClockType.mechanical, 0.000694444));
		bag.add(new Sundial(Clock.ClockType.natural, 0.0));
	}

	public static void main(String[] args) {
		ClockSimulation cs = new ClockSimulation(); // Instance of
													// ClockSimulation class
		while (!cs.bag.isEmpty()) { // Check whether bag is empty
			Clock c = cs.bag.remove(); // Removes a clock one by one
			System.out.println("*** Clock Simulations, Drift Per Second: " + c.time.getDriftPerSecond() + " ***\n");
			printOutput(c, "starting  ", 0);
			printOutput(c, "after 1 day  ", 86400);
			printOutput(c, "after 1 week  ", 604800);
			printOutput(c, "after 1 month  ", 2592000);
			printOutput(c, "after 1 year  ", 31536000);
			System.out.println();
		}
	}

	/**
	 * 
	 * @param c
	 *            The instance of a clock
	 * @param st
	 *            A string that must be prepended before calling display method
	 *            of a particular clock
	 * @param seconds
	 *            The amount of time in seconds for which a particular clock
	 *            must tick before displaying the time
	 */
	public static void printOutput(Clock c, String st, int seconds) {
		System.out.print(String.format("%15s", st));
		for (int i = 0; i < seconds; i++)
			c.tick(); // Tick the clock for one second
		c.display(); // Display the clock's time in specific manner
		c.reset(); // Reset the time of a clock
	}
}
