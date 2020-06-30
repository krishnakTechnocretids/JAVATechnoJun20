/*Program 3: WAP to reverse number (Consider Input as Integer, not as String).
Example:-
Input:- 12345
Output:- 54321
*/
package kARAN1595;

public class ReverseNumber {
	
	void displayReverseNumber(int [] array) {
		  System.out.println("\nArray in reverse order: ");  
	        //Loop through the array in reverse order  
	        for (int index = array.length-1; index >= 0; index--) {  
	            System.out.print(array[index] + " ");  
	        }
	}
	public static void main(String[] args) {
          ReverseNumber reverseNumber = new ReverseNumber();
          int[] array = {1,2,3,4,5};
          System.out.println("Original array: ");  
          for (int index = 0; index < array.length; index++) {  
              System.out.print(array[index] + " ");  
	}
          reverseNumber.displayReverseNumber(array);

	}
}
