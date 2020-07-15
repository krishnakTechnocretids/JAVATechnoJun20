/*WAP to sum all the numbers in given string
 * Input: P71Rr29T2E
Ouput: Sum of all numbers in String is: 102 
71 + 29 + 2 = 102
*/
package palakSJun20;

public class SumOfNumbersInString {
	void findSumOfNumbersFromString(String str) {
		System.out.println("Given String is : " + str);
		int sum = 0;
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				temp += String.valueOf((str.charAt(index)));
			else {
				if (temp.length() != 0) {
					sum = sum + Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		if (!(temp.equals(""))) {
			sum = sum + Integer.parseInt(temp);
		}
		System.out.println("Sum of all numbers in String is : " + sum);
	}

	public static void main(String[] args) {
		SumOfNumbersInString sumOfNumbersInString = new SumOfNumbersInString();
		sumOfNumbersInString.findSumOfNumbersFromString("P71Rr29T2E");
		sumOfNumbersInString.findSumOfNumbersFromString("P6Rr29T2E3");
	}
}
