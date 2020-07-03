package aavrutiDJun20.array;

public class UnionOfTwoArrays {
	int numberCnt = 0;

	//Store count of all the unique numbers from two arrays and store it in temporary array
	double[] findUnionOfArrays(double[] array, double[] tempUnionArray) {

		for (int outerIndex=0; outerIndex<array.length; outerIndex++) {
			boolean isNumberPresent = true;
			for (int innerIndex=0; innerIndex<numberCnt; innerIndex++) {
				if (tempUnionArray[innerIndex]==array[outerIndex]) {
					isNumberPresent = false;
					break;
				}
			}
			if (isNumberPresent) {
				tempUnionArray[numberCnt]=array[outerIndex];
				numberCnt++;
			}
		}
		return tempUnionArray;
	}

	//Create new array which doesn't consist of 0.0
	double[] getUnionOfArrays(double[] tempUnionArray) {
		double[] unionOfArray = new double[numberCnt];

		for (int outerIndex = 0; outerIndex<unionOfArray.length; outerIndex++) {
			unionOfArray[outerIndex] = tempUnionArray[outerIndex];
		}

		return unionOfArray;
	}

	//Display union of two array
	void displayUnionArray(double[] unionOfArray) {
		System.out.println("Union of Two Array : ");
		for (int outerIndex = 0; outerIndex < unionOfArray.length; outerIndex++) {
			System.out.print(unionOfArray[outerIndex] + " ");
		}
	}

	public static void main(String[] args) {
		UnionOfTwoArrays unionOfTwoArrays = new UnionOfTwoArrays();
		double[] array1 = {10.45, 14.0, 18.35, 88.88, 54.10, 18.35, 10.45};
		double[] array2 = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30, 18.35};
		double[] tempUnionArray = new double[array1.length + array2.length];

		tempUnionArray = unionOfTwoArrays.findUnionOfArrays(array1, tempUnionArray); 
		tempUnionArray = unionOfTwoArrays.findUnionOfArrays(array2, tempUnionArray); 
		unionOfTwoArrays.displayUnionArray(unionOfTwoArrays.getUnionOfArrays(tempUnionArray));
	}
}