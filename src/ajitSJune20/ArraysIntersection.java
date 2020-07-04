package ajitSJune20;

public class ArraysIntersection {
	int count = 0;

	// Get common elements from Array1 & Array2
	void findIntersection(double[] array1, double[] array2) {
		int length = array2.length;
		if (array1.length < array2.length)
			length = array1.length;
		double[] tempArray = new double[length];
		for (int outerIndex = 0; outerIndex < array1.length; outerIndex++) {
			for (int innerIndex = 0; innerIndex < array2.length; innerIndex++) {
				if (array1[outerIndex] == array2[innerIndex]) {
					tempArray[count] = array1[outerIndex];
					count++;
				}
			}
		}
		FindIntersectionWithUniqueNumbers(tempArray);
	}

	// Array which will hold unique Elements
	void FindIntersectionWithUniqueNumbers(double[] tempArray) {
		System.out.println("\nIntersection of the array is:");
		int resultCount = 0;
		double[] resultArray = new double[count];
		for (int outerIndex = 0; outerIndex < count; outerIndex++) {
			boolean flag = true;
			for (int innerIndex = 0; innerIndex < count; innerIndex++) {
				if (resultArray[innerIndex] == tempArray[outerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				resultArray[resultCount] = tempArray[outerIndex];
				resultCount++;
			}
		}
		// Print Intersection Elements
		for (int index = 0; index < resultCount; index++) {
			System.out.print(resultArray[index] + " , ");
		}

	}

	public static void main(String[] args) {
		ArraysIntersection arraysIntersection = new ArraysIntersection();

		double[] array1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		System.out.println("Array1 : " + "{ 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 }");
		double[] array2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		System.out.println("Array2 : " + "{ 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 }");
		arraysIntersection.findIntersection(array1, array2);
	}

}