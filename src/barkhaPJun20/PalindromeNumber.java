package barkhaPJun20;

public class PalindromeNumber {
	
	void palindromeNumber(int originalNum) {
		int num1=originalNum;                //num1=45654
		int lastNum;
		int reverseNum=0;
		while(num1>0) {
			lastNum=num1%10;                //lastNum=4
			reverseNum=(reverseNum*10)+lastNum;
			num1=num1/10;
		}
		if (reverseNum==originalNum)
			System.out.println("Number ("+originalNum+") is a Palindrome Number.");
		else
			System.out.println("Number ("+originalNum+") is Not a Palindrome Number.");
	}
	public static void main(String[] args) {
		PalindromeNumber palindromeNumber=new PalindromeNumber();
		int num=45654;
		palindromeNumber.palindromeNumber(num);
	}
}
