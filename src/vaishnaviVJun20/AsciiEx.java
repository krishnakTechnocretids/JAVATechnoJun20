package vaishnaviVJun20;

/* WAP to sum all the numbers in given string, without using Character class method. 
(Note : Use ASCII value concept) . */

public class AsciiEx {

	void sumOfAllIntegersInAStringUsingAscii(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index)>= 48 && str.charAt(index)<=57) {
				sum += Character.getNumericValue(str.charAt(index));
			}
		}
		System.out.println("Sum of all numbers in String is: " +sum);
	}

	public static void main(String[] args) {
		new AsciiEx().sumOfAllIntegersInAStringUsingAscii("J7u9y8h1h8j4b7j3j6");

	}

}
