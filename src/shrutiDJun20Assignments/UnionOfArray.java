package shrutiDJun20Assignments;

import java.util.Arrays;

//import java.util.Arrays;

public class UnionOfArray {
	int count = 0;

	double[] findUniqueOfArray(double[] arr1, double[] arr2) {
		double[] tempArray = new double[arr1.length + arr2.length];

		boolean flag = true;
		for (int index = 0; index < arr1.length; index++) {
			flag = true;
			for (int innerindex = 0; innerindex < tempArray.length; innerindex++) {
				if (arr1[index] == tempArray[innerindex]) {
					flag = false;
				}
			}
			if (flag == true) {
				tempArray[count] = arr1[index];
				count++;
			}
		}

		for (int index = 0; index < arr2.length; index++) {
			flag = true;
			for (int innerindex = 0; innerindex < tempArray.length; innerindex++) {
				if (arr2[index] == tempArray[innerindex]) {
					flag = false;
				}
			}
			if (flag == true) {
				tempArray[count] = arr2[index];
				count++;
			}
		}

		return tempArray;
	}

	void unionOfArray(double[] tempArray) {
		double[] unionArray = new double[count];
		for (int index = 0; index < unionArray.length; index++) {
			unionArray[index] = tempArray[index];
		}
		//System.out.println(""+Arrays.toString(tempArray));
		System.out.println("Union of both the Arrays -->"+Arrays.toString(unionArray));
	}

	public static void main(String[] args) {
		UnionOfArray unionOfArray = new UnionOfArray();
		double arr1[] = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double arr2[] = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		double[] tempArray = unionOfArray.findUniqueOfArray(arr1, arr2);
		unionOfArray.unionOfArray(tempArray);
	}
}
