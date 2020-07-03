package maheshKJun20.ArrayExample;

public class ArrayUnion {
	
	int count = 0;
	
	//Method to Find Union of 2 Arrays
	void findUnionOfArray(double[] arr1, double[] arr2) {
		double[] unionOfArray = new double[arr1.length+arr2.length];
		unionOfArray = findUniqueValueArray(arr2, findUniqueValueArray(arr1, unionOfArray));
		unionOfArray = removeExtraValueArray(unionOfArray);
		displayArrayElements(unionOfArray);
	}
	
	//Method to find Unique values in a Array
	double[] findUniqueValueArray(double[] arr, double[] tempUnionArray) {
		boolean checkDuplicateValue;
		for(int index=0;index<arr.length;index++) {
			checkDuplicateValue = true;
			for(int innerIndex=0;innerIndex<tempUnionArray.length;innerIndex++) {
				if (tempUnionArray[innerIndex] == arr[index]) {
					checkDuplicateValue =false;
				}
			}
			if(checkDuplicateValue) {
				tempUnionArray[count] = arr[index];
				count++;
			}
		}
		return tempUnionArray;
	}
	
	//Method to remove Zero values from double array
	double[] removeExtraValueArray(double[] tempUnionArray) {
		double[] finalArray = new double[count];
		int counter = 0;
		for (int index=0;index<tempUnionArray.length;index++) {
			if (tempUnionArray[index] != 0) { 
				finalArray[counter] = tempUnionArray[index];
				counter++;
			}
		}
		return finalArray;
	}
	
	//Method to print elements in an Array
	void displayArrayElements(double[] unionOfArray){
		System.out.print("Output: ");
		for (int index=0;index<unionOfArray.length;index++) {
			if(index<unionOfArray.length-1)
				System.out.print(unionOfArray[index] + ", ");
			else
				System.out.println(unionOfArray[index]);
		}
	}
	
	public static void main(String[] args) {
		ArrayUnion arrayUnion = new ArrayUnion();
		double[] arr1 = {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double[] arr2 = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		arrayUnion.findUnionOfArray(arr1, arr2);
	}

}
