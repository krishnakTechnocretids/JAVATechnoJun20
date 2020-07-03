/*Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
       arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)
*/

package nikhilMJun20;

public class UnionOfArrays {
	int count;
	
	void getUnionOfArrays(double[] array1, double[] array2) {
		double[] tempUnionArray = new double[array1.length + array2.length];
		tempUnionArray = findUniqueNumberArray(tempUnionArray, array1);
		tempUnionArray = findUniqueNumberArray(tempUnionArray, array2);
		//Eliminating zeros
		double[] unionArray = new double[count];
		for(int index=0; index<count; index++) {
			unionArray[index] = tempUnionArray[index];
		}
		//Printing the Union Array
		printArray(unionArray);
	}
	
	double[] findUniqueNumberArray(double[] processArray, double[] array) {
		boolean isNumberPresent = false;
		for(int index=0; index<array.length; index++) {
			isNumberPresent = false;
			for(int innerIndex=0; innerIndex<count; innerIndex++) {
				if(processArray[innerIndex] == array[index]) {
					isNumberPresent = true;
					break;
				}
			}
			if(isNumberPresent == false) {
				processArray[count] = array[index];
				count++;
			}
		}
		return processArray;
	}
	
	void printArray(double[] array) {
		for(int index=0; index<array.length; index++)
			System.out.print(array[index]+"  ");
	}
	
	public static void main(String[] args) {
		UnionOfArrays unionOfArrays = new UnionOfArrays();
		double[] doubleArray1 = {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double[] doubleArray2 = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		//Printing the info
		System.out.println("Input Arrays are:-\nArray 1:");
		unionOfArrays.printArray(doubleArray1);
		System.out.println("\n\nArray 2:");
		unionOfArrays.printArray(doubleArray2);
		System.out.println("\n\nUnion of the above two arrays:-");
		//Calling Union method
		unionOfArrays.getUnionOfArrays(doubleArray1, doubleArray2);
	}
}
