package aditiGJUN20;

import java.util.Arrays;

public class ArrayUnionOperation {

	// Method returns union array of two input arrays
	double[] findUnionOfArrays(double[] inputArray1, double[] inputArray2) {
		Arrays.sort(inputArray1 = distinctArray(inputArray1));// Removing repeated element of inputarray1
		Arrays.sort(inputArray2 = distinctArray(inputArray2));
		double[] unionArray = new double[inputArray1.length + inputArray2.length];
		int outerIndex, innerIndex, resultIndex = 0;
		for (outerIndex = 0; outerIndex < inputArray1.length; outerIndex++, resultIndex++) {
			unionArray[outerIndex] = inputArray1[outerIndex];
		}
		for (outerIndex = 0; outerIndex < inputArray2.length; outerIndex++, resultIndex++) {
			unionArray[resultIndex] = inputArray2[outerIndex];
		}
		Arrays.sort(unionArray = distinctArray(unionArray));// Method will return array with unique elements
		return unionArray;
	}

	// Returns count of repeated elements in given array
	int countRepeatElement(double[] inputArray) {
		int count = 0;
		for (int outerIndex = 0; outerIndex < inputArray.length; outerIndex++) {
			for (int innerIndex = 0; innerIndex < outerIndex; innerIndex++)
				if (inputArray[outerIndex] == inputArray[innerIndex]) {
					count++;
					break;
				}
		}
		return count;
	}
	
	// Method to remove repetitive elements of Array
	double[] distinctArray(double[] inputArray) {
		int innerIndex = 0, count = 0;
		boolean flag;
		double[] distinctArray = new double[(inputArray.length) - countRepeatElement(inputArray)];
		for (int outerIndex = 0; outerIndex < inputArray.length; outerIndex++) {
			flag = false;
			for (innerIndex = outerIndex + 1; innerIndex < inputArray.length; innerIndex++) {
				if (inputArray[outerIndex] == inputArray[innerIndex]) {
					flag = true;
					break;
				}
			}
			if (!flag)
				distinctArray[count++] = inputArray[outerIndex];
		}
		return distinctArray;
	}

	public static void main(String[] args) {
		ArrayUnionOperation arrayUnionOperation = new ArrayUnionOperation();
		double[] inputArr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35, 88.88 };
		double[] inputArr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		// double[] inputArr1 = { 1,1, 0};
		// double[] inputArr2 = { 2,2,1};

		System.out.println("Input Array1 -> " + Arrays.toString(inputArr1));
		System.out.println("Input Array2 -> " + Arrays.toString(inputArr2));
		System.out.println(
				"\nUnion Array-> " + Arrays.toString((arrayUnionOperation.findUnionOfArrays(inputArr1, inputArr2))));
	}
}