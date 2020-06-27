package aavrutiDJun20.array;

public class AllDifferIndexInArray {

	//Print all the differ index in the given array
	void allDifferIndex(int[] numberArray1,int[] numberArray2) {
		
		if(numberArray1.length == numberArray2.length) {
			for(int index=0;index<numberArray1.length;index++) {
				if(numberArray1[index] != numberArray2[index])
					System.out.println("Values are not matching at index -> " + index);
			}
		}
		else
			System.out.println("Array size is not identical");	
	}
	
	public static void main(String[] args) {
		AllDifferIndexInArray allDifferIndexInArray = new AllDifferIndexInArray();
		
		int[] numberArray1 = {1,2,3,4,5,6};
		int[] numberArray2 = {1,2,5,4,7,6};
		
		allDifferIndexInArray.allDifferIndex(numberArray1,numberArray2);		
	}
}