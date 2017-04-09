import java.time.LocalTime;

public class Kade {

	private Container[] containers = new Container[5];

	public Kade() {
	}

	public synchronized int getIndexOfFreeSpotOnKade() {
		for (int i = 0; i < containers.length; i++) {
			if (containers[i] == null) {
				return i;
			}
		}
		return -1;
	}

	public void addContainerOnKade(int i, Container container) {
		containers[i] = container;
		print(container, i);
	}

	public synchronized Container removeContainerToVrachtwagen() {
		for (int i = 0; i < containers.length; i++) {
			if (containers[i] != null) {
				Container container = containers[i];
				containers[i] = null;
				print(container);
				return container;
			}
		}
		return null;
	}

	public synchronized boolean kadeEmpty() {
		int counter = 0;
		for (int i = 0; i < containers.length; i++) {
			if (containers[i] == null)
				counter++;
		}
		if (counter == 5)
			return true;
		else
			return false;
	}

	private void print(Container container) {
		LocalTime time = LocalTime.now();
		System.out.println("["+ time.toString() + "] Kade: Container " + container.getVolgnummer() + " gegeven.");
	}

	private void print(Container container, int i) {
		LocalTime time = LocalTime.now();
		System.out.println("["+ time.toString() + "] Kade: Container " + container.getVolgnummer() + " ontvangen op plaats " + (i + 1) + ".");
	}

}
