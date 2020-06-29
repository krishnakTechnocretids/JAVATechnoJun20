package anupSJun20;
/*Program 4: WAP to check if a number is Armstrong or not.
Example:-
Input:- 153
Output:-153
hint:- (1*1*1)+(5*5*5)+(3*3*3)
1+125+27
153*/

public class ArmstrongNumber {
	static void findANumberArmstrong(int num) {
		int input = num;
		int newNum = 0;
		while(num>0) {
			newNum = newNum+ (num%10)*(num%10)*(num%10);
			num = num/10;
		}
		if(newNum ==input) 
			System.out.println("The number " + input + " is an armstrong Number");
		else
			System.out.println("The number " + input+ " is not an armstrong Number");
		
	}
	public static void main(String[] args) {
		findANumberArmstrong(153);
	}

}
