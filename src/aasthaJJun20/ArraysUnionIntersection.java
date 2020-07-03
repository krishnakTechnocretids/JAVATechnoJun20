package aasthaJJun20;

public class ArraysUnionIntersection {
	// This method is written just to display the array elements on console
	private void displayArray(double[] input) {
		System.out.print("{ ");
		for (int index = 0; index < input.length; index++) {
			System.out.print(input[index] + "   ");
		}
		System.out.println("}");
	}

	// Below method is written to search a particular element in the provided(input)
	// array
	private boolean searchInArray(double[] input, double element) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] == element)
				return true;
		}
		return false;
	}

	// Program 1: Find union of two arrays.
	public double[] getUnionOfArray(double[] arr1, double[] arr2) {
		double[] unionArray = new double[arr1.length + arr2.length];
		int size = 0;
		for (int index = 0; index < arr1.length; index++) {
			if (searchInArray(unionArray, arr1[index]) == false) {
				unionArray[size] = arr1[index];
				size++;
			}
		}
		for (int index = 0; index < arr2.length; index++) {
			if (searchInArray(unionArray, arr2[index]) == false) {
				unionArray[size] = arr2[index];
				size++;
			}
		}
		double[] unionArrayResult = new double[size];
		for (int index = 0; index < size; index++) {
			unionArrayResult[index] = unionArray[index];
		}
		return unionArrayResult;
	}

	// Program 2: Find intersection(common elements) of two arrays.
	public double[] getIntersectionOfArray(double[] arr1, double[] arr2) {
		int size = 0;
		if (arr1.length > arr2.length)
			size = arr1.length;
		else
			size = arr2.length;
		double[] intersectionArray = new double[size];
		size = 0;
		for (int index = 0; index < arr2.length; index++) {
			if (searchInArray(arr1, arr2[index])) {
				intersectionArray[size] = arr2[index];
				size++;
			}
		}
		double[] intersectionArrayResult = new double[size];
		for (int index = 0; index < size; index++) {
			intersectionArrayResult[index] = intersectionArray[index];
		}
		return intersectionArrayResult;
	}

	public static void main(String[] args) {
		ArraysUnionIntersection arraysUnionIntersection = new ArraysUnionIntersection();
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30, 33.11, 44.22, 88.88 };
		System.out.println("Below are the input arrays : ");
		arraysUnionIntersection.displayArray(arr1);
		arraysUnionIntersection.displayArray(arr2);
		System.out.print("\nUnion of input arrays is : ");
		arraysUnionIntersection.displayArray(arraysUnionIntersection.getUnionOfArray(arr1, arr2));
		System.out.print("\nIntersection of input arrays is: ");
		arraysUnionIntersection.displayArray(arraysUnionIntersection.getIntersectionOfArray(arr1, arr2));
	}
}
