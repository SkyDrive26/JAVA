public class tetraeder extends vorm{
	
	/* Constructors */
	public tetraeder(){
		riblengte = 1;
	}
	public tetraeder(double x){
		riblengte = x;
	}
	
	/* Methods */
	public double inhoud(){
		return ((1d/12d)*Math.pow(riblengte, 3)*Math.sqrt(2d));
	}
	
	public double oppervlakte(){
		return (Math.pow(riblengte, 2)*Math.sqrt(3d));
	}
	
	public void print(){
		System.out.println("Vorm: Tetraeder");
		System.out.println("Riblengte: "+riblengte);
		System.out.println("Oppervlakte: "+oppervlakte());
		System.out.println("Inhoud: "+inhoud());
	}
}