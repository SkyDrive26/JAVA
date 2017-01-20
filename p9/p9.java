public class p9{
	public static void main(String[] args){
		
		/* Arrays */
		vorm[] a = new vorm[5];
		a[0] = new tetraeder();
		a[1] = new hexaeder();
		a[2] = new octaeder();
		a[3] = new dodecaeder();
		a[4] = new icosaeder();
		
		vorm[] b = new vorm[5];
		b[0] = new tetraeder(2);
		b[1] = new hexaeder(2);
		b[2] = new octaeder(2);
		b[3] = new dodecaeder(2);
		b[4] = new icosaeder(2);
		
		vorm[] c = new vorm[5];
		c[0] = new tetraeder(3);
		c[1] = new hexaeder(3);
		c[2] = new octaeder(3);
		c[3] = new dodecaeder(3);
		c[4] = new icosaeder(3);
		
		/* Run */
		onderzoeker x = new onderzoeker();
		
		x.maxinhoud(a);
		System.out.println("");
		x.minoppervlakte(b);
		System.out.println("");
		x.maxverhouding(a);
		System.out.println("");
		x.maxverhouding(b);
		System.out.println("");
		x.maxverhouding(c);
		
	}
}