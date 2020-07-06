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
	int array1count = 0;
	int array2count = 0;
	int resultcount = 0;

	void findIntersectionOfArray(double[] array1, double[] array2) {
		double[] tempArray = new double[array1.length];
		double[] tempArray2 = new double[array2.length];

		// Calling Method to find Unique Array
		tempArray = uniqueArray1(array1, tempArray);
		tempArray2 = uniqueArray2(array2, tempArray2);

		// Removing 0.0 Extra value & Assigning array1 Unique value in array result 1
		double[] resultArray1 = new double[array1count];
		for (int index = 0; index < resultArray1.length; index++) {
			resultArray1[index] = tempArray[index];
		}

		// Removing 0.0 Extra value & Assigning array 2 Unique value in array result 2
		double[] resultArray2 = new double[array2count];
		for (int index = 0; index < resultArray2.length; index++) {
			resultArray2[index] = tempArray2[index];
		}
		System.out.println("Unique Array 1 : " + Arrays.toString(resultArray1));
		System.out.println("Unique Array 2 : " + Arrays.toString(resultArray2));

		// Calling Method to Get Size of an intersection array
		int size = getSizeOfAnArray(array1, array2);
		double[] intersectArray = new double[size];

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
				intersectArray[outerindex] = resultArray1[outerindex];
				resultcount++;
			}
		} // O/p : [10.45, 0.0, 18.35, 0.0, 0.0, 0.0]
		System.out.println("Intersection array " + Arrays.toString(intersectArray));

		// Printing Final Array Value getting 0.0 as well
		for (int index = 0; index < intersectArray.length; index++) {
			System.out.print(intersectArray[index] + " ,");
		}
	}

	// Get Size of an intersectArray
	int getSizeOfAnArray(double[] array1, double[] array2) {
		int size = 0;
		if (array1.length < array2.length)
			size = array1.length;
		else
			size = array2.length;
		return size;
	}

	// Method Unique Array will give Array1 Unique element
	double[] uniqueArray1(double[] array1, double[] tempArray) {

		boolean isNumberPresent = true;
		for (int outerindex = 0; outerindex < array1.length; outerindex++) {
			isNumberPresent = true;
			for (int innerindex = 0; innerindex < tempArray.length; innerindex++) {
				if ((array1[outerindex] == tempArray[innerindex])) {
					isNumberPresent = false;
				}
			}
			if (isNumberPresent) {
				tempArray[array1count] = array1[outerindex];
				array1count++;
			}
		}
		return tempArray; // [10.45, 14.0, 18.35, 88.88, 54.1,0.0]
	}

	// Method : Unique Array2 will give Array 2 Unique Element
	double[] uniqueArray2(double[] array2, double[] tempArray2) {

		boolean isNumberPresent = true;
		for (int outerindex = 0; outerindex < array2.length; outerindex++) {
			isNumberPresent = true;
			for (int innerindex = 0; innerindex < tempArray2.length; innerindex++) {
				if ((array2[outerindex] == tempArray2[innerindex])) {
					isNumberPresent = false;
				}
			}
			if (isNumberPresent) {
				tempArray2[array2count] = array2[outerindex];
				array2count++;
			}
		}
		return tempArray2; // [17.2, 13.3, 10.45, 18.35, 84.33,0.0]
	}

	public static void main(String[] args) {
		ArrayIntersectionMethod1 arrayIntersection = new ArrayIntersectionMethod1();
		double[] array1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] array2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		arrayIntersection.findIntersectionOfArray(array1, array2);

	}

}
