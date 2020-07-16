package swapnaWJun20;

public class SumNosUsingASCII {
	int sum = 0;

	int sumUsingASCII(String input) {
		for (int index = 0; index < input.length(); index++) {
			for (int innerIndex = 48; innerIndex <= 57; innerIndex++)
				if (input.charAt(index) <= innerIndex) {
					sum += Character.getNumericValue(input.charAt(index));
					break;
				}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumNosUsingASCII sumNosUsingASCII = new SumNosUsingASCII();
		sumNosUsingASCII.sumUsingASCII("J7u9y8h1h8j4b7j3j6");
		System.out.println("Sum of given input String is : " + sumNosUsingASCII.sum);
	}
}