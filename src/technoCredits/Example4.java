package technoCredits;

public class Example4 {

	void convertCharCase(char ch) {
		if(Character.isLetter(ch)) {
			if(Character.isUpperCase(ch))
				System.out.println(Character.toLowerCase(ch));
			else
				System.out.println(Character.toUpperCase(ch));
		}else
			System.out.println("Char " + ch + " is not a letter");
	}
	
	void convertCharCaseWithAsscii(char ch) {
		if(ch >='A' && ch <='Z') {
			ch = (char)(ch + 32);
			System.out.println(ch);
		}else if(ch >='a' && ch <='z'){
			ch = (char)(ch - 32);
			System.out.println(ch);
		}else {
			System.out.println("Its not a letter");
		}
		
	}
	
	public static void main(String[] args) {
		new Example4().convertCharCaseWithAsscii('P');
	}
}
