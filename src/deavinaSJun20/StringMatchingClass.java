package deavinaSJun20;

/* Print minimum rotation required to compare both strings equality.


Example 1 :
String input1 = "abcdef";
String input2 = "defabc";
output : 3
*/
public class StringMatchingClass {

	int matchString(String input1, String input2) {
		int rotation_count = 0;
		while(! input1.equals(input2)) {
			input1 = input1.charAt(input1.length()-1) + input1.substring(0, (input1.length()-1));
			rotation_count++;
		}		
		return rotation_count;
	}
	

	public static void main(String[] args) {
		String input1 = "abcdef";
		String input2 = "defabc";
		System.out.println("Given strings:-\n"+input1+"\n"+input2);
		System.out.println("\nNo. of rotations required to match strings = "+new StringMatchingClass().matchString(input1, input2));
	}

	}


