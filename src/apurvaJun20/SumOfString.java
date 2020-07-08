package apurvaJun20;

public class SumOfString {

	void sumOfDigits(String givenString) {

		int sum=0;
		for(int i=0;i<givenString.length();i++) {
			if(Character.isDigit(givenString.charAt(i))) {
				int value = Character.getNumericValue(givenString.charAt(i));
				sum = sum + value;
			}
		}
		System.out.println("Sum of all numbers in String is: "+sum);
	}

	public static void main(String[] args) {
		SumOfString ss = new SumOfString();
		String passedString = "J7yu9y8h1h8j4b7j3jjb6";
		ss.sumOfDigits(passedString);
	
		

	}

}
