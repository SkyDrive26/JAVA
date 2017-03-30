public class Pilot{
	
	/* Fields */
	private double randomNumber = Math.random();
	private final double FAAL_KANS_PILOT = 0.005;
	
	/* Methods */
	public double getRandom(){
		return randomNumber;
	}
	
	public void bereken() throws PilotException{
		if(randomNumber <= FAAL_KANS_PILOT){
			throw new PilotException();
		}
	}
}