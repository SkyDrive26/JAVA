public class p10{
	public static void main(String[] args){
		Letters foo = new Letters("akuehgopl");
	
		foo.print();
		System.out.println("");
		foo.sorteer();
		foo.print();
		System.out.println("\r\n"+foo.oplopend());
		System.out.println(foo.aflopend()+"\r\n");
		foo.draaiom();
		foo.print();
		System.out.println(foo.oplopend());
		System.out.println(foo.aflopend());
		
		int[] a = {8,3,7,4,0,1,9,2};
		
		Geheel cake = new Geheel(a);
		
		cake.print();
		System.out.println("");
		cake.sorteer();
		cake.print();
		System.out.println("\r\n"+cake.oplopend());
		System.out.println(cake.aflopend()+"\r\n");
		cake.draaiom();
		cake.print();
		System.out.println(cake.oplopend());
		System.out.println(cake.aflopend());
	}
}