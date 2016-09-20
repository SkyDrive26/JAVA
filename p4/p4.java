import java.util.Scanner;

public class k {
    static public int Faculteit(int aF){
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
		return f;
    }
    
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        System.out.print("Voer variablen a in: ");
        int a = input.nextInt();
        System.out.print("Voer variablen b in: ");
        int b = input.nextInt();
        System.out.print("Voer variablen n in: ");
        int n = input.nextInt();
        System.out.println("A=" + a + " B=" + b + " N=" + n+"\n");
        
        int sum = 0;
        
        for(int k = 0; k<=n; k++){
			int tempNK = n-k;
			float binom = (Faculteit(n)) / (Faculteit(k)*Faculteit(tempNK));
            
            System.out.println("\n"+n + "!/" + k + "!("+n+ "-"+k+")! = " +binom);
            
            int temp = (n-k);
            sum += (binom*(Math.pow(a,k)*Math.pow(b,temp)));
        }
        System.out.print("\nHet antwoord is: "+ sum);
    }
}

