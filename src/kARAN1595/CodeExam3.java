package kARAN1595;


public class CodeExam3 {

	public static void main(String args[]) {
		int[] myArray = { 2, 4, 3, 5, 7, 8, 9, -1 };

		// Reading the number
		int num=7;
		
		for (int innerIndex = 0;  innerIndex< myArray.length; innerIndex++) {
			for (int outerIndex = innerIndex; outerIndex < myArray.length; outerIndex++) {
				if ((myArray[innerIndex] + myArray[outerIndex]) == num && innerIndex != outerIndex) {
					System.out.println("Indexs of the pair nos whose sum is 7 are:"+innerIndex + ", " + outerIndex);
				}
			}
		}
	}
}
