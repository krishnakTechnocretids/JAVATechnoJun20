package kartikeyDJune20;

public class SumOfNumericalnString {
	
	void sumOfNumInString(String input) {
		int sum=0;
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(Character.isDigit(ch)) {
				sum+=(Character.getNumericValue(ch));
			}
		}
		System.out.println("Sum of numbers in String "+input+" is "+sum);
	}
	public static void main(String[] args) {
	SumOfNumericalnString sumOfNumericalnString= new SumOfNumericalnString();
	sumOfNumericalnString.sumOfNumInString("J7yu9y8h1h8j4b7j3jjb6");
		
	}

}
