/*Find duplicate number on Integer array in Java?
Hint: There is exactly one number is repeated in the array. You need to write 
a program to find that duplicate number. For example, if an array with length 
6 contains numbers {0, 3,1, 2, 3}, then duplicated number is 3.
*/

package aditiGJUN20;

public class DuplicateNumInArray {
	// Method to find 
	int getDuplicateNumber(int[] intArray) {
		int duplicateNum = 0;
		for (int index1 = 0; index1 < intArray.length; index1++) {
			for (int index2 = (index1 + 1); index2 < intArray.length; index2++) {
				if (intArray[index1] == intArray[index2]) {
					duplicateNum = intArray[index2];
					break;
				}
			}
		}
		return duplicateNum;
	}

	public static void main(String[] args) {
		DuplicateNumInArray duplicateNumInArray = new DuplicateNumInArray();
		
		int[] inputArray1 = {0,3,1,2,3};// Input1
		System.out.println("Input Array:{0,3,1,1,2,3}");
		System.out.println(
				"For given input Array duplicate NUmber is: " + duplicateNumInArray.getDuplicateNumber(inputArray1));
		
		int[] inputArray2 = {0,3,1,2,3};// Input2
		System.out.println("Input Array:{0,3,1,2,3}");
		System.out.println(
				"For given input Array duplicate NUmber is: " + duplicateNumInArray.getDuplicateNumber(inputArray2));
		
	}
}
