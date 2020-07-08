package vaishnaviVJun20_arrayExamples;

//WAP to sum all the numbers in given string.

public class SumAllIntegerInGivenString {

	void findSumAllIntegerInGivenString(String s) {
		int sum =0;
		for(int index=0;index<s.length();index++) {
			if(Character.isDigit(s.charAt(index)))
				sum +=	Integer.parseInt(String.valueOf(s.charAt(index)));
		}	
		System.out.println("Sum of all integers in given string is: "+sum);
	}
	
	public static void main(String[] args) {
		new SumAllIntegerInGivenString().findSumAllIntegerInGivenString("J7yu9y8h1h8j4b7j3jjb6");

	}

}
