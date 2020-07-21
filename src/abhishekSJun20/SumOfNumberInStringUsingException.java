package abhishekSJun20;

public class SumOfNumberInStringUsingException {
	
	void getSumOfNumber(String input) {
		System.out.println("Input String : "+input);
		String[] strArray = input.split(" ");
		int sum = 0;
		for (int index = 0; index < strArray.length; index++) {
			try {
				sum += Integer.parseInt(strArray[index]);
			    } catch (NumberFormatException nfe) {
			}
		}
		System.out.println("Sum of number in a String : " +sum);
	}

	public static void main(String[] a) {
		String str = "I have 5 Years 6 month of experience.";
		new SumOfNumberInStringUsingException().getSumOfNumber(str);
	}
}