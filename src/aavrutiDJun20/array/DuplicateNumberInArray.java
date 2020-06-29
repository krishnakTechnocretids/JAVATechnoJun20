package aavrutiDJun20.array;

public class DuplicateNumberInArray {
	//Print Duplicate Number available in Array
	void duplicateNumberInArr(int[] numberArray) {
		String str[] = new String[numberArray.length];
		
		for(int outerIndex=0;outerIndex<numberArray.length;outerIndex++) {
			int numberCnt=1;
			for(int innerIndex=outerIndex+1;innerIndex<numberArray.length;innerIndex++) {
				if(numberArray[outerIndex]==numberArray[innerIndex]) {
					str[innerIndex]="*";
					numberCnt++;
				}
			}
			if(numberCnt>1 && str[outerIndex] != "*")
				System.out.println("Duplicate Number in array is : " + numberArray[outerIndex]);
		}
	}

	public static void main(String[] args) {
		DuplicateNumberInArray duplicateNumberInArray = new DuplicateNumberInArray();
		
		int[] numberArray = {1,1,2,3,1,4,4,5,6};
		System.out.println("Array value is {1,1,2,3,1,4,4,5,6}\n");
		duplicateNumberInArray.duplicateNumberInArr(numberArray);		
	}
}