package ajitSJune20;

public class ArraysUnion {
	int count = 0;

	void findCombinedArray(double[] array1, double[] array2) {
		double[] tempArray = new double[(array1.length + array2.length)];
		boolean flag;
		for (int outerIndex = 0; outerIndex < array1.length; outerIndex++) {
			flag = true;
			for (int innerIndex = 0; innerIndex < tempArray.length; innerIndex++) {
				if (tempArray[innerIndex] == array1[outerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				tempArray[count] = array1[outerIndex];
				count++;
			}
		}
		for (int outerIndex = 0; outerIndex < array2.length; outerIndex++) {
			flag = true;
			for (int innerIndex = 0; innerIndex < tempArray.length; innerIndex++) {
				if (tempArray[innerIndex] == array2[outerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				tempArray[count] = array2[outerIndex];
				count++;
			}
		}
		findArrayOfUniqueElements(tempArray);
	}

	void findArrayOfUniqueElements(double[] tempArray) {
		System.out.println("\nUnion of array is:");
		double[] resultArray = new double[count];
		for (int index = 0; index < resultArray.length; index++) {
			resultArray[index] = tempArray[index];
		}
		for (int index = 0; index < resultArray.length; index++) {
			System.out.print(resultArray[index] + " , ");
		}
	}

	public static void main(String[] args) {
		ArraysUnion arraysUnion = new ArraysUnion();
		double[] array1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		System.out.println("Array1 : " + "{ 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 }");
		double[] array2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		System.out.println("Array2 : " + "{ 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 }");
		arraysUnion.findCombinedArray(array1, array2);
	}
}