package aavrutiDJun20;

public class ArmstrongNumber {
	//Print whether number is Armstrong or not
	void numberIsArmstrongOrNot(int number) {
		int num = number;
		int sum = 0;
		int num2 = 0;
		while(num>0) {
			num2 = num%10;
			sum += num2*num2*num2;
			num = num/10;
		}		
		if(number == sum)
			System.out.println(number + " is an Armstrong Number");
		else
			System.out.println(number + " is not an Armstrong Number");
	}
	
	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		armstrongNumber.numberIsArmstrongOrNot(153);
		armstrongNumber.numberIsArmstrongOrNot(111);
	}
}