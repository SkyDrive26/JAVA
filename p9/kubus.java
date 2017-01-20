public class kubus extends vorm{
	
	/* Constructors */
	public kubus(){
		riblengte = 1;
	}
	public kubus(double x){
		riblengte = x;
	}
	
	/* Methods */
	public double inhoud(){
		return Math.pow(riblengte, 3);
	}
	
	public double oppervlakte(){
		return (6d*Math.pow(riblengte, 2));
	}
	
	public void print(){
		System.out.println("Vorm: Kubus");
		System.out.println("Riblengte: "+riblengte);
		System.out.println("Oppervlakte: "+oppervlakte());
		System.out.println("Inhoud: "+inhoud());
	}
}