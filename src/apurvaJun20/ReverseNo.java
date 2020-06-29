package apurvaJun20;

import java.util.Scanner;

public class ReverseNo {
	static void reverseMethod(int number) {
	       if (number < 10) {
		   System.out.println(number);
		   return;
	       }
	       else {
	           System.out.print(number % 10);
	           //Method is calling itself: recursion
	           reverseMethod(number/10);
	       }
	   }
	   public static void main(String args[])
	   {
		   
		ReverseNo reverseNo = new ReverseNo();
		int num=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Input your number and press enter: ");
		num = in.nextInt();
		System.out.print("Reverse of the input number is:");
		reverseMethod(num);
		System.out.println();
	   }
	}


