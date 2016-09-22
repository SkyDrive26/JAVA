public class p5{
	public static void main(String[] args){
		int tP = 1000;
		boolean[] primes = new boolean[tP + 1];
		
		for(int i = 2; i < primes.length; i++){
			primes[i] = true;
		}
		
		int m = 2;
		
		for(int i = 2;; i++){
			int factor = m*i;
			
			if(factor > primes.length){
				break;
			}else{
				primes[factor] = false;
			}
		}
		
		boolean nextM = false;
		
		for(int i = m++; i <= tP; i++){
			if(nextM){
				m = i;
				nextM = true;
				break;
			}
		}
		
		if(!nextM){
			for(int i = 0; i < primes.length; i++){
				if(primes[i]){
					System.out.print(i+" ");
				}
			}
		}
		
	}
}