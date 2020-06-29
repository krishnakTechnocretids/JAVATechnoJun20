package harshadBJun20.Assignment20;
/*Program 4: WAP to check if a number is Armstrong or not.
Example:-
Input:- 153
Output:-153
hint:- (1*1*1)+(5*5*5)+(3*3*3)
1+125+27
153*/
public class ArmstrongNumberProgram {
	void checkArmstrongNumber(int num) {
		int seperateNum=0, sum=0;
		int number=num;
		while(num>0) {
			seperateNum = num % 10;
			num = num / 10;
			sum += (seperateNum*seperateNum*seperateNum);
		}
		
		if(number==sum) 
			System.out.println(number+" is an armstrong number");
		else 
			System.out.println(number+" is not an armstrong number");
		
	}
	public static void main(String[] args) {
		ArmstrongNumberProgram armstrongNumberProgram = new ArmstrongNumberProgram();
		//int num = 153;
		armstrongNumberProgram.checkArmstrongNumber(153);
		armstrongNumberProgram.checkArmstrongNumber(141);
	}	
}
