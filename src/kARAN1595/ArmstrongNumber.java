/*
 * Program 4: WAP to check if a number is Armstrong or not.
Example:-
Input:- 153
Output:-153
hint:- (1*1*1)+(5*5*5)+(3*3*3)
1+125+27
153
 */
package kARAN1595;

import java.util.Scanner;

public class ArmstrongNumber {
	
	void displayArmstrongNumber(int number) {
		int sum=0;
		int temp=0;
	    int num=number;
		for(;number>0;number/=10) {
			temp=number%10;
            sum=sum+(temp*temp*temp);
		}
		if(sum==num){
			System.out.println("Number is armstrong :"+sum);
		}
		else {
			System.out.println("Number is not Armstrong:"+sum);
		}
	}

	public static void main(String[] args) {
         ArmstrongNumber armstrong = new ArmstrongNumber();
         System.out.println("Enter any number:");
         Scanner scan = new Scanner(System.in);
         int number = scan.nextInt();
         armstrong.displayArmstrongNumber(number);
         scan.close();
	}

}
