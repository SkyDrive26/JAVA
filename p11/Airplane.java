public class Airplane{
	
	/* Fields */
	private Engine[] engine = new Engine[4];
	private Flaps[] flaps = new Flaps[2];
	private Pilot[] pilot = new Pilot[3];
	
	/* Constructive */
	public Airplane(){
		for(int i = 0; i < 2; i++){
			flaps[i] = new Flaps();
		}
	
		for(int i = 0; i < 3; i++){
			pilot[i] = new Pilot();
		}
		
		for(int i = 0; i < 4; i++){
			if(i < 2){
				engine[i] =  new Engine(false);
			}else{
				engine[i] = new Engine(true);
			}
		}
	}
	
	/* Methods */
	public void flight() throws CrashException {
		if(flapCrash(flaps)){
			throw new CrashException("Flaps");
		}else if(pilotCrash(pilot)){
			throw new CrashException("Pilot");
		}else if(engineCrash(engine)){
			throw new CrashException("Engine");
		}
	}
	
	public boolean flapCrash(Flaps[] x){
		int failCounter = 0;
		
		for(int i = 0; i < 2; i++){
			try{
				//System.out.println("Random: "+x[i].getRandom()+"");
				x[i].bereken();
			}catch(FlapException e){
				failCounter++;
			}
		}
		
		if(failCounter == 2){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean pilotCrash(Pilot[] x){
		int failCounter = 0;
		
		for(int i = 0; i < 3; i++){
			try{
				//System.out.println("Random: "+x[i].getRandom()+"");
				x[i].bereken();
			}catch(PilotException e){
				failCounter++;
			}
		}
		
		if(failCounter == 2){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean engineCrash(Engine[] x){
		int failCounterBinnen = 0;
		int failCounterBuiten = 0;
		
		for(int i = 0; i < 4; i++){
			try{
				//System.out.println("Random: "+x[i].getRandom()+"");
				x[i].bereken();
			}catch(EngineException e){
				if (e.getMessage().equals("binnen")){
					failCounterBinnen++;
				}else if(e.getMessage().equals("buiten")){
					failCounterBuiten++;
				}
			}
		}
		
		if(failCounterBinnen == 2 && failCounterBuiten > 0){
			return true;
		}else{
			return false;
		}
	}
}