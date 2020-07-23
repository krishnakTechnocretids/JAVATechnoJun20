package piyushPJun20;
public class SumOfNumInStringException {
	void sumOfNum(String input) {
		String[] arr = input.split(" ");
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			try {
				sum += Integer.parseInt(arr[index]);
			} catch (NumberFormatException ne) {

			}
		}
		System.out.println("Input : " + input);
		System.out.println("Output : " + sum);
	}

	public static void main(String[] args) {
		String str = "I have 5 Years 6 month of experience.";
		new SumOfNumInStringException().sumOfNum(str);
	}
}