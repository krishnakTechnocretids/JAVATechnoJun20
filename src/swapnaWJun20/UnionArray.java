package swapnaWJun20;

import java.util.Arrays;

public class UnionArray {

	int count = 0;

	void findUnionOfTwoArrays(double arr1[], double arr2[]) {
		double[] tempUnionArray = new double[arr1.length + arr2.length];
		findUniqueNoFromArray(arr1, tempUnionArray);
		findUniqueNoFromArray(arr2, tempUnionArray);
		unionArray(tempUnionArray);
	}

	double[] findUniqueNoFromArray(double[] arr, double[] tempUnionArray) {
		boolean isNoPresent = true;
		for (int outerIndex = 0; outerIndex < arr.length; outerIndex++) {
			isNoPresent = true;
			for (int innerIndex = 0; innerIndex < tempUnionArray.length; innerIndex++) {
				if (tempUnionArray[innerIndex] == arr[outerIndex]) {
					isNoPresent = false;
				}
			}
			if (isNoPresent == true) {
				tempUnionArray[count] = arr[outerIndex];
				count++;
			}
		}
		return tempUnionArray;
	}

	void unionArray(double[] tempUnionArray) {
		double[] unionArray = new double[count];
		for (int index = 0; index < unionArray.length; index++) {
			unionArray[index] = tempUnionArray[index];
		}
		System.out.print(Arrays.toString(unionArray));
	}

	public static void main(String[] args) {
		UnionArray unionArray = new UnionArray();
		double arr1[] = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double arr2[] = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		unionArray.findUnionOfTwoArrays(arr1, arr2);
	}
}