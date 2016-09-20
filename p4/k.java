
import java.util.Scanner;

class opd4 {

static Scanner input = new Scanner(System.in);

    static public int Faculty(int x){
        int sum = 1;
        for(int i = 1; i<= x; i++){
            sum*=i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        
        System.out.print("geef variablen a: ");
        int a = input.nextInt();
        System.out.print("geef variablen b: ");
        int b = input.nextInt();
        System.out.print("geef variablen n: ");
        int n = input.nextInt();
        System.out.println("A=" + a + " B=" + b + " N=" + n+"\n");
        
        int sum = 0;
        
        for(int i = 0; i<=n; i++){
            
            int tempBinomA = (Faculty(i)*n);
            int tempBinomB = (Faculty(i)*i);
            int tempBinom  = tempBinomA - tempBinomB;
            float binom = (Faculty(n)) / (Faculty(tempBinom));
            
            System.out.println("\n"+n + "!/" + i + "!("+n+ "-"+i+")! = " +binom);
            
            int temp = (n-i);
            sum += (binom*(Math.pow(a,i)*Math.pow(b,temp)));
            //System.out.println("Sum is: "+ sum);
        }
        System.out.print("\nAntwoord is: "+ sum);
    }
}

import java.util.Scanner;

class opd4 {

static Scanner input = new Scanner(System.in);

    static public int Faculty(int x){
        int sum = 1;
        for(int i = 1; i<= x; i++){
            sum*=i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        
        System.out.print("geef variablen a: ");
        int a = input.nextInt();
        System.out.print("geef variablen b: ");
        int b = input.nextInt();
        System.out.print("geef variablen n: ");
        int n = input.nextInt();
        System.out.println("A=" + a + " B=" + b + " N=" + n+"\n");
        
        int sum = 0;
        
        for(int i = 0; i<=n; i++){
            
            int tempBinomA = (Faculty(i)*n);
            int tempBinomB = (Faculty(i)*i);
            int tempBinom  = tempBinomA - tempBinomB;
            float binom = (Faculty(n)) / (Faculty(tempBinom));
            
            System.out.println("\n"+n + "!/" + i + "!("+n+ "-"+i+")! = " +binom);
            
            int temp = (n-i);
            sum += (binom*(Math.pow(a,i)*Math.pow(b,temp)));
            //System.out.println("Sum is: "+ sum);
        }
        System.out.print("\nAntwoord is: "+ sum);
    }
}

