public class Oever{
	
	/* Fields */
	private String naam;
	private Auto auto;
	private Pont pont;
	
	/* Constructors */
	public Oever(String a){naam = a;}
	
	/* Methodes */
	public void setNaam(String a){naam = a;}
	public String getNaam(String a){return naam;}
	
	public void setAuto(Auto a){auto = a;}
	public Auto getAuto(){return auto;}
	
	public void setPont(Pont a){pont = a;}
	public Pont getPont(){return pont;}
	
	public void print(){
		if(auto == null){
			System.out.println("Er staat geen auto aan deze oever!");
		}else{
			System.out.println("De auto "+auto.getNaam()+ " staat aan de "+naam+" oever");
		}
		
		// Pont is misschien nog niet goed!
		if(pont == null){
			System.out.println("Er ligt geen pont aan de "+naam+" oever!"+"\r\n");
		}else{
			System.out.println("Er ligt een pont aan de "+naam+" oever!"+"\r\n");
		}
	}
	
}