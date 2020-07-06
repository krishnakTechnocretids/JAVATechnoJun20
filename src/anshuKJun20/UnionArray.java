package anshuKJun20;

import java.util.Arrays;

public class UnionArray {
	double[] getUnionArray(double[] arr1, double[] arr2) {
		double[] tempArr = new double[arr1.length + arr2.length];
		int count = 0;
		for (int outerindex = 0; outerindex < tempArr.length; outerindex++) {
			boolean status = false;
			if (outerindex < arr1.length) {
				for (int innerindex = 0; innerindex <= outerindex; innerindex++) {
					if (tempArr[innerindex] == arr1[outerindex]) {
						status = true;
						break;
					}
				}
				if (!status) {
					tempArr[count] = arr1[outerindex];
					count++;
				}
			} else {
				for (int innerindex = 0; innerindex <= outerindex; innerindex++) {
					if (tempArr[innerindex] == arr2[outerindex - arr1.length]) {
						status = true;
						break;
					}
				}

				if (!status) {
					tempArr[count] = arr2[outerindex - arr1.length];
					count++;
				}
			}
		}
		double[] intersectUnionArr = new double[count];
		for (int index = 0; index < intersectUnionArr.length; index++) {
			intersectUnionArr[index] = tempArr[index];
		}
		return intersectUnionArr;
	}

	public static void main(String[] args) {
		UnionArray unionArray = new UnionArray();
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		System.out.println("Array 1--->" + Arrays.toString(arr1));
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		System.out.println("Array 2--->" + Arrays.toString(arr2));
		double[] newIntersectArray = unionArray.getUnionArray(arr1, arr2);
		System.out.println("output is " + Arrays.toString(newIntersectArray));
	}

}
