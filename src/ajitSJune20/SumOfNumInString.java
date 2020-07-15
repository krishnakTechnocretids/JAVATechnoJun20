package ajitSJune20;

public class SumOfNumInString {

	public static int getSumOfAllDigits(String input) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				temp += ch;
			else {
				if (temp.length() != 0) {
					sum += Integer.parseInt(temp);
					temp = "0";
				}
			}
		}
		return (sum + Integer.parseInt(temp));
	}

	public static void main(String[] args) {
		String[] str = { "P6Rr29T2E3", "P71Rr29T2E", "64ajit16gt", "6ajitkrsi6" };
		for (int index = 0; index < str.length; index++) {
			System.out.println("Sum of all numbers in String " + str[index] + " is: " + getSumOfAllDigits(str[index]));
		}
	}
}
