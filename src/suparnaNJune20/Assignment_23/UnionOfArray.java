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
		int innerIndex, outerIndex, indexCnt = 0;
		boolean flag;
		double[] arr3 = new double[arr1.length + arr2.length];
		for (outerIndex = 0; outerIndex < arr1.length; outerIndex++) {
			arr3[outerIndex] = arr1[outerIndex];
			indexCnt++;
		}
		for (outerIndex = 0; outerIndex < arr2.length; outerIndex++) {
			flag = false;
			for (innerIndex = 0; innerIndex < arr1.length; innerIndex++) {
				if (arr2[outerIndex] == arr1[innerIndex]) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				arr3[indexCnt] = arr2[outerIndex];
				indexCnt++;
			}
		}
		double[] unianArr = new double[indexCnt];
		for (outerIndex = 0; outerIndex < indexCnt; outerIndex++)
			unianArr[outerIndex] = arr3[outerIndex];
		return unianArr;
	}
	void display(double displayArr[]) {
		System.out.print(displayArr[0]);
		for (int outerIndex = 1; outerIndex < displayArr.length; outerIndex++)
			System.out.print(" , " + displayArr[outerIndex]);
		System.out.print("}");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		double[] unianArr = new UnionOfArray().getUnionOfArray(arr1, arr2);
		System.out.print("Input: arr1 -> { ");
		new UnionOfArray().display(arr1);
		System.out.print("\nInput: arr2 -> { ");
		new UnionOfArray().display(arr2);
		System.out.print("\nOutput : Unioan Array -> { ");
		new UnionOfArray().display(unianArr);
	}
}
