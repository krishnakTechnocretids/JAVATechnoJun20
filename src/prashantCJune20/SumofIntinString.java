package prashantCJune20;

public class SumofIntinString {
	
	void addDigits(String input) {
		int addition = 0;
		for(int index = 0;index<input.length();index++) {
			if(Character.isDigit(input.charAt(index)))
				addition = addition	+ Integer.parseInt(String.valueOf(input.charAt(index)));
		}
		System.out.println("Addition of your numbers between the characters is  "+addition);		
	}
		public static void main(String[] args) {		
		SumofIntinString sum = new SumofIntinString();
		sum.addDigits("J7yu9y8h1h8j4b7j3jjb6");
	}
	

}
