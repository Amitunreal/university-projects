public class ClockSimulation {

	private Bag<Clock> bag;

	public ClockSimulation() {
		bag = new Bag<>();
		bag.add(new AtomicClock(Clock.ClockType.quantum, 0.0));
		bag.add(new WristWatch(Clock.ClockType.digital, 0.000034722));
		bag.add(new GrandfatherClock(Clock.ClockType.mechanical, 0.00034722));
		bag.add(new CuckooClock(Clock.ClockType.mechanical, 0.000694444));
		bag.add(new Sundial(Clock.ClockType.natural, 0.0));
	}

	public static void main(String[] args) {
		ClockSimulation cs = new ClockSimulation();
		while (!cs.bag.isEmpty()) {
			Clock c = cs.bag.remove();
			System.out.println("*** Clock Simulations, Drift Per Second: " + c.time.getDriftPerSecond() + " ***\n");
			printOutput(c, "starting  ", 0);
			printOutput(c, "after 1 day  ", 86400);
			printOutput(c, "after 1 week  ", 604800);
			printOutput(c, "after 1 month  ", 2592000);
			printOutput(c, "after 1 year  ", 31536000);
			System.out.println();
		}
	}

	public static void printOutput(Clock c, String st, int seconds) {
		System.out.print(String.format("%15s", st));
		for (int i = 0; i < seconds; i++)
			c.tick();
		c.display();
		c.reset();
	}
}
