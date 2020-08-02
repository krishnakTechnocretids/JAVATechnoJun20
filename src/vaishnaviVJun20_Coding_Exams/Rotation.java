package vaishnaviVJun20_Coding_Exams;

/* Coding test 10 :

Print minimum rotation required to compare both strings equality.

Example 1  : 
String input1 = "abcdef";
String input2 = "defabc";
output : 3

Example 2  : 
String input1 = "adbcdef"; -> push right
fadbcde
efadbcd
defadbc
String input2 = "defadbc";
output : 3  */

public class Rotation {
	
	void findMinimunRotation(String input1, String input2) {
		int rotation=0;
		 while(!input1.equals(input2)) {
			 input1 = input1.charAt(input1.length()-1) + input1.substring(0, (input1.length()-1));
			 rotation++;
		 }
		
		System.out.println("Rotation count required is: " +rotation);
	}

	public static void main(String[] args) {
		String input1 = "abcdef";
		String input2 = "defabc";
		new Rotation().findMinimunRotation(input1,input2);

	}

}
