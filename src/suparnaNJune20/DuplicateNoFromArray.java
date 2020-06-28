/*Assignment 20 : 28th Jun 2020
 * Program 2: Find duplicate number on Integer array in Java?
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.*/
package suparnaNJune20;

public class DuplicateNoFromArray {

	void displayArray(int[] arrayInt) {
		System.out.println("Input:" + arrayInt[0]);
		for (int index = 1; index < arrayInt.length; index++) {
			System.out.print(" , " + arrayInt[index]);
		}
		System.out.println("\n");
	}

	void findDuplicateNo(int[] arrayInt) {
		int noCnt;
		boolean noFind ;
		for (int outerIndex = 0; outerIndex < arrayInt.length - 1; outerIndex++) {
			noFind = false;
			noCnt = 1;
			for (int innerIndex = outerIndex + 1; innerIndex < arrayInt.length; innerIndex++)

				if ((arrayInt[innerIndex] == arrayInt[outerIndex]) && (arrayInt[innerIndex] != -1)
						&& (arrayInt[outerIndex]) != -1) {
					noFind = true;
					noCnt++;
					arrayInt[innerIndex] = -1;
				}
			if (noFind)
				System.out.println(arrayInt[outerIndex] + " No Dublicate in array " + noCnt + " times");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayInt = { 2, 10, 1, 3, 5, 1, 3, 7, 1, 10 };
		DuplicateNoFromArray duplicatNo = new DuplicateNoFromArray();
		duplicatNo.displayArray(arrayInt);
		duplicatNo.findDuplicateNo(arrayInt);
	}
}
