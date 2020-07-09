package vireshJJun20.Assignment26;

public class SumOfNumbersInString {

	int sum = 0;
	String tempStr = "";
	void findSum(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				tempStr = tempStr + str.charAt(index);
			} else {
				if (tempStr != "") {
					sum += Integer.parseInt(tempStr);
					tempStr = "";
				}
			}
		}
		if (tempStr != "") {
			sum += Integer.parseInt(tempStr);
		}
		System.out.println(str + " : Sum of all numbers in String is: " +sum);
	}

	public static void main(String[] args) {
		String str = "P71Rr29T2E"; // P71Rr29T2E // a123b123c
		new SumOfNumbersInString().findSum(str);
	}
}
