package rajAJun20;

public class ReverseNumber {
	
	void printReverseNumber(int inputNumber) {
		while(inputNumber > 0) {
			int reverse = inputNumber % 10;
			inputNumber = inputNumber/10;
			System.out.println("Reverse number is : " + reverse);
		}
	}
	
	public static void main(String[] args) {
		ReverseNumber reverseNumber = new ReverseNumber();
		
		int input = 12345;
		
		reverseNumber.printReverseNumber(input);
	}
}
