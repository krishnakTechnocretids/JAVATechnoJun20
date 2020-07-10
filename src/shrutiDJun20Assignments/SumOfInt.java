package shrutiDJun20Assignments;

public class SumOfInt {

	void sumOfdigit(String input) {
		String temp = "";
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				temp = temp + input.charAt(index);
			} else {
				if (temp.length() > 0) {
					sum = sum + Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		if (temp.length() > 0)
			sum = sum + Integer.parseInt(temp);
		System.out.println("Sum of all the digits -->"+sum);
	}

	public static void main(String[] args) {
		SumOfInt sumOfInt = new SumOfInt();
		sumOfInt.sumOfdigit("a30gh40sg30jhj1");
	}
}
