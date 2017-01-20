import java.util.Arrays;

public class Geheel implements Bewerkingen{
	
	/* Fields */
	private int[] getallen;
	
	/* Constructors */
	public Geheel(int[] a){
		getallen = a;
	}
	
	/* Methods */
	public void print(){
		for(int i = 0; i < getallen.length; i++){
			System.out.println(getallen[i]);
		}
	}
	
	public void sorteer(){
		Arrays.sort(getallen);
	}
	
	public void draaiom(){
		for(int i = 0; i < getallen.length / 2; i++){
			int temp = getallen[i];
			getallen[i] = getallen[getallen.length - i - 1];
			getallen[getallen.length -i - 1] = temp;
		}
	}
	
	public boolean oplopend(){
		for(int i = 0; i < getallen.length - 1; i++){
			if(getallen[i] > getallen[i+1]){
				return false;
			}
		}
		return true;
	}
	
	public boolean aflopend(){
		for(int i = 0; i < getallen.length - 1; i++){
			if(getallen[i] < getallen[i+1]){
				return false;
			}
		}
		return true;
	}
}