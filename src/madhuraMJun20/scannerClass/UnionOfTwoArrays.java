package madhuraMJun20.scannerClass;

import java.util.Arrays;

/*Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)
*/
public class UnionOfTwoArrays {
	int count;

	void findUnionOfArrays(double[] arr1, double[] arr2) {
		double[] tempUnionArray = new double[arr1.length + arr2.length];

		findUnuqueNumberArray(arr1, tempUnionArray);
		findUnuqueNumberArray(arr2, tempUnionArray);

		// remove 0.0 from tempUnionarray
		double[] unionArray = new double[count];
		for (int index = 0; index < count; index++) {
			unionArray[index] = tempUnionArray[index];
		}
		System.out.println(Arrays.toString(unionArray));
	}

	double[] findUnuqueNumberArray(double[] givenArray, double[] tempUnionArray) {
		boolean isNumberPresent = true;
		for (int index = 0; index < givenArray.length; index++) {
			isNumberPresent = true;
			for (int innerIndex = 0; innerIndex < count; innerIndex++) {
				if (tempUnionArray[innerIndex] == givenArray[index])
					isNumberPresent = false;
			}
			if (isNumberPresent) {
				tempUnionArray[count] = givenArray[index];
				count++;
			}
		}
		return tempUnionArray;
	}

	public static void main(String[] args) {
		UnionOfTwoArrays unionOfTwoArrays = new UnionOfTwoArrays();
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		unionOfTwoArrays.findUnionOfArrays(arr1, arr2);
	}
}