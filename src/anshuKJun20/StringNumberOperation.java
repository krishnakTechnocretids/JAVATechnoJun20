package anshuKJun20;

public class StringNumberOperation {

	void findSumOfNumber(String input) {
		int sum = 0;
		int num = 0;
		String number = "";
		for (int index = 0; index < input.length(); index++) {
			String temp = "";
			if (Character.isDigit(input.charAt(index))) {
				temp = String.valueOf(input.charAt(index));
			}
			if (temp != "") {
				number = number.concat(temp);
				num = Integer.parseInt(number);

			}
			if (index == input.length() - 1 || temp == "") {
				sum += num;
				num = 0;
				number = "";
			}
		}
		System.out.println("Sum of all numbers in String is: " + sum);
	}

	public static void main(String[] args) {
		StringNumberOperation numberOperation = new StringNumberOperation();
		String input1 = "P71Rr29T2E";
		System.out.println("Given String is-->" + input1);
		numberOperation.findSumOfNumber(input1);
		String input2 = "P6Rr29T2E3";
		System.out.println("Given String is-->" + input2);
		numberOperation.findSumOfNumber(input2); 
	}
}
