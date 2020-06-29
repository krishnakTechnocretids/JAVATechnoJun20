/*Program 2: Find duplicate number on Integer array in Java?
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.
*/
package amitaRJun20;

public class DuplicateNumberInArray {

	//Method to find duplicate number in array
	void findDuplicateNumber(int[] array) {
		for (int outerIndex = 0; outerIndex < array.length; outerIndex++) {
			for (int innerindex = outerIndex + 1; innerindex < array.length; innerindex++) {
				if (array[outerIndex] == array[innerindex]) {
					System.out.println("Duplicate number in array is : " + array[outerIndex]);
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		DuplicateNumberInArray duplicatenumber = new DuplicateNumberInArray();
		int[] array = { 0, 3, 1, 2, 3 };
		System.out.println("The Given array is {0,3,1,2,3}");
		duplicatenumber.findDuplicateNumber(array);
	}
}
