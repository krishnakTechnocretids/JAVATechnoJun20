/*Program 2: Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 18.35*/

package amitaRJun20;

import java.util.Arrays;

public class IntersectionOfTwoarrays {

	int count = 0;

	// method to get common elements between two arrays
	double[] getIntersectionArray(double[] arr1, double[] arr2) {
		int arrayLength = 0;
		if (arr1.length > arr2.length)
			arrayLength = arr2.length;
		else
			arrayLength = arr1.length;

		double[] tempArray = new double[arrayLength];

		for (int index = 0; index < arr1.length; index++) {
			for (int innerindex = 0; innerindex < arr2.length; innerindex++) {
				if (arr1[index] == arr2[innerindex]) {
					tempArray[count] = arr1[index];
					count++;
					break;
				}
			}
		}
		return tempArray;
	}

	// method to find unique numbers in the array
	double[] getUniqueArray(double[] tempArray) {
		double[] intersectionArray = new double[count];
		int countResult = 0;
		for (int outerIndex = 0; outerIndex < count; outerIndex++) {
			boolean flag = true;
			for (int index = 0; index < count; index++) {
				if (intersectionArray[index] == tempArray[outerIndex]) {
					flag = false;
				}
			}
			if (flag == true) {
				intersectionArray[countResult] = tempArray[outerIndex];
				countResult++;
			}
		}

		// print final intersection array
		double[] resultArray = new double[countResult];
		for (int index = 0; index < resultArray.length; index++) {
			resultArray[index] = intersectionArray[index];
		}
		System.out.println("\nThe Intersection of Two arrays is :" + Arrays.toString(resultArray));
		return resultArray;
	}

	public static void main(String[] args) {
		IntersectionOfTwoarrays intersectionarrays = new IntersectionOfTwoarrays();
		double[] array1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35, 14.0, 88.88 };
		System.out.println("The input array1 is " + Arrays.toString(array1));
		double[] array2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30, 10.45 };
		System.out.println("\nThe input array2 is " + Arrays.toString(array2));
		intersectionarrays.getUniqueArray(intersectionarrays.getIntersectionArray(array1, array2));
	}
}