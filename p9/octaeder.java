public class octaeder extends vorm{
	
	/* Constructors */
	public octaeder(){
		riblengte = 1;
	}
	public octaeder(double x){
		riblengte = x;
	}
	
	/* Methods */
	public double inhoud(){
		return ((1/3)*Math.sqrt(2)*Math.pow(riblengte, 3));
	}
	
	public double oppervlakte(){
		return (2*Math.sqrt(3)*Math.pow(riblengte, 2));
	}
	
	public void print(){
		System.out.println("Vorm: Octaeder");
		System.out.println("Riblengte: "+riblengte);
		System.out.println("Oppervlakte: "+oppervlakte());
		System.out.println("Inhoud: "+inhoud());
	}
}