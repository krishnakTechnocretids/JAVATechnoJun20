/*Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 
but one number is missing, you need to write a Java program to find that 
missing number in an array
*/

package ajitSJune20;

import java.util.Arrays;

public class FindMissingNumInIntAray {

	void SearchMissingNum(int[] array) {
		Arrays.sort(array);
		int arrayVal = array[0];
		for (int index = 0; index < array.length; index++) {
			while (array[index] == arrayVal)
				arrayVal++;
		}
		System.out.println("Missing number is: " + arrayVal);
	}

	public static void main(String[] args) {
		FindMissingNumInIntAray findMissingNumInIntAray = new FindMissingNumInIntAray();

		int[] array = { 1, 10, 3, 6, 7, 4, 9, 5, 2 };
		findMissingNumInIntAray.SearchMissingNum(array);
	}
}