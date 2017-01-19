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
		return ((1/4)*(15+(7*Math.sqrt(5)))*Math.pow(riblengte, 3));
	}
	
	public double oppervlakte(){
		return (3*Math.sqrt(25+(10*Math.sqrt(5)*Math.pow(riblengte, 2))));
	}
	
	public void print(){
		System.out.println("Vorm: Dodecaeder");
		System.out.println("Riblengte: "+riblengte);
		System.out.println("Oppervlakte: "+oppervlakte());
		System.out.println("Inhoud: "+inhoud());
	}
}