public class Union {
	static int count = 0;

	void findUnionOfArray(double[] arr1, double[] arr2) {
		double[] tempUnionArray = new double[(arr1.length + arr2.length)];
		tempUnionArray = findUniqueNumberArray(arr1, tempUnionArray);
		tempUnionArray = findUniqueNumberArray(arr2, tempUnionArray);

		double[] finalUnionArray = new double[count];
		for (int index = 0; index < finalUnionArray.length; index++) {
			finalUnionArray[index] = tempUnionArray[index];
			System.out.print(finalUnionArray[index] + ",");
		}
	}

	double[] findUniqueNumberArray(double[] arr1, double[] tempUnionArray) {
		boolean flag = false;
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
		return tempUnionArray;
	}

	public static void main(String[] agrs) {
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		new Union().findUnionOfArray(arr1, arr2);
	}
}