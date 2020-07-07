package harshadBJun20.Assignment23;

/*Program 2: Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 18.35
Method Signature : double[] getIntersectionOfArray(double[] arr1, double[] arr2)*/

public class FindIntersectionOfTwoArray {

	int getIntersectionCount=0;
	void getIntersectionOfArray(double[] arr1,double[] arr2) {
		double[] temparrIntersection = new double[arr1.length+arr2.length];
		
		for(int outerIndex=0;outerIndex<arr1.length;outerIndex++) {
			for(int innerIndex=0;innerIndex<arr2.length;innerIndex++) {
				if(arr1[outerIndex] == arr2[innerIndex]) {
					temparrIntersection[getIntersectionCount] = arr1[outerIndex];
					getIntersectionCount++;
				}
			}	
		}
		
		double[] resultantArray = new double[getIntersectionCount-1];
		System.out.print("Intersection of Array is: {");
		for(int extraIndex=0;extraIndex<resultantArray.length;extraIndex++) {
			resultantArray[extraIndex] = temparrIntersection[extraIndex];
			System.out.print(resultantArray[extraIndex]+", ");
		}	
		System.out.print("}");
	}
	
	public static void main(String[] args) {
		FindIntersectionOfTwoArray findIntersectionOfTwoArray = new FindIntersectionOfTwoArray();
		double[] arr1 = {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double[] arr2 = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		findIntersectionOfTwoArray.getIntersectionOfArray(arr1, arr2);
	}
}
