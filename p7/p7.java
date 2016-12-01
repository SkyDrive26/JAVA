public class p7{

	public static void main(String[] arg){
		
		Auto mini = new Auto("Mini Cooper");
		Oever links = new Oever("linker");
		Oever rechts = new Oever("rechter");
		Pont sonoy = new Pont("Sonoy");
		
		links.setAuto(mini);
		links.print();
		
		links.setPont(sonoy);
		links.print();
		sonoy.print();
		
		sonoy.setAuto(links.getAuto());
		links.setAuto(null);
		sonoy.print();
		links.print();
		
		links.setPont(null);
		rechts.setPont(sonoy);
		rechts.setAuto(sonoy.getAuto());
		sonoy.setAuto(null);
		links.print();
		rechts.print();
		sonoy.print();
		
	}
}