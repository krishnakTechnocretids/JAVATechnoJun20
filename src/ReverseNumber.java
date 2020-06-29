
public class ReverseNumber {
	int displayReverseNum(int num) {
		int rNum = 0;
		while (num > 0) {
			rNum = (rNum * 10) + (num % 10);
			num = num / 10;
		}
		return rNum;
	}

	public static void main(String[] args) {
		ReverseNumber reverse = new ReverseNumber();
		int num = 12345;
		System.out.println(" Reverse of " + num + " is: " + reverse.displayReverseNum(num));
	}
}
