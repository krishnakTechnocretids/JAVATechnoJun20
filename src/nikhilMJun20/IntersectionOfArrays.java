/*Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 18.35
Method Signature : double[] getIntersectionOfArray(double[] arr1, double[] arr2)
*/

package nikhilMJun20;

public class IntersectionOfArrays {
	int count;
	
	void getIntersectionOfArrays(double[] array1, double[] array2) {
		int intersctionLength=0;
		if(array1.length > array2.length)
			intersctionLength = array2.length;
		else
			intersctionLength = array1.length;
		double[] tempIntersectionArray = new double[intersctionLength];
		
		//Getting intersection elements
		findUniqueNumberArray(tempIntersectionArray, array1, array2);
		
		//Eliminating zeros
		double[] processArray = new double[count];
		for(int index=0; index<count; index++) {
			processArray[index] = tempIntersectionArray[index];
		}
		
		//Eliminating duplicate entries
		double[] opsArray = new double[count];
		boolean isUnique = true;
		int uniqueCount=0;
		for(int index=0; index<count; index++) {
			isUnique = true;
			for(int innerIndex=0; innerIndex<processArray.length; innerIndex++) {
				if(opsArray[innerIndex] == processArray[index]) {
					isUnique = false;
					break;
				}
			}
			if(isUnique == true) {
				opsArray[uniqueCount] = processArray[index];
				uniqueCount++;
			}
		}
		
		//Creating final Intersection array and printing it.
		double[] intersectionAraay = new double[uniqueCount];
		for(int index=0; index<uniqueCount; index++) {
			intersectionAraay[index] = opsArray[index];
		}
		printArray(intersectionAraay);
	}
	
	void findUniqueNumberArray(double[] tempIntersectionArray, double[] array1, double[] array2) {
		boolean isNumberPresent = false;
		for(int index=0; index<array1.length; index++) {
			isNumberPresent = false;
			for(int innerIndex=0; innerIndex<array2.length; innerIndex++) {
				if(array2[innerIndex] == array1[index]) {
					isNumberPresent = true;
					break;
				}
			}
			if(isNumberPresent == true) {
				tempIntersectionArray[count] = array1[index];
				count++;
			}
		}
	}
	
	void printArray(double[] array) {
		for(int index=0; index<array.length; index++)
			System.out.print(array[index]+"  ");
	}
	
	public static void main(String[] args) {
		IntersectionOfArrays intersectionOfArrays = new IntersectionOfArrays();
		double[] doubleArray1 = {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double[] doubleArray2 = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		//Printing the info
		System.out.println("Input Arrays are:-\nArray 1:");
		intersectionOfArrays.printArray(doubleArray1);
		System.out.println("\n\nArray 2:");
		intersectionOfArrays.printArray(doubleArray2);
		System.out.println("\n\nIntersection of the above two arrays:-");
		//Calling Intersection method
		intersectionOfArrays.getIntersectionOfArrays(doubleArray1, doubleArray2);
	}
}
