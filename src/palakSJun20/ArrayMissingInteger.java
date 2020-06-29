/*Program 1: Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but one number
 is missing, you need to write a Java program to find that missing number in an array.*/

package palakSJun20;

public class ArrayMissingInteger {
	
	void findArrayMissingInteger(int[] array){
		for (int i = 0; i < array.length; i++) {
			int min = array[0];
			int max = array[array.length - 1];
			if (!(array[i] >= min && array[i] <= max)) {
				System.out.println("Number is missing " + array[i]);
			}
		}
	}

	public static void main(String[] args) {
		ArrayMissingInteger arrayMissingInteger = new ArrayMissingInteger();
		int[] array = { 1, 2, 3, 4, 7, 6, 11, 8, 9, 10 };
		arrayMissingInteger.findArrayMissingInteger(array);
		
	}

}
