package swapnaWJun20;

import java.util.Arrays;

public class IntersectionOfArray {

	int count = 0;

	void findIntersectionInArrays(double[] arr1, double[] arr2) {
		int maxArrayLength;
		if (arr1.length > arr2.length)
			maxArrayLength = arr1.length;
		else
			maxArrayLength = arr2.length;

		double[] commonElementArray = new double[maxArrayLength];

		for (int innderIndex = 0; innderIndex < arr1.length; innderIndex++) {
			for (int outerIndex = 0; outerIndex < arr2.length; outerIndex++) {
				if (arr1[innderIndex] == arr2[outerIndex]) {
					commonElementArray[count] = arr1[innderIndex];
					count++;
					break;
				}
			}
		}

		double[] intersectionArray = new double[count];
		int resultCount = 0;
		for (int outerIndex = 0; outerIndex < count; outerIndex++) {
			boolean flag = true;
			for (int InnerIndex = 0; InnerIndex < count; InnerIndex++) {
				if (intersectionArray[InnerIndex] == commonElementArray[outerIndex]) {
					flag = false;
				}
			}
			if (flag == true) {
				intersectionArray[resultCount] = commonElementArray[outerIndex];
				resultCount++;
			}
		}
		double[] finalIntersectionArray = new double[resultCount];
		for (int index = 0; index < finalIntersectionArray.length; index++) {
			finalIntersectionArray[index] = intersectionArray[index];
		}
		System.out.print("\nIntersetion Array : " + Arrays.toString(finalIntersectionArray));
	}

	public static void main(String[] args) {
		IntersectionOfArray intersectionOfArray = new IntersectionOfArray();
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		System.out.println("Array 1 : " + Arrays.toString(arr1));
		System.out.println("Array 2 : " + Arrays.toString(arr2));
		intersectionOfArray.findIntersectionInArrays(arr1, arr2);

	}
}