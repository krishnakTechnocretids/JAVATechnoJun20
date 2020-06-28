package kartikeyDJune20;

public class Coding_Test_2_SumOfDigitInString {
	
	static void sumOfDigit(String input) {
		int sum=0;
		System.out.println("Digits in the string are: ");
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(Character.isDigit(ch)) {
				String s1=ch+"";
				int digit= Integer.parseInt(s1);
				sum+=digit;
				System.out.print(ch+" ");
				
			}
			
		}
		System.out.println("\n"+"Sum of Digits is: "+sum);
		
	}
	
	public static void main(String[] args) {
		String input = "1Hh9PR34QP";
		Coding_Test_2_SumOfDigitInString.sumOfDigit(input);
		
	}
}
