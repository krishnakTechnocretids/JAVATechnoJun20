package aavrutiDJun20.array;

public class DifferIndexInArray {
	
	//Print at which index value is not getting matched
	void differIndex(int[] numberArray1,int[] numberArray2) {
		
		if(numberArray1.length == numberArray2.length) {
			for(int index=0;index<numberArray1.length;index++) {
				if(numberArray1[index] != numberArray2[index]) {
					System.out.println("Values are not matching at index -> " + index);
					return;
				}
			}
		}
		else
			System.out.println("Array size is not identical");	
	}
	
	public static void main(String[] args) {
		DifferIndexInArray differIndexInArray = new DifferIndexInArray();
		
		int[] numberArray1 = {1,2,3,4,5,6};
		int[] numberArray2 = {1,2,5,4,7,6};
		
		differIndexInArray.differIndex(numberArray1,numberArray2);		
	}
}