/*Program 2: Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 18.35
Method Signature : double[] getIntersectionOfArray(double[] arr1, double[] arr2)

Approach 2 : 1 Removing Duplicate element of both arrays , Comparing both arrays and assigning common value to 3rd Array
*/
package palakSJun20;

import java.util.Arrays;

public class ArrayIntersectionMethod1 {
	int count = 0;

	void findIntersectionOfArray(double[] array1, double[] array2) {
		
		// Calling Method to find Unique Array
		 double[] resultArray1  = uniqueArray1(array1);
		 double[] resultArray2 =  uniqueArray1(array2);
		 
		  // initialize temporary result array
		 double[] tempResultArray = new double[array1.length];

		// Finding Common Elements between between 2 Arrays
		boolean flag = true;
		for (int outerindex = 0; outerindex < resultArray1.length; outerindex++) {
			flag = true;
			for (int innerindex = 0; innerindex < resultArray2.length; innerindex++) {
				if (resultArray1[outerindex] == resultArray2[innerindex]) {
					flag = false;
				}
			}
			if (flag == false) {
				tempResultArray[count] = resultArray1[outerindex];
				count++;
			}
		}

		// Printing Final Array Value getting 0.0 as well
		double[] finalResultArray = new double[count];
		for (int index = 0; index < count; index++) {
            finalResultArray[index] = tempResultArray[index];
        }
		
		// print the array.
        System.out.println("Intersection of an Array "+Arrays.toString(finalResultArray));
	}

	// Method Unique Array will give Array1 Unique element
	double[] uniqueArray1(double[] givenArray) {
		int count = 0;
		double[] tempArray = new double[givenArray.length]; // 6
		boolean isNumberPresent = true;
		for (int outerindex = 0; outerindex < givenArray.length; outerindex++) {
		
			isNumberPresent = true;
			for (int innerindex = 0; innerindex < givenArray.length; innerindex++) {
				if ((givenArray[outerindex] == tempArray[innerindex])) {
					isNumberPresent = false;
				}
			}
			if (isNumberPresent) {
				tempArray[count] = givenArray[outerindex];
				count++;
			}
		}
		
		// only copy valid array elements
        double[] returnArray = new double[count];
        for (int i = 0; i < count; i++) {
            returnArray[i] = tempArray[i];
        }
		return returnArray; // [10.45, 14.0, 18.35, 88.88, 54.1,0.0]
	}

	
	public static void main(String[] args) {
		ArrayIntersectionMethod1 arrayIntersectionMethod1 = new ArrayIntersectionMethod1();
		double[] array1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] array2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		System.out.println("Array 1 "+ Arrays.toString(array1));
		System.out.println("Array 2 "+ Arrays.toString(array2));
		arrayIntersectionMethod1.findIntersectionOfArray(array1, array2);

	}

}
