public class Kraak{
	public static void main(String[] args){
		Kluis y = new Kluis();
		String code = breekSlot(y);
		
		y.open(code);
		for(int i = 0; i < 47; i++){
			System.out.println(y.haalop(i));
		}
		y.sluit();
		
	}
	
	public static String breekSlot(Kluis x){
		//Kluis x = new Kluis();
		String code = "";
		
		for(int a = 0; a < 10; a++){
			for(int b = 0; b < 10; b++){
				for(int c = 0; c < 10; c++){
					for(int d = 0; d < 10; d++){
						for(int e = 0; e < 10; e++){
							code = (Integer.toString(a)+Integer.toString(b)+Integer.toString(c)+Integer.toString(d)+Integer.toString(e));
							//System.out.println(code);
							boolean correct = x.open(code);
							//System.out.println(correct);
							
							if(correct == true){
								a = 11;
								b = 11;
								c = 11;
								d = 11;
								e = 11;
								x.sluit();
							}
						}
					}
				}
			}
		}
		return code;
	}
}