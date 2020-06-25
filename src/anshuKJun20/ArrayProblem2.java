package anshuKJun20;

import java.util.Scanner;

public class ArrayProblem2 {
	static Scanner sc = new Scanner(System.in);
			
 public static void main(String[] args) {
	 ArrayProblem2 arrayproblem2 = new ArrayProblem2();
	 System.out.println("How many elements do you want in this array ?");
	 int elements = sc.nextInt();
	 int[] numberArray = new int[elements];
	   arrayproblem2.setPredefinedArray(numberArray);
	   arrayproblem2.checkPredefinedArray(numberArray);
 }
  void setPredefinedArray(int[] input) {
	 
   for(int index = 0; index < input.length; index++) {
		  System.out.println("Enter integer "+(index+1)+":");
		  input[index] = sc.nextInt();
      }
  }
   void checkPredefinedArray(int[] input){
	  // int number=0;
	   int count=0;
	   
	   System.out.println("which number you want to check ?");
	   int checkNumber = sc.nextInt();
	   for(int j= 0; j<input.length;j++) {
	      if(input[j] == checkNumber) {
		       count++;
			 }
	   }
	     if(count == 0) {
			   System.out.println("Given number is not present here");
		      }
	     else
	 			System.out.println(checkNumber+" comes "+count+"times");
	 }

    }


