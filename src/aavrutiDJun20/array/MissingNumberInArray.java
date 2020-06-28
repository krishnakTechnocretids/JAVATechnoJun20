package aavrutiDJun20.array;

public class MissingNumberInArray {
	//Print numbers which are missing from the array
	void missingNumberInArr(int[] numberArray) {
		for(int index=1;index<=10;index++) {
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

		int[] numberArray = { 1, 2, 4, 5, 6, 11, 7, 9, 10};
		System.out.println("Array with sequence { 1, 2, 4, 5, 6, 11, 7, 9, 10}");
		missingNumberInArray.missingNumberInArr(numberArray);
		
		int[] numberArray2 = { 1, 7, 4, 9, 6, 2, 5};
		System.out.println("\nArray without sequence { 1, 7, 4, 9, 6, 2, 5 }");
		missingNumberInArray.missingNumberInArr(numberArray2);
	}
}