public class Auto{
	
	/* Fields */
	private String naam;
	
	/* Constructors */
	public Auto(String a){naam = a;}
	
	/* Methodes */
	public void setNaam(String a){naam = a;}
	public String getNaam(){return naam;}
	
	public void print(){
		System.out.println(naam+"\r\n");
	}
}