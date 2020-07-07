package technoCredits;
import java.util.Arrays;

public class ArrayIntersectionOperation {
	int resultIndex = 0;

	// Method returns intersection array of two input arrays
	double[] findIntersectionOfArrays(double[] inputArray1, double[] inputArray2) {
		ArrayUnionOperation arrayUnionOperation = new ArrayUnionOperation();
		Arrays.sort(inputArray1 = arrayUnionOperation.distinctArray(inputArray1));
		Arrays.sort(inputArray2 = arrayUnionOperation.distinctArray(inputArray2));
		double[] interSectionArray = new double[inputArray1.length];
		if (inputArray2.length < inputArray1.length)
			interSectionArray = new double[inputArray2.length];
		for (int index1 = 0; index1 < inputArray1.length; index1++) {
			for (int index2 = 0; index2 < inputArray2.length; index2++) {
				if (inputArray1[index1] == inputArray2[index2]) {
					interSectionArray[resultIndex] = inputArray1[index1];
					resultIndex++;
				}
			}
		}
		findUniqueNumberArray(interSectionArray);
		return (interSectionArray);
	}

	double[] findUniqueNumberArray(double[] tempIntersectionArray) {
		int count = 0;
		double[] resultArray = new double[resultIndex];
		for (int outerIndex = 0; outerIndex < resultIndex; outerIndex++) {
			boolean flag = true;
			for (int innerIndex = 0; innerIndex < resultIndex; innerIndex++) {
				if (resultArray[innerIndex] == tempIntersectionArray[outerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				resultArray[count] = tempIntersectionArray[outerIndex];
				count++;
			}
		}
		Arrays.sort(resultArray);
		System.out.println("\nIntersection Array -> " + Arrays.toString(resultArray));
		return resultArray;
	}

	public static void main(String[] args) {
		ArrayIntersectionOperation arrayIntersectionOperation = new ArrayIntersectionOperation();
		double[] inputArr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35, 88.88 };
		double[] inputArr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30, 54.10 };
		// double[] inputArr1 = { 1, 1, 0 , 2};
		// double[] inputArr2 = { 2, 2, 1, 0 };
		System.out.println(
				"Input Array1 -> " + Arrays.toString(inputArr1) + "\nInput Array2 -> " + Arrays.toString(inputArr2));
		arrayIntersectionOperation.findIntersectionOfArrays(inputArr1, inputArr2);
	}
} 