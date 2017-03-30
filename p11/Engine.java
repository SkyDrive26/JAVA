public class Engine{
	
	/* Fields */
	private double randomNumber = Math.random();
	private final double FAAL_KANS_ENGINE = 0.001;
	private boolean binnenMotor;
	
	/* Constructors */
	public Engine(boolean x){
		binnenMotor = x;
	}
	
	/* Methods */
	public double getRandom(){
		return randomNumber;
	}
	
	public boolean getMotor(){
		return binnenMotor;
	}
	
	public void bereken() throws EngineException{
		if(randomNumber <= FAAL_KANS_ENGINE && binnenMotor){
			throw new EngineException("binnen");
		}else if(randomNumber <= FAAL_KANS_ENGINE && !binnenMotor){
			throw new EngineException("buiten");
		}
	}
}