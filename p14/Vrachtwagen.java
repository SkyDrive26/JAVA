import java.time.LocalTime;

public class Vrachtwagen extends Thread {

	private char vrachtwagenId;
	private boolean running = true;
	private Container container;

	private Containership ship;
	private Kade kade;

	public Vrachtwagen(char id) {
		this.vrachtwagenId = id;
	}

	@Override
	public void run() {
		LocalTime time = LocalTime.now();
		System.out.println("["+ time.toString() + "] Vrachtwagen " + vrachtwagenId + ": will container ophalen...");

		while (running) {
			do {
				container = kade.removeContainerToVrachtwagen();
			} while (container == null);

			print(container.getVolgnummer());

			try {
				Thread.sleep(calculate());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				container = null;
				System.out.println("["+ time.toString() + "] Vrachtwagen " + vrachtwagenId + ": will container ophalen...");
			}

			if (ship.shipEmpty() && kade.kadeEmpty())
				running = false;
		}

	}

	private long calculate() {
		return (long) ((Math.random() * 7) + 1) * 1000;
	}

	private void print(int i) {
		LocalTime time = LocalTime.now();
		System.out.println("["+ time.toString() + "] Vrachtwagen " + vrachtwagenId + ": Container " + i + " opgehaald.. wegrijden...");
	}

	public void setShip(Containership ship) {
		this.ship = ship;
	}

	public void setKade(Kade kade) {
		this.kade = kade;
	}

}
