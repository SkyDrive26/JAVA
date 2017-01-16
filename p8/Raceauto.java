public class Raceauto extends Auto{
	
	/* Fields */
	protected int horsepower;
	protected int gears;
	
	/* Methods */
	public void setHorsepower(int a){horsepower = a;}
	public int getHorsepower(){return horsepower;}
	
	public void setGears(int a){gears = a;}
	public int getGears(){return gears;}
	
	public void print(){
		System.out.println("Weight: "+weight);
		System.out.println("Length: "+length);
		System.out.println("Kleur: "+kleur);
		System.out.println("Fueltype: "+fuel);
		System.out.println("Top Speed: "+speed);
		System.out.println("Horsepower: "+horsepower);
		System.out.println("Gears: "+gears);
	}
}