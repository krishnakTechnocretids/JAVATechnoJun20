package anupSJun20;
/*WAP to sum all the numbers in given string.

Input: P71Rr29T2E
Ouput: Sum of all numbers in String is: 102

Input: P6Rr29T2E3
Ouput: Sum of all numbers in String is: 40*/

public class SumofGivenNumbersinString {

	int findSumofGivenNumbers(String str) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				temp = temp + str.charAt(index);
			} else {
				if (temp != "") {
					sum += Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		if (temp != "") {
			sum += Integer.parseInt(temp);
			temp = "";
		}
		return sum;
	}

	public static void main(String[] args) {
		SumofGivenNumbersinString sumofGivenNumbersinString = new SumofGivenNumbersinString();
		System.out.println("The input string is " + "P71Rr29T2E");
		System.out.println("The Sum is " + sumofGivenNumbersinString.findSumofGivenNumbers("P71Rr29T2E"));
		System.out.println("The input string is " + "P6Rr29T2E3");
		System.out.println("The Sum is " + sumofGivenNumbersinString.findSumofGivenNumbers("P6Rr29T2E3"));
	}
}