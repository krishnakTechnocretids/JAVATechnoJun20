/*
Program 4 WAP to check if a number is Armstrong or not.
Example-
Input- 153
Output-153
hint- (111)+(555)+(333)
1+125+27
153
 */
package vireshJJun20.Assignment20;

public class ArmstrongNumberCheck {

	void getArmstrongNumber(int input) {
		int num= input;
		int output=0;
		while(num>0) {
			int temp= num%10;
			output= output + (temp*temp*temp);
			num= num/10;
		}
		if(output==input)
			System.out.println("The given number " + input + " is a armstrong number.");
		else
			System.out.println("The given number " + input + " is Not a armstrong number.");
	}
	
	public static void main(String[] args) {
		ArmstrongNumberCheck armstrongNumberCheck= new ArmstrongNumberCheck();
		armstrongNumberCheck.getArmstrongNumber(153);
	}
}
