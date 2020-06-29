package aavrutiDJun20;

public class ReverseIntNumber {
	//Print reverse of the given Number
	void reverseNumber(int number) {
		int num=number;
		int reverseNumber = 0;
		System.out.print("Reverse Number of " + number + " is --> " );
		while(num>0) {
			reverseNumber = num%10;
			num = num/10;
			System.out.print(reverseNumber);
		}
	}
	
	public static void main(String[] args) {
		ReverseIntNumber reverseIntNumber = new ReverseIntNumber();
		reverseIntNumber.reverseNumber(12345);
	}
}