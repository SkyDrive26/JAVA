import java.time.LocalTime;

public class Kraan extends Thread {

	private int kraanId;
	private boolean running = true;
	private Container container;

	private Containership ship;
	private Kade kade;
	private int kadeIndexForKraan = -1;

	public Kraan(int id) {
		this.kraanId = id;
	}

	@Override
	public void run() {
		LocalTime time = LocalTime.now();
		System.out.println("["+ time.toString() + "] Kraan " + kraanId + ": will container halen...");

		while (running) {
			ship.incrementShipContainerIndex();
			container = ship.removeContainerFromShip();

			try {
				Thread.sleep(calculate());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			do {
				kadeIndexForKraan = kade.getIndexOfFreeSpotOnKade();
			} while (kadeIndexForKraan == -1);
											
			kade.addContainerOnKade(kadeIndexForKraan, container);
			container = null;

			System.out.println("["+ time.toString() + "] Kraan " + kraanId + ": will container halen...");

			if (ship.shipEmpty())
				running = false;
		}

	}

	private long calculate() {
		return (long) ((Math.random() * 5) + 1) * 1000;
	}

	public void setShip(Containership ship) {
		this.ship = ship;
	}

	public void setKade(Kade kade) {
		this.kade = kade;
	}

}
