package aavrutiDJun20.array;

public class MaxValueAtDifferIndex {
	
	//Find and Print max value at differed index.
	void maxAllDifferIndex(int[] numberArray1,int[] numberArray2) {
		
		if(numberArray1.length == numberArray2.length) {
			for(int index=0;index<numberArray1.length;index++) {
				if(numberArray1[index] != numberArray2[index]) {
					if(numberArray1[index] > numberArray2[index])
						System.out.print("\nValues are not matching at index -> " + index + ", From (" + numberArray1[index] + "," + numberArray2[index] + ") max value is " + numberArray1[index]);
					else
						System.out.print("\nValues are not matching at index -> " + index + ", From (" + numberArray1[index] + "," + numberArray2[index] + ") max value is " + numberArray2[index]);				
				}					
			}
		}
		else
			System.out.println("Array size is not identical");	
	}
	
	public static void main(String[] args) {
		MaxValueAtDifferIndex maxValueAtDifferIndex = new MaxValueAtDifferIndex();
		
		int[] numberArray1 = {1,2,3,4,5,6};
		int[] numberArray2 = {1,2,5,4,7,6};
		
		maxValueAtDifferIndex.maxAllDifferIndex(numberArray1,numberArray2);		
	}
}