/*: WAP to check if a number is Armstrong or not.*/
package madhuraMJun20.scannerClass;

public class ArmstrongNum {
	void findArmstrong(int input) {
		int sumOfCube = 0;int cube = 0;	int num1 = 0;int givenNum = input;

		while (givenNum != 0) {
			num1 = givenNum % 10;
			cube = num1 * num1 * num1;
			sumOfCube += cube;
			givenNum = givenNum / 10;

		}
		if (sumOfCube == input)
			System.out.println(input + " is an Armstrong number");
		else
			System.out.println(input + " is not an Armstrong number");
	}

	public static void main(String[] args) {
		ArmstrongNum ArmstrongNum = new ArmstrongNum();
		int input = 153;
		ArmstrongNum.findArmstrong(input);
	}
}