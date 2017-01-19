public abstract class vorm{
	
	/* FIELDS */
	protected double riblengte;
	
	/* Constructors */
	public vorm(){
		riblengte = 1;
	}
	public vorm(double x){
		riblengte = x;
	}
	
	/* Mehtods */
	public double getRiblengte(){return riblengte;}
	public void setRiblengte(double x){riblengte = x;}
	
	public abstract double inhoud();
	public abstract double oppervlakte();
	public abstract void print();
}