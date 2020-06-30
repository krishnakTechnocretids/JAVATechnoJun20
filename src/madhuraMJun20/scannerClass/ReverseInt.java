/*WAP to reverse number (Consider Input as Integer not as String).*/

package madhuraMJun20.scannerClass;

public class ReverseInt {

	void findReverse(int input) {
		int reverseNum = 0;
		int mod = 0;

		while (input > 0) {
			mod = input % 10;
			input = input / 10;
			reverseNum = mod + reverseNum * 10;
		}
		System.out.println("Reverse Number is " + reverseNum);
	}

	public static void main(String[] args) {
		ReverseInt reverseInt = new ReverseInt();
		int input = 12345;
		reverseInt.findReverse(input);
	}
}