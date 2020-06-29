/*Program 2: Find duplicate number on Integer array in Java?
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, 
if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.*/
package palakSJun20;

public class ArrayDuplicateElement {
	//Method to find duplicate number on Integer Array
	void findDuplicateNumberOnIntegerArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println("Duplicate Number is " + array[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrayDuplicateElement arrayDuplicateElement = new ArrayDuplicateElement();
		int[] array = { 0, 3, 1, 2, 3 };
		
		//Calling method to find duplicate element
		arrayDuplicateElement.findDuplicateNumberOnIntegerArray(array);
	}
}
