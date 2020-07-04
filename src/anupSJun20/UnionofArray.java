package anupSJun20;

import java.util.Arrays;

/*Assignment 23 : 2nd July 2020

Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2) */

public class UnionofArray {
	
	int count = 0;
	void findUnionArrayLength(double[] arr1, double[] arr2) {
		double[] temp = new double[arr1.length+arr2.length];
		findUniqueElementArray(arr1,temp);
		findUniqueElementArray(arr2,temp);
		double[] resultArray = new double[count];
		for (int index = 0; index < resultArray.length; index++) {
			resultArray[index] = temp[index];
		}
		System.out.println(Arrays.toString(resultArray));
	}
	double[] findUniqueElementArray(double[] arr1, double[] temp) {
		for(int index = 0;index<arr1.length;index++) {
			boolean flag = true;
			for(int innerindex = 0;innerindex<temp.length;innerindex++) {
				if( arr1[index] == temp[innerindex]) {
					flag = false;
				}
			}
			if(flag) {
				temp[count] = arr1[index];
				count++;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		UnionofArray unionarray = new UnionofArray();
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35, 10.45, 18.35};
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		System.out.println("The union array of teo array is :");
		unionarray.findUnionArrayLength(arr1,arr2);
	}
}
