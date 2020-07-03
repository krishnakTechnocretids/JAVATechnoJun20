/*
 * Assignment 23 : 2nd July 2020

Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)
 */
package suparnaNJune20.Assignment_23;

public class UnionOfArray {
	double[] getUnionOfArray(double[] arr1, double[] arr2) {
		int indexCnt = 0;
		double[] arr3 = new double[arr1.length + arr2.length];
		for (int outerIndex = 0; outerIndex < arr1.length; outerIndex++, indexCnt++) { // copy arr1 to arr3 (one of temp
																						// array)
			arr3[outerIndex] = arr1[outerIndex];
		}
		for (int outerIndex = 0; outerIndex < arr2.length; outerIndex++, indexCnt++) { // append arr2 to arr3 (one of
																						// temp array)
			arr3[indexCnt] = arr2[outerIndex];
		}
		return findDuplicatNo(arr3); // method will return array with unique
	}

	double[] findDuplicatNo(double[] arr3) {
		int innerIndex, outerIndex, douplicatCnt = 0;
		boolean flag;
		for (outerIndex = 0; outerIndex < arr3.length; outerIndex++) { // this loop count of duplicate no in temp array
			flag = false;
			for (innerIndex = outerIndex + 1; innerIndex < arr3.length; innerIndex++) {
				if (arr3[outerIndex] == arr3[innerIndex]) {
					flag = true;
					douplicatCnt++;
					break;
				}
			}
		}
		double[] uniqueArr = new double[arr3.length - douplicatCnt]; // create array of original index - duplicate no
																		// count
		douplicatCnt = 0;
		for (outerIndex = 0; outerIndex < arr3.length; outerIndex++) { // copy only unique value from temp array to
																		// uniquearray.
			flag = false;
			for (innerIndex = outerIndex + 1; innerIndex < arr3.length; innerIndex++) {
				if (arr3[outerIndex] == arr3[innerIndex]) {
					flag = true;
					break;
				}
			}
			if (!flag) {

				uniqueArr[douplicatCnt++] = arr3[outerIndex];
			}
		}
		return uniqueArr;
	}

	void display(double displayArr[]) { // display array
		System.out.print(displayArr[0]);
		for (int outerIndex = 1; outerIndex < displayArr.length; outerIndex++)
			System.out.print(" , " + displayArr[outerIndex]);
		System.out.print("}");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example 1:");
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		double[] unianArr1 = new IntersectOfArray().getIntersectOfArray(arr1, arr2);
		System.out.print("Input: arr1 -> { ");
		new UnionOfArray().display(arr1);
		System.out.print("\nInput: arr2 -> { ");
		new UnionOfArray().display(arr2);
		System.out.print("\nOutput : Union of Array -> { ");
		new UnionOfArray().display(unianArr1);
		System.out.println("\nExample 2:");
		double[] arr11 = { 0, 2, 0, 3, 4, 5, 6 };
		double[] arr22 = { 0.0, 0.0, 0.0, 4, 5, 6, 7, 8, 9 };
		double[] unianArr22 = new IntersectOfArray().getIntersectOfArray(arr11, arr22);
		System.out.print("Input: arr11 -> { ");
		new UnionOfArray().display(arr11);
		System.out.print("\nInput: arr22 -> { ");
		new UnionOfArray().display(arr22);
		System.out.print("\nOutput : Union of Array -> { ");
		new UnionOfArray().display(unianArr22);
		System.out.println("\nExample 3:");
		double[] arr111 = { 2, 2, 2, 2, 2, 2 };
		double[] arr222 = { 2, 2, 2, 2, 2, 2 };
		double[] unianArr333 = new IntersectOfArray().getIntersectOfArray(arr111, arr222);
		System.out.print("Input: arr111 -> { ");
		new UnionOfArray().display(arr111);
		System.out.print("\nInput: arr222 -> { ");
		new UnionOfArray().display(arr222);
		System.out.print("\nOutput : Union of Array -> { ");
		new UnionOfArray().display(unianArr333);
	}
}
