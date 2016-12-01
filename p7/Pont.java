public class Pont{
	
	/* Fields */
	private Auto auto;
	private String naam;
	private String locatie = "water";
	
	/* Constructors */
	public Pont(String a){naam = a;}
	
	/* Methodes */
	public void setAuto(Auto a){auto = a;}
	public Auto getAuto(){return auto;}
	
	public void setNaam(String a){naam = a;}
	public String getNaam(){return naam;}
	
	public void setLocatie(String a){locatie = a;}
	public String getLocatie(){return locatie;}
	
	public void print(){
		if(auto == null){
			System.out.println("Er staat geen auto op de pont;"+"\r\n");
		}else{
			System.out.println("De auto "+auto.getNaam()+" staat op de pont!"+"\r\n");
		}
	}
	
}