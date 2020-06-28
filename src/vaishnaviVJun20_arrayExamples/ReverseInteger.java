package vaishnaviVJun20_arrayExamples;

//WAP to revere number (Consider Input as Integer not as String)

public class ReverseInteger {
	
	void reverseIntegerNumber(int num) {
		System.out.print("Reverse number is:");
		while(num>0) {
			int reverse = num%10;
			num = num/10;
			System.out.print(reverse);
		}		
	}

	public static void main(String[] args) {
		ReverseInteger reverseInteger = new ReverseInteger();
		int number = 12345;
		reverseInteger.reverseIntegerNumber(number);
	}
}