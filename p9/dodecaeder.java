public class dodecaeder extends vorm{
	
	/* Constructors */
	public dodecaeder(){
		riblengte = 1;
	}
	public dodecaeder(double x){
		riblengte = x;
	}
	
	/* Methods */
	public double inhoud(){
		return ((1d/4d)*(15d+(7d*Math.sqrt(5d)))*Math.pow(riblengte, 3));
	}
	
	public double oppervlakte(){
		return (3d*Math.sqrt(25d+(10d*Math.sqrt(5d)*Math.pow(riblengte, 2))));
	}
	
	public void print(){
		System.out.println("Vorm: Dodecaeder");
		System.out.println("Riblengte: "+riblengte);
		System.out.println("Oppervlakte: "+oppervlakte());
		System.out.println("Inhoud: "+inhoud());
	}
}