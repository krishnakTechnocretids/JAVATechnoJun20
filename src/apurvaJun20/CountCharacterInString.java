package apurvaJun20;


public class CountCharacterInString {
	
	void displayCount(String input) {
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(index==input.indexOf(ch))
				if(input.indexOf(ch)!=input.lastIndexOf(ch))
					System.out.println(ch+"--.First Index:"+input.indexOf(ch)+"Last Index :"+input.lastIndexOf(ch));
		}
    }
public static void main(String [] args) {
	CountCharacterInString countCharacterInString = new CountCharacterInString();
	String input ="technocredits";
	countCharacterInString.displayCount(input);
	
   }
}
