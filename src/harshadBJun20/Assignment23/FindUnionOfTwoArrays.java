package harshadBJun20.Assignment23;

/*Assignment 23 : 2nd July 2020

Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)*/

public class FindUnionOfTwoArrays {
	int getCount=0;
	void getUnionOfArray(double[] arr1,double[] arr2) {
		double[] temparrUnion = new double[arr1.length+arr2.length];
		
		temparrUnion = findUniqueNumberArray(arr1,temparrUnion);
		temparrUnion = findUniqueNumberArray(arr2,temparrUnion);
		
		double[] resultantArray = new double[getCount];
		System.out.print("Union of Array is: {");
		for(int extraIndex=0;extraIndex<resultantArray.length;extraIndex++) {
			resultantArray[extraIndex] = temparrUnion[extraIndex];
			System.out.print(+resultantArray[extraIndex]+", ");
		}	
		System.out.print("}");
	}
	
	double[] findUniqueNumberArray(double[] givenArray, double[] tempUnionArray) {
		boolean flag = true;
		for(int outerIndex=0;outerIndex<givenArray.length-1;outerIndex++) {
			flag = true;
			for(int innerIndex=0;innerIndex<tempUnionArray.length;innerIndex++) {
				if(tempUnionArray[innerIndex] == givenArray[outerIndex]) {
					flag = false;
					break;
				}
			}	
				if(flag == true) {
					getCount++;
					tempUnionArray[getCount-1] = givenArray[outerIndex];	
				}
				
		}		
		return tempUnionArray;		
	}
	public static void main(String[] args) {
		FindUnionOfTwoArrays findUnionOfTwoArrays = new FindUnionOfTwoArrays();
		double[] arr1 = {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double[] arr2 = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		findUnionOfTwoArrays.getUnionOfArray(arr1, arr2);
	}
}
