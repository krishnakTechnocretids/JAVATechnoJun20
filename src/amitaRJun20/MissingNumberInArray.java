/*Program 1: Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but one number is missing, you need to write a Java program to find that missing number in an array.
*/
package amitaRJun20;

public class MissingNumberInArray {
	
	//Method to return missing number from sequence 1 to 10
	int missingNumberArray(int[] array) {
		int num = array.length+1;
		int totalSum = (num*(num+1))/2;
		for(int index=0; index<array.length; index++ ) {
			totalSum -=  array[index];
		}
		return totalSum;		
	}
	public static void main(String[] args) {
		MissingNumberInArray missingnumber=new MissingNumberInArray();
		int[] array= {1,3,5,6,10,9,8,2,7};	
		System.out.println("Given array is {1,3,5,6,10,9,8,2,7}");
		System.out.println("The Missing number in array is "+missingnumber.missingNumberArray(array));
	}
}
