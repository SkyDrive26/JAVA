public class p7{

	public static void main(String[] arg){
		
		Auto mini = new Auto("Mini Cooper");
		Oever links = new Oever("links");
		Oever rechts = new Oever("rechts");
		Pont sonoy = new Pont("Sonoy");
		
		links.setAuto(mini);
		
		mini.print();
		links.print();
		rechts.print();
		sonoy.print();
		
		
		
	}
}