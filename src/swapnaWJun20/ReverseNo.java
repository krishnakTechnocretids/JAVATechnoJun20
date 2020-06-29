package swapnaWJun20;

public class ReverseNo {

	//Reversing the number
	void doReverse(int inp) {
		int revNo = 0;
		while (inp > 0) {
			revNo = revNo * 10;
			revNo = revNo + inp % 10;
			inp = inp / 10;
		}
		System.out.print("Reverse number is : " + revNo);
	}
	public static void main(String[] args) {
		int input = 12345;
		ReverseNo reverseNo = new ReverseNo();
		reverseNo.doReverse(input);
	}
}
