package aadeshJun20;

public class SumOfAllNumberInString {
	
	void displaySum(String str) {
		String temp = "0";
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				temp += str.charAt(index);
			} else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		sum = (!temp.equals("")) ? (sum + Integer.parseInt(temp)) : sum;
		System.out.println(" Sum of all numbers in string " + str + " is : " + sum);
	}

	public static void main(String[] args) {
		SumOfAllNumberInString sum = new SumOfAllNumberInString();
		sum.displaySum("P71Rr29T2E");
		sum.displaySum("P6Rr29T2E3");
	}
}