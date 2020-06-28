/*Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but one number is missing, you need to write a Java program to find that missing number in an array.
*/

package nikhilMJun20;

public class MissingNumberFromArray {
	void findMissing(int[] intArray) {
		int originalSum=0, arraySum=0;
		
		System.out.println("Given Array : {1, 2, 3, 4, 6, 7, 8, 9, 10}");
		for(int index=0; index<intArray.length; index++) {
			arraySum += intArray[index];
		}
		
		for(int num=1; num<=10; num++) {
			originalSum += num;
		}
		
		System.out.println("\nMissing Number from 1 to 10 is : "+(originalSum-arraySum));
	}
	
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 6, 7, 8, 9, 10};
		
		new MissingNumberFromArray().findMissing(intArray);
	}
}
