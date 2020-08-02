/*Print minimum rotation required to compare both strings equality.
Example 2  : 
String input1 = "adbcdef"; -> push right
fadbcde
efadbcd
defadbc
String input2 = "defadbc";
output : 3*/

package rajAJun20;

public class CodingTest10 {
	void findNumbersOfRotation(String str1,String str2) {
		int count = 0;
		if(str1.length()!=str2.length()){
			System.out.println("Given strings are not identical..!!");
		}else {	
			while(!str1.equals(str2)) {
				str1 = str1.charAt(str1.length() - 1) + str1.substring(0, (str1.length() - 1));;
				count++;
			}
			System.out.println("Minimum rotation required to compare both the string equality is : " +count);	
		}
	}

	public static void main(String[] args) {
		String input1 = "abcdef";
		String input2 = "defabc";
		System.out.println("Given strings are : \n"+input1+"\n"+input2);
		new CodingTest10().findNumbersOfRotation(input1, input2);;

	}
}
