/* Imported Libraries */
import java.util.Scanner;

/* Main */
public class p2{
	public static void main(String[] args){
		Scanner reading = new Scanner (System.in);
		
		float[] aP = {0, 0};
		float[] bP = {0, 0};
		
		System.out.println("Voer X van ount a in: ");
		aP[0] = reading.nextInt();
		
		System.out.println("Voer Y van punt a in: ");
		aP[1] = reading.nextInt();
		
		System.out.println("Voer X van ount b in: ");
		bP[0] = reading.nextInt();
		
		System.out.println("Voer Y van punt b in: ");
		bP[1] = reading.nextInt();
		
		System.out.println("Punt A is: ("+aP[0]+", "+aP[1]+")" );
		System.out.println("Punt B is: ("+bP[0]+", "+bP[1]+")" );
		
		// y = ax+b
		
		float a = (bP[1] - aP[1])/(bP[0] - aP[0]); // a = dy/dx

		if (Float.isInfinite(a) || Float.isNaN(a)){
			System.out.println("Opgegeven punten geven geen geen lineaire formule.\n");
		}else{
			float aX = a*aP[0]; 
			float b = aP[1] - aX;  // b = y - ax
			
			System.out.println("De formule: y = "+a+"x+"+b+" heeft als richitng: "+a+" en als snijpunt met de Y-as: "+b+"\n");
		}
	}
}