public class Auto extends Vervoersmiddel{
	/* Fields */
	protected String fuel;
	protected int speed;
	
	/* Methods */
	public void setFuel(String a){fuel = a;}
	public String getFuel(){return fuel;}
	
	public void setSpeed(int a){speed = a;}
	public int getSpeed(){return speed;}
	
	public void print(){
		System.out.println("Weight: "+weight);
		System.out.println("Length: "+length);
		System.out.println("Kleur: "+kleur);
		System.out.println("Fueltype: "+fuel);
		System.out.println("Top Speed: "+speed);
	}
}