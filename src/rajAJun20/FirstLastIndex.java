package rajAJun20;

public class FirstLastIndex {
	
	void displayFirstLastIndexCharString(String input) {
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);			
			if(index==input.indexOf(ch)) {
				if (input.indexOf(ch)!=input.lastIndexOf(ch))
			System.out.println(ch+" -> first Index = "+input.indexOf(ch)+";" +" Last Index ="+input.lastIndexOf(ch));	
				}
			}
		}

	public static void main(String[] args) {
		FirstLastIndex indexOfChar = new FirstLastIndex();
		String input = "technocredits";
		indexOfChar.displayFirstLastIndexCharString(input);
	}


}
