package madhuraMJun20.scannerClass;

import java.util.Arrays;

/*Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 18.35
Method Signature : double[] getIntersectionOfArray(double[] arr1, double[] arr2)
*/
public class IntersectionOfTwoArrays {
	int count;

	void findIntersectionOfArrays(double[] arr1, double[] arr2) {
		int size=0;
		if(arr1.length>arr2.length)
			size = arr2.length;
		else
			size = arr1.length;
		double[] tempIntersectionArray = new double[size];
		
		findCommonNumberArray(arr1, arr2, tempIntersectionArray);

		// remove 0.0 from tempUnionarray
		double[] intersectionArray = new double[count];
		
		for (int index = 0; index < count ; index++) {
			intersectionArray[index] = tempIntersectionArray[index];
		}
		System.out.println(Arrays.toString(intersectionArray));
	}

	double[] findCommonNumberArray(double[] arr1, double[] arr2, double[] tempIntersectionArray) {
		for (int index = 0; index < arr1.length; index++) {
			for (int innerIndex = index+1; innerIndex < arr2.length; innerIndex++) {
				if (arr2[innerIndex] == arr1[index]) {
					tempIntersectionArray[count] = arr1[index];
					count++;
				}
			}
		}
		return tempIntersectionArray;
	}

	public static void main(String[] args) {
		IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		intersectionOfTwoArrays.findIntersectionOfArrays(arr1, arr2);
	}
}