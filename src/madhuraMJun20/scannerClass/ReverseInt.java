/*WAP to revers number (Consider Input as Integer not as String).*/

package madhuraMJun20.scannerClass;

public class ReverseInt {

	void findReverse(int input) {
		while (input > 0) {
			int num1 = input % 10;
			input = input / 10;
			System.out.print(num1);
		}
	}

	public static void main(String[] args) {
		ReverseInt reverseInt = new ReverseInt();
		int input = 12345;
		reverseInt.findReverse(input);
	}
}