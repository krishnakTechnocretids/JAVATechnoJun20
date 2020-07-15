package deavinaSJun20;

public class UnionOfArraysUsingMethod {
	int countUnionArray = 0;

	void getUnionOfArrays(double[] array1, double[] array2) {
		double[] tempUnionArray = new double[(array1.length + array2.length)];
		boolean flag;
		for (int outerIndex = 0; outerIndex < array1.length; outerIndex++) {
			flag = true;
			for (int index = 0; index < countUnionArray; index++) {
				if (tempUnionArray[index] == array1[outerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				tempUnionArray[countUnionArray] = array1[outerIndex];
				countUnionArray++;
			}
		}
		for (int outerIndex = 0; outerIndex < array2.length; outerIndex++) {
			flag = true;
			for (int index = 0; index < countUnionArray; index++) {
				if (tempUnionArray[index] == array2[outerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				tempUnionArray[countUnionArray] = array2[outerIndex];
				countUnionArray++;
			}
		}
		findUniqueNumberArray(tempUnionArray);
	}

	void findUniqueNumberArray(double[] tempUnionArray) {
		System.out.println("Union of given two arrays is:");
		double[] unionArray = new double[countUnionArray];
		for (int index = 0; index < unionArray.length; index++) {
			unionArray[index] = tempUnionArray[index];
		}
		for (int index = 0; index < unionArray.length; index++) {
			System.out.print(unionArray[index] + " ");
		}
	}

	public static void main(String[] args) {
		double[] array1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] array2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		new UnionOfArraysUsingMethod().getUnionOfArrays(array1, array2);
	}

}