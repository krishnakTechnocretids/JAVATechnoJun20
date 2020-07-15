package deavinaSJun20;

public class IntersectionOfTwoArrays {
	int countOfTempArray = 0;

	public static void main(String[] args) {
		double[] array1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] array2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		new IntersectionOfTwoArrays().getIntersectionOfArray(array1, array2);
	}

	void getIntersectionOfArray(double[] array1, double[] array2) {
		int length = array2.length;
		if (array1.length < array2.length)
			length = array1.length;
		double[] tempIntersectionArray = new double[length];
		for (int outerIndex = 0; outerIndex < array1.length; outerIndex++) {
			for (int index = 0; index < array2.length; index++) {
				if (array1[outerIndex] == array2[index]) {
					tempIntersectionArray[countOfTempArray] = array1[outerIndex];
					countOfTempArray++;
				}
			}
		}
		findUniqueNumberArray(tempIntersectionArray);
	}

	void findUniqueNumberArray(double[] tempIntersectionArray) {
		System.out.println("Intersection of given two arrays is:");
		int countOfResultArray = 0;
		double[] resultArray = new double[countOfTempArray];
		for (int outerIndex = 0; outerIndex < countOfTempArray; outerIndex++) {
			boolean flag = true;
			for (int index = 0; index < countOfResultArray; index++) {
				if (resultArray[index] == tempIntersectionArray[outerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				resultArray[countOfResultArray] = tempIntersectionArray[outerIndex];
				countOfResultArray++;
			}
		}

		for (int index = 0; index < countOfResultArray; index++) {
			System.out.print(resultArray[index] + " ");
		}

	}
}