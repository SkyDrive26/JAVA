import java.util.Arrays;

public class Letters implements Bewerkingen{
	
	/*Fields */
	private char[] letters;
	
	/* Constructors */
	public Letters(String s){
		letters = new char[s.length()];
		for(int i = 0; i < s.length(); i++){
			letters[i] = s.charAt(i);
		}
	}
	
	/* Methods */
	public void print(){
		for(int i = 0; i < letters.length; i++){
			System.out.println(letters[i]);
		}
	}
	
	public void sorteer(){
		Arrays.sort(letters);
	}
	
	public void draaiom(){
		for(int i = 0; i < letters.length / 2; i++){
			char temp = letters[i];
			letters[i] = letters[letters.length -i -1];
			letters[letters.length -i -1] = temp;
		}
	}
	
	public boolean oplopend(){
		for(int i = 0; i < letters.length - 1; i++){
			if(Character.toString(letters[i]).charAt(0) > Character.toString(letters[i+1]).charAt(0)){
				return false;
			}
		}
		return true;
	}
	
	public boolean aflopend(){
		for(int i = 0; i < letters.length - 1; i++){
			if(Character.toString(letters[i]).charAt(0) < Character.toString(letters[i+1]).charAt(0)){
				return false;
			}
		}
		return true;
	}
}