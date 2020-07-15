package kARAN1595;
/*Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)

Program 2: Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 18.35
Method Signature : double[] getIntersectionOfArray(double[] arr1, double[] arr2)
*/

public class UnionOfArrays {

	void getUnionOfArray(double[] arr1, double[] arr2) {
		double[] tempArray = new double[arr1.length + arr2.length];
		int count = 0;
		for (int OuterIndex = 0; OuterIndex < arr1.length; OuterIndex++) {
			boolean flagArray = true;
			for (int innerIndex = 0; innerIndex < arr1.length; innerIndex++) {
				if ((OuterIndex == innerIndex) || arr1[OuterIndex] != arr1[innerIndex]) {
					flagArray = true;

				} else {
					flagArray = false;
				}
			}
			if (flagArray == true) {
				count++;
				tempArray[count - 1] = arr1[OuterIndex];
			}
		}
		for (int innerIndex = 0; innerIndex < arr2.length; innerIndex++) {
			boolean flagArray = true;
			for (int OuterIndex = 0; OuterIndex < arr2.length; OuterIndex++) {
				if (arr2[innerIndex] != arr2[OuterIndex] || innerIndex == OuterIndex) {
					flagArray = true;
				} else
					flagArray = false;
			}
			if (flagArray == true) {
				boolean flagTempUnionArray = true;
				for (int indexUnion = 0; indexUnion < tempArray.length; indexUnion++)
					if (arr2[innerIndex] == tempArray[indexUnion]) {
						flagTempUnionArray = false;
						break;
					}
				if (flagTempUnionArray == true) {
					count++;
					tempArray[count - 1] = arr2[innerIndex];
				}
			}
		}
		double[] UnionArray = new double[count];
		System.out.println("Union of Arrays:");
		for (int indexFinalArray = 0; indexFinalArray < UnionArray.length; indexFinalArray++) {
			UnionArray[indexFinalArray] = tempArray[indexFinalArray];
			System.out.print(+UnionArray[indexFinalArray] + "\n");
		}
	}

	public static void main(String[] args) {
		UnionOfArrays unionOfArrays = new UnionOfArrays();
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		unionOfArrays.getUnionOfArray(arr1, arr2);
	}

}
