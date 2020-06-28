package harshadBJun20.Assignment20;
/*Program 4: WAP to check if a number is Armstrong or not.
Example:-
Input:- 153
Output:-153
hint:- (1*1*1)+(5*5*5)+(3*3*3)
1+125+27
153*/
public class ArmstrongNumberProgram {
	int checkArmstrongNumber(int num) {
		int seperateNum=0, sum=0;
		while(num>0) {
			seperateNum = num % 10;
			num = num / 10;
			sum += (seperateNum*seperateNum*seperateNum);
		}
		return sum;
	}
	public static void main(String[] args) {
		ArmstrongNumberProgram armstrongNumberProgram = new ArmstrongNumberProgram();
		int num = 153;
		int sum = armstrongNumberProgram.checkArmstrongNumber(num);
		if(num==sum) {
			System.out.println(num+" is an armstrong number");
		}else 
			System.out.println(num+" is not an armstrong number");
	}
}
