package aavrutiDJun20.array;

public class MissingNumberInArray {
	//Print numbers which are missing from the array
	void missingNumberInArr(int[] numberArray,int startNum,int endNum) {
		for(int index=startNum;index<=endNum;index++) {
			boolean flag = true;
			for(int index2=0;index2<numberArray.length;index2++) {
				if(numberArray[index2] == index) {
					flag = false;
					break;
				}
			}
			if(flag==true)
				System.out.println("Missing Number is : " + index);
		}
	}

	public static void main(String[] args) {
		MissingNumberInArray missingNumberInArray = new MissingNumberInArray();
		
		int startNum=1;
		int endNum=10;

		int[] numberArray = { 1, 2, 4, 5, 6, 11, 7, 9, 10};
		System.out.println("Array with sequence { 1, 2, 4, 5, 6, 11, 7, 9, 10} ");
		missingNumberInArray.missingNumberInArr(numberArray,startNum,endNum);
		
		int[] numberArray2 = { 1, 7, 4, 9, 6, 2, 5};
		System.out.println("\nArray without sequence { 1, 7, 4, 9, 6, 2, 5 } " );
		missingNumberInArray.missingNumberInArr(numberArray2,startNum,endNum);
	}
}