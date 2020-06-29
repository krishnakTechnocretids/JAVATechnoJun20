package palakSJun20;

public class ArmstrongNumber {

	//Method to find Number is armstrong number or not
	void findArmstrongNumber(int number) {
		int remainder = 0 , temp = number; 
		int sum = 0;
		while (temp > 0) {
			remainder = temp % 10 ;
			sum = sum + (remainder*remainder*remainder);
			temp = temp/10;
		}
		if (number == sum) 
			System.out.println(number+" Number is Armstrong");
		else
			System.out.println(number + " Number is not Armstrong");
	}

	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		int number = 153;
		System.out.println("Input : " + number);
		armstrongNumber.findArmstrongNumber(number);
	}
}
