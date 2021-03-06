package anshuKJun20;

import java.util.Arrays;

public class IntersectionOfArray {
	double[] tempArr;
	double[] getIntersectionArray(double[] arr1, double[] arr2) {
		if(arr1.length<arr2.length) {
			tempArr = new double[arr1.length];
		}else {
			tempArr = new double[arr2.length];
		}
		int count = 0;
		for (int outerindex = 0; outerindex < arr2.length; outerindex++) {
			
			for (int innerindex = 0; innerindex < arr1.length; innerindex++) {
				if (arr2[outerindex] == arr1[innerindex]) {
					tempArr[count] = arr2[outerindex];
					count++;
					break;
				}
			}
		}
		double[] intersectionArray = new double[count];
		for (int index = 0; index < count; index++) {
			for (int innerindex = 0; innerindex <= index; innerindex++) {
				if (tempArr[index] != intersectionArray[innerindex]) {
					intersectionArray[index] = tempArr[index];
				}
			}
		}
		return intersectionArray;
	}

	public static void main(String[] args) {
		IntersectionOfArray intersectionOfArray = new IntersectionOfArray();
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		System.out.println("Array 1--->" + Arrays.toString(arr1));
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		System.out.println("Array 2--->" + Arrays.toString(arr2));
		double[] newIntersectArray = intersectionOfArray.getIntersectionArray(arr1, arr2);
		System.out.println("output is " + Arrays.toString(newIntersectArray));

	}
}
