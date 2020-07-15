package kARAN1595;

import java.util.Arrays;

public class IntersectionOfArray {
	double[] temp;
	int count = 0;

	double[] getIntersectionArray(double[] arr1, double[] arr2) {
		if (arr1.length < arr2.length) {
			temp = new double[arr1.length];
		} else {
			temp = new double[arr2.length];
		}
		for (int outerindex = 0; outerindex < arr2.length; outerindex++) {

			for (int innerindex = 0; innerindex < arr1.length; innerindex++) {
				if (arr2[outerindex] == arr1[innerindex]) {
					temp[count] = arr2[outerindex];
					count++;
					break;
				}
			}
		}
		double[] intersectionArray = new double[count];
		for (int outerIndex = 0; outerIndex < count; outerIndex++) {
			for (int innerindex = 0; innerindex <= outerIndex; innerindex++) {
				if (temp[outerIndex] != intersectionArray[innerindex]) {
					intersectionArray[outerIndex] = temp[outerIndex];
				}
			}
		}
		return intersectionArray;
	}

	public static void main(String[] args) {
		IntersectionOfArray intersectionOfArray = new IntersectionOfArray();
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		double[] newIntersectArray = intersectionOfArray.getIntersectionArray(arr1, arr2);
		System.out.println("Intersection of array is: " + Arrays.toString(newIntersectArray));
	}
}
