public class p3{
	public static void main(String[] args){
		
		int aN = 200;
		int i;
		String prime = "";
		
		for(i = 1; i <= 200; i++){
			int c = 0;
			
			for(int aD = i; aD >= 1; aD--){
				if(i%aD == 0){
					c++;
				}
			}
			
			if(c == 2){
				prime = (prime + i + " ");
			}
		}
		
		System.out.println("De eerste 200 priem getallen zijn:");
		System.out.println(prime);
	}
}