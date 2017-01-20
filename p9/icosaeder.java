public class icosaeder extends vorm{
	
	/* Constructors */
	public icosaeder(){
		riblengte = 1;
	}
	public icosaeder(double x){
		riblengte = x;
	}
	
	/* Methods */
	public double inhoud(){
		return ((5d/12d)*(3d+Math.sqrt(5d))*Math.pow(riblengte, 3));
	}
	
	public double oppervlakte(){
		return (5d*Math.sqrt(3d)*Math.pow(riblengte, 2));
	}
	
	public void print(){
		System.out.println("Vorm: Icosaeder");
		System.out.println("Riblengte: "+riblengte);
		System.out.println("Oppervlakte: "+oppervlakte());
		System.out.println("Inhoud: "+inhoud());
	}
}