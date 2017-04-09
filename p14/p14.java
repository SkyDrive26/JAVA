public class App {

	private Containership ship = new Containership();
	private Kraan[] kranen = new Kraan[2];
	private Kade kade = new Kade();
	private Vrachtwagen[] vrachtwagens = new Vrachtwagen[3];

	public p14() {
		char[] vrachtwagenId = { 'A', 'B', 'C' };

		for (int i = 0; i < kranen.length; i++) {
			kranen[i] = new Kraan(i + 1);
			kranen[i].setShip(ship);
			kranen[i].setKade(kade);

			kranen[i].start();
		}

		for (int i = 0; i < vrachtwagens.length; i++) {
			vrachtwagens[i] = new Vrachtwagen(vrachtwagenId[i]);
			vrachtwagens[i].setShip(ship);
			vrachtwagens[i].setKade(kade);

			vrachtwagens[i].start();
		}
	}

	public static void main(String[] args) {
		new p14();
	}

}
