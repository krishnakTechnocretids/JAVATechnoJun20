package rajAJun20;

public class StringNumbersSum {

	int showSumOfNumbersInString(String str) {
		int sum = 0 ;
		
		for(int index = 0 ; index < str.length() ; index++) {
			if(Character.isDigit(str.charAt(index))) {
				//sum = sum + Character.getNumericValue(str.charAt(index));
				sum = sum + Integer.parseInt(String.valueOf(str.charAt(index)));
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String givenString = "J7yu9y8h1h8j4b7j3jjb6";
		StringNumbersSum stringNumberSum = new StringNumbersSum();
		System.out.println("Sum of numbers present in the string is : " +stringNumberSum.showSumOfNumbersInString(givenString));
	}
}
