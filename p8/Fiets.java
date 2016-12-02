public class Fiets extends Vervoersmiddel{

	/* Fields */
	protected String gender;
	protected boolean bel = false;
	
	/* Methods */
	public void setGender(String a){gender = a;}
	public String getGender(){return gender;}
	
	public void setBel(boolean a){bel = a;}
	public boolean getBel(){return bel;}
	
	public void print(){
		System.out.println("Weight: "+weight);
		System.out.println("Length: "+length);
		System.out.println("Kleur: "+kleur);
		System.out.println("Gender: "+gender);
		System.out.println("Bel: "+bel+"\r\n");
	}
	
}