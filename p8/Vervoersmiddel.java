public class Vervoersmiddel{
	
	/* Fields */
	protected int weight;
	protected int length;
	protected String kleur;
	
	/* Methods */
	public void setWeight(int a){weight = a;}
	public int getWeight(){return weight;}
	
	public void setLength(int a){length = a;}
	public int getLength(){return length;}
	
	public void setKleur(String a){kleur = a;}
	public String getKleur(){return kleur;}
	
	public void print(){
		System.out.println("Weight: "+weight);
		System.out.println("Length: "+length);
		System.out.println("Kleur: "+kleur+"\r\n");
	}
	
}