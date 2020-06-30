/*: WAP to check if a number is Armstrong or not.*/
package madhuraMJun20.scannerClass;

public class ArmstrongNum {
	
	void checkNumberIsArmstrongOrNot(int number) {
		double sum =0;
		int num= number;
		while(num>0) {
		sum = Math.pow(num%10, 3) + sum;
		num = num/10;
		}
		if(number==sum)
		System.out.println("The given number "+number+" is a Armastrong number.");
		else
		System.out.println("The given number "+number+" is not a Armastrong number.");
		}
	public static void main(String[] args) {
		ArmstrongNum ArmstrongNum = new ArmstrongNum();
		int input = 153;
		ArmstrongNum.checkNumberIsArmstrongOrNot(input);
	}
}