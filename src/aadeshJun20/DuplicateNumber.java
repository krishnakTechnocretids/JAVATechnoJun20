package aadeshJun20;

public class DuplicateNumber{

	void reverseDisplay(int[] intArr){

		System.out.print(" Reverse number from back :- ");
		for (int i = 0; i < intArr.length; i++){
			for (int j = i + 1; j < intArr.length; j++){
				if (intArr[i] == intArr[j]){
					System.out.println(intArr[i]);
				}
			}
		}
	}

	public static void main(String[] args){
		DuplicateNumber duplicate = new DuplicateNumber();
		int[] intArr = { 8, 5, 7, 6, 5 };
		duplicate.reverseDisplay(intArr);
	}
} 