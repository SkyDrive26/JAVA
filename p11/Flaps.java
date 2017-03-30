public class Flaps{
	
	/* Fields */
	private double randomNumber = Math.random();
	private final double FAAL_KANS_FLAP = 0.0005;
	
	/* Methods */
	public double getRandom(){
		return randomNumber;
	}
	
	public void bereken() throws FlapException{
		if(randomNumber <= FAAL_KANS_FLAP){
			throw new FlapException();
		}
	}
}