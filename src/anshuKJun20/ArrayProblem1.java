package anshuKJun20;

import java.util.Scanner;

public class ArrayProblem1 {
	static Scanner scanner = new Scanner(System.in);
 public static void main(String[] args) {
	 ArrayProblem1  arrayproblem = new ArrayProblem1();
	  System.out.println("How many integers value do you want to store ? ");
	  int integer = scanner.nextInt();
	  // declaaration of array-----
	  int[] numArray= new int[integer];
	  arrayproblem.dispaySumOfEvenIntegerInArray(numArray);
	  }
 void dispaySumOfEvenIntegerInArray(int[] input) {
	 int count =0;
	 int add=0;
	 for(int index=0; index < input.length;index++){
		 System.out.println("Enter integer "+(index+1)+";");
	   int storeInteger = scanner.nextInt();
	     if (storeInteger%2==0) {
	    	 add += storeInteger;
	    	 count++;
	     }
	   }
	 System.out.println("Total even integer in this array is  "+count);
	 System.out.println("Add of even integer is "+add);

 }
}
