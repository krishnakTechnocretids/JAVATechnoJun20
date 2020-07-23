package piyushPJun20;
public class Intersection {
	void getIntersectionOfArray(double[] arr1, double[] arr2) {
		double[] uniqueArray1 = new double[arr1.length];
		double[] uniqueArray2 = new double[arr2.length];
		uniqueArray1 = findUniqueNumberArray(arr1, uniqueArray1);
		uniqueArray2 = findUniqueNumberArray(arr2, uniqueArray2);

		double[] outputArray = new double[uniqueArray1.length];
		displayIntersectionOfArray(uniqueArray1, uniqueArray2, outputArray);
	}

	void displayIntersectionOfArray(double[] uniqueArray1, double[] uniqueArray2, double[] outputArray) {
		int count = 0;
		for (int index = 0; index < uniqueArray1.length; index++) {
			for (int innerIndex = 0; innerIndex < uniqueArray2.length; innerIndex++)
				if (uniqueArray1[index] == uniqueArray2[innerIndex]) {
					outputArray[count] = uniqueArray1[index];
					count++;
				}
		}
		for (int index = 0; index < count; index++)
			System.out.print(outputArray[index] + ",");
	}

	double[] findUniqueNumberArray(double[] arr1, double[] tempUnionArray) {
		boolean flag = false;
		int count = 0;
		for (int index = 0; index < arr1.length; index++) {
			flag = false;
			for (int innerIndex = 0; innerIndex < tempUnionArray.length; innerIndex++) {
				if (arr1[index] == tempUnionArray[innerIndex]) {
					flag = true;
				}
			}
			if (flag == false) {
				tempUnionArray[count] = arr1[index];
				count++;
			}
		}
		double[] uniqueArray = new double[count];
		for (int index = 0; index < uniqueArray.length; index++) {
			uniqueArray[index] = tempUnionArray[index];
		}
		return uniqueArray;
	}

	public static void main(String[] agrs) {
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		new Intersection().getIntersectionOfArray(arr1, arr2);
	}
}