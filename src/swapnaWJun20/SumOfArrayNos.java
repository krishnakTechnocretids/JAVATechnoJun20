package swapnaWJun20;

public class SumOfArrayNos {

	int sum = 0;

	void sumOperation(String input) {
		System.out.println("Input : " + input);
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				sum += Integer.parseInt(String.valueOf(input.charAt(index)));
			}
		}
		System.out.println("\nSum of all numbers in String is: " + sum);
	}

	public static void main(String[] args) {
		SumOfArrayNos sumOfArrayNos = new SumOfArrayNos();
		sumOfArrayNos.sumOperation("J7yu9y8h1h8j4b7j3jjb6");
	}
}
