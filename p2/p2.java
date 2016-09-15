/* Imported Libraries */
import java.util.Scanner;

/* Main */
public class p2{
	public static void main(String[] args){
		Scanner reading = new Scanner (System.in);
		
		float[] aP = {0, 0};
		float[] bP = {0, 0};
		
		System.out.print("Voer X van punt a in: ");
		aP[0] = reading.nextInt();
		
		System.out.print("\rVoer Y van punt a in: ");
		aP[1] = reading.nextInt();
		
		System.out.print("\rVoer X van punt b in: ");
		bP[0] = reading.nextInt();
		
		System.out.print("\rVoer Y van punt b in: ");
		bP[1] = reading.nextInt();

		System.out.println("Punt A is: ("+aP[0]+", "+aP[1]+")" );
		System.out.println("Punt B is: ("+bP[0]+", "+bP[1]+")" );
		
		// y = ax+b
		float dX = (bP[0] - aP[0]);
		float dY = (bP[1] - aP[1]);
		
		if(dX != 0 && aP[0] != bP[0]){
			float a = (bP[1] - aP[1])/(bP[0] - aP[0]); // a = dy/dx
			
			float aX = a*aP[0]; 
			float b = aP[1] - aX;  // b = y - ax
			
			System.out.println("De formule: y = "+a+"x+"+b+" heeft als richitng: "+a+" en als snijpunt met de Y-as: "+b);
		}else{
			System.out.println("Opgegeven punten geven geen geen lineaire formule.");
		}
		
	}
}