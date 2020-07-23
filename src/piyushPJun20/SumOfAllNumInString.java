
public class SumOfAllNumInString {
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
		SumOfAllNumInString sum = new SumOfAllNumInString();
		sum.displaySum("P71Rr29T2E");
		sum.displaySum("P6Rr29T2E3");
	}
}
