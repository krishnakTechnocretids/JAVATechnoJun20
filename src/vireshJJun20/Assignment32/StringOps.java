package vireshJJun20.Assignment32;

public class StringOps {

	void findSumOfNumbers(String str) {
		int sum = 0;
		String[] strArr = str.split(" ");
		for (int index = 0; index < strArr.length; index++) {
			try {
				sum += Integer.parseInt(strArr[index]);
			} catch (NumberFormatException ne) {
			}
		}
		System.out.println(str);
		System.out.println("Sum of all numbers in a string: " + sum);
	}

	public static void main(String[] args) {
		new StringOps().findSumOfNumbers("I have 5 Years 6 month of experience.");
	}

}
