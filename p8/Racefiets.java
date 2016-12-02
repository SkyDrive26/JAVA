public class Racefiets extends Fiets{
	
	/* Fields */
	protected String type;
	protected int gear;
	
	/* Methods */
	public void setType(String a){type = a;}
	public String getType(){return type;}
	
	public void setGear(int a){gear = a;}
	public int getGear(){return gear;}
	
	public void print(){
		System.out.println("Weight: "+weight);
		System.out.println("Length: "+length);
		System.out.println("Kleur: "+kleur);
		System.out.println("Gender: "+gender);
		System.out.println("Bel: "+bel);
		System.out.println("Type: "+type);
		System.out.println("Gears: "+gear+"\r\n");
	}
	
}