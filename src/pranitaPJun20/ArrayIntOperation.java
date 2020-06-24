/*Assignment 15 : 23rd Jun 2020
 * Program 2 : 
    Create a class where user will provide int array. *[ideal Expected Time : 15 mins, Max 
    Time : 25 mins]*

    A) User can provide any positive and negative number

    B) You need to find out how many positive and negative numbers are there in array 
    (Hint : here you need two variable which maintains count of positive and negative 
    number)
    Example : input -> 10,-2,-3,4,7
    Output -> 3 positive & 2 negative numbers

    C) Create a method which return difference of positive number sum and negative number 
     sum.
     Example : input -> 10,-2,-3,4,7
     Output -> 16
 */

package pranitaPJun20;

import java.util.Scanner;

public class ArrayIntOperation {
	int countPos;
	int countNeg;
	int sumP;
	int sumN;
	void findPositiveNegativeNum(int[] input) {
		for(int index=0;index<input.length;index++) {
			//int number=input[index];
			if(input[index]>=0) {
				countPos++;	
				sumP=sumP+input[index];
			}
			else if(input[index]<0){
				countNeg++;	
				sumN=sumN+input[index];
			}
		}
		System.out.println("\nTotal "+countPos+" positive numbers and "+countNeg+ " negative numbers are available in given integer array");
		System.out.println("\nSum of positive numbers is:-" +sumP+ "\nsum of negative numbers is:"+sumN);
	}
	
	int getSumDifference() {
		return (sumP+sumN);
	}
	/*We can create seperate method also
	 * int getSumDifference(int[] input) {
		
		for(int index=0;index<input.length;index++) {
			if(input[index]>=0) {
				sumP=sumP+input[index];
			}
			else if(input[index]<0) {
				sumN=sumN+input[index];
			}
        }
		System.out.println("\nSum of positive numbers is:-" +sumP+ "\nsum of negative numbers is:"+sumN);
		//System.out.println("Difference between positive and negative numbers sum is:"+(sumP+sumN) );
		return (sumP+sumN);
		
	}*/
	
	public static void main(String[] args) {
		ArrayIntOperation arrayIntOperation = new ArrayIntOperation();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int size= scanner.nextInt();
		
		//declare the array
		int[] num = new int[size];
		
		//initialize the array
		for (int index=0;index<num.length;index++) {
			System.out.println("Enter number " +(index+1) + ":");
			num[index] = scanner.nextInt();	
		}
		arrayIntOperation.findPositiveNegativeNum(num);
		//int diff= arrayIntOperation.getSumDifference(num);
		int diff= arrayIntOperation.getSumDifference();
		System.out.println("\nDifference between positive and negative numbers sum is:"+diff);

		scanner.close();	
	}

}
