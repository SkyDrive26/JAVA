public class hexaeder extends vorm{
	
	/* Constructors */
	public hexaeder(){
		riblengte = 1;
	}
	public hexaeder(double x){
		riblengte = x;
	}
	
	/* Methods */
	public double inhoud(){
		return (Math.pow(riblengte, 3));
	}
	
	public double oppervlakte(){
		return (6d*Math.pow(riblengte, 2));
	}
	
	public void print(){
		System.out.println("Vorm: Hexaeder");
		System.out.println("Riblengte: "+riblengte);
		System.out.println("Oppervlakte: "+oppervlakte());
		System.out.println("Inhoud: "+inhoud());
	}
}