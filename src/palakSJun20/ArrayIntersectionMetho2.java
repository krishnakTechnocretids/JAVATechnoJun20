/*Program 2: Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 18.35
Method Signature : double[] getIntersectionOfArray(double[] arr1, double[] arr2)

Approach 2 : Finding common between 2 arrays and insert unique element in another array 
 */
package palakSJun20;

import java.util.Arrays;

public class ArrayIntersectionMetho2 {
	int count = 0;
	int resultArrayCount = 0;

	void findIntersectionOfArray(double[] array1, double[] array2) {
		int size = 0;
		if (array1.length > array2.length)
			size = array1.length;
		else
			size = array2.length;

		double[] array3 = new double[size]; // Array 3 size is 6

		// Calling Method to find Common value between 2 Array
		findCommonArray(array1, array2, array3);

		double[] tempArray = new double[count]; // Array created with 3 size

		// Removing Duplicate Element - O/P will get [10.45, 18.35, 0.0]
		for (int outerindex = 0; outerindex < count; outerindex++) {
			boolean flag = true;
			for (int innerindex = 0; innerindex < outerindex; innerindex++) {
				if (array3[outerindex] == tempArray[innerindex]) {
					flag = false;
				}
			}
			if (flag) {
				tempArray[outerindex] = array3[outerindex];
				resultArrayCount++; // value will be 2
			}
		}

		// Removing 0.0 values and forming new Array
		double[] intersectionArrayResult = new double[resultArrayCount];
		for (int index = 0; index < resultArrayCount; index++) {
			intersectionArrayResult[index] = tempArray[index];
		}
		System.out.print("Intersection of 2 Array is " + Arrays.toString(intersectionArrayResult));
	}

	// Method to find common value between 2 Arrays
	double[] findCommonArray(double[] array1, double[] array2, double[] array3) {

		for (int outerindex = 0; outerindex < array1.length; outerindex++) {
			for (int innerindex = 0; innerindex < array2.length; innerindex++) {
				if (array1[outerindex] == array2[innerindex]) {
					array3[count] = array1[outerindex];
					count++;
				}
			}
		}
		return array3; // return [10.45, 18.35, 18.35, 0.0, 0.0, 0.0]
	}

	public static void main(String[] args) {
		ArrayIntersectionMetho2 arrayIntersection = new ArrayIntersectionMetho2();
		double[] array1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] array2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };

		System.out.println("1st Array " + Arrays.toString(array1));
		System.out.println("2nd Array " + Arrays.toString(array2));

		arrayIntersection.findIntersectionOfArray(array1, array2);
	}
}
