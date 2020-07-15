/*WAP to sum all the numbers in given string.
Input: P71Rr29T2E
Ouput: Sum of all numbers in String is: 102
*/

package swapnaWJun20;

public class SumStringArrayNosConsecutive {
	String temp = "";
	int sum = 0;

	int getSumOfConsecutiveNos(String number) {
		System.out.println("Input : " + number);
		for (int index = 0; index < number.length(); index++) {
			if (Character.isDigit(number.charAt(index))) {
				temp += Character.getNumericValue((number.charAt(index)));
			} else {
				if (temp.length() != 0) {
					sum += Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		if (temp.length() != 0) {
			sum += Integer.parseInt(temp);
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Output : " + new SumStringArrayNosConsecutive().getSumOfConsecutiveNos("P71Rr29T2E"));
		System.out.println("Output : " + new SumStringArrayNosConsecutive().getSumOfConsecutiveNos("P6Rr29T2E3"));
	}
}