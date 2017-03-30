public class Recorder{
	
	/* Fields */
	private int totalCrashes = 0;
	private int totalFlapCrashes = 0;
	private int totalPilotCrashes = 0;
	private int totalEngineCrashes = 0;
	
	private final int AANTAL_VLUCHTEN = 1000000;
	
	Airplane[] airplane = new Airplane[AANTAL_VLUCHTEN];
	
	/* Methods */
	public void simulate(){
		for(int i = 0; i < AANTAL_VLUCHTEN; i++){
			airplane[i] = new Airplane();
		
			try{
				airplane[i].flight();
				System.out.println("Flight: #"+(i + 1)+"");
			}catch(CrashException e){
				totalCrashes++;
				System.out.println("Flight: #"+(i + 1)+" Crashed!");
				System.out.println("Cause of crash: "+e.getMessage()+"");
			
				if(e.getMessage().equals("Flaps")){
					totalFlapCrashes++;
				}else if(e.getMessage().equals("Pilot")){
					totalPilotCrashes++;
				}else if(e.getMessage().equals("Engine")){
					totalEngineCrashes++;
				}
			}
		}
	
		System.out.println();
		System.out.println("///////////////////////////Crash Report\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("Total ammount of crashes: "+totalCrashes+"");
		System.out.println("Total ammount of Flapcrashes: "+totalFlapCrashes+"");
		System.out.println("Total ammount of Pilotcrashes: "+totalPilotCrashes+"");
		System.out.println("Total ammount of Enginecrashes: "+totalEngineCrashes+"");
	}
}