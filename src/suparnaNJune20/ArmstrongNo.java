/*
 * Assignment 20 : 28th Jun 2020
 * Program 4: WAP to check if a number is Armstrong or not.
Example:-
Input:- 153
Output:-153
hint:- (1*1*1)+(5*5*5)+(3*3*3)
1+125+27
153
 */
package suparnaNJune20;
public class ArmstrongNo {
	void findarmstron(int input) {
		int armstrongNum= input, sum = 0;
		//System.out.println("Orignal  number " + input);
		while (input != 0) {
			sum += (input % 10) * (input % 10) * (input % 10);
			input = input / 10;
		}
		if (armstrongNum== sum)
			System.out.println(armstrongNum+ " is Armstrong No");
		else
			System.out.println(armstrongNum+ " is not Armstrong No");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 153;
		 new ArmstrongNo().findarmstron(input);
	}
}
