package yashCJun20.Assignment25;

public class SumOfAllNumbersInString {
	
	void sum (String name) {
		
			int sum=0;
			for(int i=0;i<name.length();i++) {
				if(Character.isDigit((name.charAt(i)))) {
					String charValue = String.valueOf(name.charAt(i));
					int digit = Integer.parseInt(charValue);
					sum = sum + digit;
				}
			}
			System.out.println("Sum of all numbers in String is: "+sum);	
		}
	public static void main(String[] args) {
		SumOfAllNumbersInString sumOfallNumbersInString = new SumOfAllNumbersInString();
		String string="J7yu9y8h1h8j4b7j3jjb6";
		sumOfallNumbersInString.sum(string);
	}

}