/*Program 2: Find duplicate number on Integer array in Java?
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3, 1, 2, 3}, then duplicated number is 3. */
package jagadeeshMJun20;

import java.util.Scanner;

public class DuplicateNum {
	void getDuplicateValue(int[] arr) {
		for (int index = 0; index < arr.length; index++) {

			for (int innerindex = (index + 1); innerindex < arr.length; innerindex++) {
				if (arr[index] == arr[innerindex]) {
					System.out.println("Duplicate value is:" + arr[index]);
				}
			}
		}
	}

	public static void main(String[] agrs) {
		DuplicateNum duplicateNum = new DuplicateNum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array inputs");
		for (int index = 0; index < arr.length; index++)
			arr[index] = scanner.nextInt();
		duplicateNum.getDuplicateValue(arr);
		scanner.close();
	}
}
