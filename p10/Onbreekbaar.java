public interface Onbreekbaar{
	/*
		opent de kluis en geeft de waarde true terug,
		gesteld dat de code juist is.
		In alle andere gevallen wordt false teruggegeven.
	*/
	public boolean open(String code);

	/*
		sluit de kluis
	*/
	public void sluit();
	/*
		Geeft de informatie terug die in het betreffende
		compartiment te vinden is. Indien het compartiment leeg
		is, wordt null teruggegeven.
	*/
	public String haalop(int comp);
}