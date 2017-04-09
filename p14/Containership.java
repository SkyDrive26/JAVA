import java.time.LocalTime;

public class Containership {

	private Container[] containers = new Container[100];
	private int currentIndex = -1; 
									
	public Containership() {
		for (int i = 0; i < containers.length; i++)
			containers[i] = new Container(i + 1);
	}

	public synchronized boolean shipEmpty() {
		if (currentIndex > 98)
			return true;
		else
			return false;
	}

	public synchronized void incrementShipContainerIndex() {
		currentIndex++;
	}

	public Container removeContainerFromShip() {
		LocalTime time = LocalTime.now();
		Container container = containers[currentIndex];
		containers[currentIndex] = null;
		System.out.println("["+ time.toString() + "] Schip: Container " + container.getVolgnummer() + " gegeven.");
		return container;
	}

}
