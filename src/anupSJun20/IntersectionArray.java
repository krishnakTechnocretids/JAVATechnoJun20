package anupSJun20;
/*Program 2: Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 18.35
Method Signature : double[] getIntersectionOfArray(double[] arr1, double[] arr2)*/

import java.util.Arrays;

public class IntersectionArray {

	double[] uniqueArrayelementsinArray(double[] arr) {
		double[] newarr = new double[arr.length];
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			boolean flag = true;
			for (int innerindex = 0; innerindex < arr.length; innerindex++) {
				if (arr[index] == newarr[innerindex]) {
					flag = false;
				}
			}
			if (flag) {
				newarr[count] = arr[index];
				count++;
			}
		}
			double[] resultArray = new double[count];
			for (int index1 = 0; index1 < resultArray.length; index1++) {
				resultArray[index1] = newarr[index1];
			}
			System.out.println(Arrays.toString(resultArray));
		
		return arr;
	}
	double[] intersectionArrayofTwoArrays(double[] uniqueArray1,double[] uniqueArray2) {
		int count = 0;
		double[] resultantArray = new double[uniqueArray1.length];
		for(int index=0;index<uniqueArray1.length;index++) {
			for(int innerindex = 0;innerindex<uniqueArray2.length;innerindex++) {
				if(uniqueArray1[index] == uniqueArray2[innerindex]) {
					resultantArray[count] = uniqueArray1[index];
					count++;
					break;
				}
			}
		}
		return resultantArray;
	}
		
	public static void main(String[] args) {
		IntersectionArray intersectionArray = new IntersectionArray();
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		System.out.println("The Intersection array is :");
		intersectionArray.uniqueArrayelementsinArray(intersectionArray.intersectionArrayofTwoArrays(arr1, arr2));
	}
}
