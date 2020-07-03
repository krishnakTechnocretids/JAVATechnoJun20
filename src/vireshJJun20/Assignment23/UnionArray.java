/*
 Program 1: Find union of two arrays.
Input: 	  arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)
*/

package vireshJJun20.Assignment23;

public class UnionArray {

	static int count;

	double[] uniqueNumberArray(double[] arr1) { // takes the input array and removes all duplicates
		boolean flag = false;
		double[] tempAr = new double[arr1.length];
		for (int outerIndex = 0; outerIndex < arr1.length; outerIndex++) {
			for (int innerIndex = 0; innerIndex < arr1.length; innerIndex++) {
				if (arr1[outerIndex] == tempAr[innerIndex]) {
					flag = false;
					break;
				} else {
					flag = true;
				}
			}
			if (flag == true) {
				tempAr[count] = arr1[outerIndex];
				count++;
			}
		}
		return tempAr;
	}

	double[] trimArray(double[] tempArr) { // post removing the duplicates, resize the array by removing last 0.0 values
		double[] newArr = new double[count];
		for (int index = 0; index < count; index++) {
			newArr[index] = tempArr[index];
		}
		count = 0;
		return newArr;
	}

	double[] combineArray(double[] arr1, double[] arr2) { // Simply combines 2 input arrays into one.
		double[] uniounArray = new double[arr1.length + arr2.length];
		for (int index = 0; index < arr1.length; index++) {
			uniounArray[count] = arr1[index];
			count++;
		}
		for (int index = 0; index < arr2.length; index++) {
			uniounArray[count] = arr2[index];
			count++;
		}
		count = 0;
		return uniounArray;
	}

	public static void main(String[] args) {
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		System.out.println("Array 1: {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}");
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		System.out.println("Array 2: {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}");
		double[] tempArr = new double[arr1.length + arr2.length];
		tempArr = new UnionArray().uniqueNumberArray(arr1);
		double[] newArr1 = new UnionArray().trimArray(tempArr);
		tempArr = new UnionArray().uniqueNumberArray(arr2);
		double[] newArr2 = new UnionArray().trimArray(tempArr);
		tempArr = new UnionArray().combineArray(newArr1, newArr2);
		double[] combinedArray = new UnionArray().uniqueNumberArray(tempArr);
		double[] finalUnionArray = new UnionArray().trimArray(combinedArray);
		System.out.print("Union Array : ");
		System.out.print(" { ");
		for (int index = 0; index < finalUnionArray.length; index++) {
			System.out.print(" " + finalUnionArray[index] + " ");
		}
		System.out.println(" }");
	}

}
