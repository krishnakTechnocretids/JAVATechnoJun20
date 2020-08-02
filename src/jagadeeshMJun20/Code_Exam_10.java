/*Coding test 10 :
Print minimum rotation required to compare both strings equality.
Example 1  : 
String input1 = "abcdef";
fabcde
efabcd
defabc
String input2 = "defabc";
output : 3

Example 2  : 
String input1 = "adbcdef"; -> push right
fadbcde
efadbcd
defadbc
String input2 = "defadbc";
output : 3 */

package jagadeeshMJun20;

public class Code_Exam_10 {
 void displayOutput(String input1, String input2 ) {
	 String temp ="";
	 int count=1;
	 if(input1.equals(input2)) 
		 System.out.println("both the inputs are same");
		 else {
	do {
	 temp = input1.charAt(input1.length()-1) + input1.substring(0,(input1.length()-1));
	 System.out.println(temp);
	 if(temp.equals(input2)) {
	 System.out.println("Count is "+count);
	 input1 = temp;
	 }
	 else {
		 count++;
		 input1 = temp;
	 }
 }while(!(input1.equals(input2)));
		 }
 }
	public static void main(String[] args) {
		String input1 = "abcdef";
		String input2 = "defabc";
		new Code_Exam_10().displayOutput(input1, input2);
	}

}
