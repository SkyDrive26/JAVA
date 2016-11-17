public class Auto{
	private String kT = "1-SNS-75";
	private int aD = 5;
	private String kL = "Zwart";
	private String mA = "Mercedes";
	private String tP = "AMG";
	private int kM = 310;
	private boolean gR = true;
	private String kS = "Zwart";
	
	public void setKenteken(String n){kT = n;}
	public String getKenteken(){return kT;}
	
	public void setDeuren(int n){aD = n;}
	public int getDeuren(){return aD;}
	
	public void setKleur(String n){kL = n;}
	public String getKleur(){return kL;}
	
	public void setMerk(String n){mA = n;}
	public String getMerk(){return mA;}
	
	public void setType(String n){tP = n;}
	public String getType(){return tP;}
	
	public void setTopsnel(int n){kM = n;}
	public int getTopsnel(){return kM;}
	
	public void setRuiten(boolean n){gR = n;}
	public boolean getRuiten(){return gR;}
	
	public void setStoel(String n){kS = n;}
	public String getStoel(){return kS;}
	
	public void print(){
		System.out.println("Merk: "+mA);
		System.out.println("Type: "+tP);
		System.out.println("Kenteken: "+kT);
		System.out.println("Topsnelheid: "+kM);
		System.out.println("Kleur: "+kL);
		System.out.println("Kleur stoelen: "+kS);
		System.out.println("Getinte ruiten: "+gR);
		System.out.println("Aantal deuren: "+aD);
	}
}