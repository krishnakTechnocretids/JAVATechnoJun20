/*
 Program 2 Find duplicate number on Integer array in Java
Hint There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3	}, then duplicated number is 3.
 */

package vireshJJun20.Assignment20;

public class FindDuplicateNumber {
	
	int duplicateNum = 0;
	int getDuplicateNumber(int[] input) {
		int duplicateNum = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					duplicateNum = input[i];
					return duplicateNum;
				} 
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		FindDuplicateNumber findDuplicateNumber = new FindDuplicateNumber();
		int[] ar = { 0, 1, 3, 2, 3 };
		int DupNumber = findDuplicateNumber.getDuplicateNumber(ar);
		if ((DupNumber != -1))
			System.out.println("The first duplicate number in an array is: " + DupNumber);
		else
			System.out.println("There is no duplicate number found in array.");
	}
}
