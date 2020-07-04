package rajAJun20;

public class IntersectionOfArrays {
	int countTemp = 0;
	
	// Common numbers
	void getIntersectionOfArray(double[] array1, double[] array2) {
		double[] tempIntersectionArray = new double[(array1.length)];
		for (int outerIndex = 0; outerIndex < array1.length; outerIndex++) {
			for (int index = 0; index < array2.length; index++) {
				if (array1[outerIndex] == array2[index]) {
					tempIntersectionArray[countTemp] = array1[outerIndex];
					countTemp++;
				}
			}
		}
		findUniqueNumberArray(tempIntersectionArray);
	}

	// Unique numbers
	void findUniqueNumberArray(double[] tempIntersectionArray) {
		System.out.println("Value after Intersection of given two arrays is:");
		int countResult = 0;
		double[] resultArray = new double[countTemp];
		for (int outerIndex = 0; outerIndex < countTemp; outerIndex++) {
			boolean flag = true;
			for (int index = 0; index < countTemp; index++) {
				if (resultArray[index] == tempIntersectionArray[outerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				resultArray[countResult] = tempIntersectionArray[outerIndex];
				countResult++;
			}
		}
		// Print Intersection numbers
		for (int index = 0; index < countResult; index++) {
			System.out.print(resultArray[index] + " ");
		}

	}
	
		public static void main(String[] args) {
		double[] array1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] array2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		new IntersectionOfArrays().getIntersectionOfArray(array1, array2);
	}

}
