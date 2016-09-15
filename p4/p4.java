/* Imported Libraries */
import java.util.Scanner;

/* Main class */
public class p4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		/* Faculteit */
		System.out.print("Voer een getal in om de faculteit te berekenen: ");
		int aF = input.nextInt();
		int f = 0;
		
		if(aF != 0){
			for(int i = aF; i >= 1; i--){
				if(f == 0){
					f = i;
				}else{
					f = f*i;
				}
			}
		}else{
			f = 1;
		}
		
		System.out.println("De faculteit van "+aF+" is "+f);
		
	}
}