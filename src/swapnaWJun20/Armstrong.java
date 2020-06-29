package swapnaWJun20;

public class Armstrong {

	//Armstrong number logic
	void checkValueIfArmstrong(int num) {
		int num1 = num;
		int sum = 0;
		while (num1 > 0) {
			sum += (num1 % 10) * (num1 % 10) * (num1 % 10);
			num1 = num1 / 10;
		}
		if (num == sum)
			System.out.println(num + " is Armstrong");
		else
			System.out.println(num + " is not Armstrong");
	}

	public static void main(String[] args) {
		Armstrong armstrong = new Armstrong();
		armstrong.checkValueIfArmstrong(153);
	}
}