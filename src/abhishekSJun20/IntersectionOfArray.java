package abhishekSJun20;
/*Program 2: Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}
Output: 10.45, 18.35
Method Signature : double[] getIntersectionOfArray(double[] arr1, double[] arr2)*/


public class IntersectionOfArray  {
    int count = 0;
	void findIntersectionOfArray(double[] arr1, double[] arr2) {
		int sizeOfIntersectionArray = arr1.length + arr2.length;//comment
		double[] arr3 = new double[sizeOfIntersectionArray];
		// compared first Array arr1 with arr2 and formed new array arr3 with common elements of arr1 and arr2
		for (int outerindex = 0; outerindex < arr1.length-1; outerindex++) {
			for (int innerindex = 0; innerindex < arr2.length; innerindex++) {
				if (arr1[outerindex] == arr2[innerindex]) {
					arr3[count] = arr1[outerindex];
					count++;
				}
			}
		}
		//removed all zeros from an intersection of array and formed new array with nonzero elements
		double[] intersectionOfTwoArray = new double[count];
		int newindex = 0;
		for (int index = 0; index < arr3.length; index++) {
			if (arr3[index] > 0) {
				intersectionOfTwoArray[newindex] = arr3[index];
				newindex++;
			}
		}
		displayArrayUnion(intersectionOfTwoArray); // display intersection of given arrays
	}
	//displayed intersection of array array in format like{,}
	void displayArrayUnion(double[] intersectionOfTwoArray) {
		System.out.println("Intersection of two array is :");
		System.out.print("{");
		for (int index = 0; index < intersectionOfTwoArray.length; index++) {
			System.out.print("" + intersectionOfTwoArray[index]+ "");
			if (index < intersectionOfTwoArray.length) {
				System.out.print(",");
			}
		}
		System.out.print("}");
	}
	
	public static void main(String[] args) {
		IntersectionOfArray intersectionOfArray = new IntersectionOfArray();
		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		System.out.println(" Array Inputs:");
		System.out.println("{10.45, 14.0, 18.35, 88.88, 54.10, 18.35}");
		System.out.println("{17.20, 13.30, 10.45, 18.35, 84.33, 13.30}");
		intersectionOfArray.findIntersectionOfArray(arr1, arr2);
	}
	
}
