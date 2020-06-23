package anshuKJun20;

import java.util.Scanner;

public class ArrayPositiveNegetiveNumber {
	static int addPositiveNumber, addNegetiveNumber;
	static Scanner scanner = new Scanner(System.in);
 public static void main(String[] args) {
	 ArrayPositiveNegetiveNumber  diffpositivenegetivenum = new ArrayPositiveNegetiveNumber();
	  System.out.println("How many integers value do you want to store ? ");
	  int integer = scanner.nextInt();
	  // declaaration of array-----
	  int[] numArray= new int[integer];
	  diffpositivenegetivenum.findPositiveandNegetiveNumber(numArray);
	  int diff =  diffpositivenegetivenum.getDifference(numArray);
	  System.out.println("Difference is"+diff);
      }
  void findPositiveandNegetiveNumber(int[] input) {
	  int positiveCount =0;
	  int negetiveCount =0;
	  
	  for(int index= 0;index<input.length;index++) {
		  System.out.println("Enter integer "+(index+1)+":");
		  int number = scanner.nextInt();
		   if (number>0) {
			   addPositiveNumber += number;
			   positiveCount++;
			  }else {
	        	 addNegetiveNumber += number;
	        	 negetiveCount++;
			  }
	       }
	  System.out.println("Total Positive integer in this array is "+positiveCount+" '\n' Total negetive number is "+negetiveCount);
  }
  int getDifference(int[] input) {
	  return (addPositiveNumber - addNegetiveNumber);
  }
}
