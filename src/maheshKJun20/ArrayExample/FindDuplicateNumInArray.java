//Find duplicate number on Integer array in Java?
package maheshKJun20.ArrayExample;

public class FindDuplicateNumInArray {

	void displayDuplicateNum(int[] intArray) {
		//Method to Check and Display duplicate number in an array
		System.out.println("Duplicate Number are:");
		for (int index=0; index<intArray.length;index++) {
			for (int innerIndex=index+1; innerIndex<intArray.length;innerIndex++) {
				if (intArray[index] == intArray[innerIndex]) {
					System.out.println(intArray[index]);
					break;
				}
			}	
		}
	}
	
	public static void main(String[] args) {
		FindDuplicateNumInArray findDuplicateNumInArray = new FindDuplicateNumInArray();
		int[] intArray = {0, 3, 1, 2, 3};
		findDuplicateNumInArray.displayDuplicateNum(intArray);
	}
}
