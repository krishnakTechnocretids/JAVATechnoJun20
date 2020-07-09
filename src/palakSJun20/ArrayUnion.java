/*
Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
       arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2) */
package palakSJun20;

import java.util.Arrays;

public class ArrayUnion {
	int count = 0;

	void findArrayUnion(double[] array1, double[] array2) {
		double[] tempArray3 = new double[array1.length + array2.length]; // length =12
		
		// Calling Method to find Unique Number Array
		tempArray3 = findUniqueNumberArray(array2 ,findUniqueNumberArray(array1, tempArray3));
		
		double[] unionArray = new double[count];
	
		for (int index = 0; index < unionArray.length; index++) {
			unionArray[index] = tempArray3[index];			
		}
		System.out.println("Union of 2 Array is "+Arrays.toString(unionArray));
	}
	
	// MEthod to find unique Number
	double[] findUniqueNumberArray(double[] givenArray, double[] tempArray3) {
		boolean isNumberPresent = true;
		for (int index = 0; index < givenArray.length; index++) {
			isNumberPresent = true;
			for (int innerindex = 0; innerindex < tempArray3.length; innerindex++) {
				if ((givenArray[index] == tempArray3[innerindex])) {
						isNumberPresent = false;
				}
			}
			if (isNumberPresent) {
				tempArray3[count] = givenArray[index];	
				count++;
			}
		}
		return tempArray3;
	}

	public static void main(String[] args) {
		ArrayUnion arrayUnion = new ArrayUnion();
		double[] array1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] array2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		System.out.println("Array 1 "+Arrays.toString(array1));
		System.out.println("Array 2 "+Arrays.toString(array2));
		arrayUnion.findArrayUnion(array1, array2);

	}

}
