/*Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)*/

package amitaRJun20;

import java.util.Arrays;

public class UnionOfTwoArray {

	int count = 0;

	// method to find union of two arrays
	void findUnionOfArrays(double[] arr1, double[] arr2) {
		double[] tempUnionArray = new double[arr1.length + arr2.length];
		findUniqueNumberArray(arr1, tempUnionArray); // method to find uniue values from array1 and temp array
		findUniqueNumberArray(arr2, tempUnionArray); // method to find unique values from array2 and temp array
		unionOfArray(tempUnionArray); // method to find resultant unique array
	}

	// method to find unique number array
	double[] findUniqueNumberArray(double[] arr1, double[] tempUnionArray) {
		boolean isNumberPresent;
		for (int index = 0; index < arr1.length; index++) {
			isNumberPresent = true;
			for (int innerindex = 0; innerindex < tempUnionArray.length; innerindex++) {
				if (tempUnionArray[innerindex] == arr1[index]) {
					isNumberPresent = false;
				}
			}
			if (isNumberPresent) {
				tempUnionArray[count] = arr1[index];
				count++;
			}
		}
		return tempUnionArray;
	}

	// method to print final union array
	void unionOfArray(double[] tempUnionArray) {
		double[] unionarray = new double[count];
		for (int index = 0; index < unionarray.length; index++) {
			unionarray[index] = tempUnionArray[index];
		}
		System.out.println("\nThe union array is " + Arrays.toString(unionarray));
	}

	public static void main(String[] args) {
		UnionOfTwoArray unionoftwoarray = new UnionOfTwoArray();
		double[] array1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35, 14.0, 88.88 };
		System.out.println("The input array1 is " + Arrays.toString(array1));
		double[] array2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30, 10.45 };
		System.out.println("\nThe input array2 is " + Arrays.toString(array2));
		unionoftwoarray.findUnionOfArrays(array1, array2);
	}
}