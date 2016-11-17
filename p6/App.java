import java.util.Random;

public class App{
	public static void main(String[] args){
		Auto[] i = new Auto[5];
		
		for(int a = 0; a < 5; a++){
			i[a] = new Auto();
			
			Random rand = new Random();
			i[a].setTopsnel(rand.nextInt(350 - 200 +1) + 200);
			
			i[a].print();
			System.out.println("");
		}
		
		System.out.println("Fastest car:");
		hSpeed(i).print();
	}
	
	public static Auto hSpeed(Auto[] p){
		int[] h = {0, 0};
		for (int a = 0; a < 5; a++){
			if (p[a].getTopsnel() > h[1]){
				h[0] = a;
				h[1] = p[a].getTopsnel();
			}
		}
		return p[h[0]];
	}
}
