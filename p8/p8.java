import java.util.Random;

public class p8{
	public static void main(String[] args){
		Vervoersmiddel[] i = new Vervoersmiddel[10];
		
		for(int a = 0; a < 3; a++){
			i[a] = new Auto();
			Random rand = new Random();
			i[a].setWeight(rand.nextInt(350 - 200 +1) + 200);
			i[a].print();
			System.out.println("");
		}
		for(int a = 3; a < 6; a++){
			i[a] = new Raceauto();
			Random rand = new Random();
			i[a].setWeight(rand.nextInt(350 - 200 +1) + 200);
			i[a].print();
			System.out.println("");
		}
		for(int a = 6; a < 9; a++){
			i[a] = new Racefiets();
			Random rand = new Random();
			i[a].setWeight(rand.nextInt(350 - 200 +1) + 200);
			i[a].print();
			System.out.println("");
		}

		i[9] = new Fiets();
		Random rand = new Random();
		i[9].setWeight(rand.nextInt(350 - 200 +1) + 200);
		i[9].print();
		System.out.println("");
		
		System.out.println("Zwaarst: ");
		hWeight(i).print();
		
		System.out.println("\r\nLichtst: ");
		lWeight(i).print();
	}
	
	public static Vervoersmiddel hWeight(Vervoersmiddel[] p){
		int[] h = {0, 0};
		for (int a = 0; a < 10; a++){
			if (p[a].getWeight() > h[1]){
				h[0] = a;
				h[1] = p[a].getWeight();
			}
		}
		return p[h[0]];
	}
	
	public static Vervoersmiddel lWeight(Vervoersmiddel[] p){
		int[] h = {0, 0};
		for (int a = 0; a < 10; a++){
			if (h[1] != 0){
				if (p[a].getWeight() < h[1]){
					h[0] = a;
					h[1] = p[a].getWeight();
				}
			}else{
				h[0] = a;
				h[1] = p[a].getWeight();
			}
		}
		return p[h[0]];
	}
}