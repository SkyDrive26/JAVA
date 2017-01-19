public class p9{
	public static void main(String[] args){
		
		/* Arrays */
		vorm[] a = new vorm[4];
		//a[0] = new tetraeder();
		a[0] = new hexaeder();
		a[1] = new octaeder();
		a[2] = new dodecaeder();
		a[3] = new icosaeder();
		
		vorm[] b = new vorm[4];
		//b[0] = new tetraeder(2);
		b[0] = new hexaeder(2);
		b[1] = new octaeder(2);
		b[2] = new dodecaeder(2);
		b[3] = new icosaeder(2);
		
		vorm[] c = new vorm[4];
		//c[0] = new tetraeder(3);
		c[0] = new hexaeder(3);
		c[1] = new octaeder(3);
		c[2] = new dodecaeder(3);
		c[3] = new icosaeder(3);
		
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