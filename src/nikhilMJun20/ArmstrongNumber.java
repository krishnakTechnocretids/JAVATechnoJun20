/*WAP to check if a number is Armstrong or not.
Example:-
Input:- 153
Output:-153
hint:- (1*1*1)+(5*5*5)+(3*3*3)
1+125+27
153
*/

package nikhilMJun20;

public class ArmstrongNumber {
	void isArmstrong(int num) {
		int isArm = num, sum=0;
		while(num>0) {
			sum += Math.pow((num % 10), 3);
			num = num/10;
		}
		if(isArm == sum)
			System.out.println("\n"+isArm+" is an Armstrong Number.");
		else
			System.out.println("\n"+isArm+" is NOT an Armstrong Number.");
	}
	
	public static void main(String[] args) {
		//Other Armstrong Numbers : 370, 371, 407
		int num = 153;
		new ArmstrongNumber().isArmstrong(num);
	}
}
