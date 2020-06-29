package aadeshJun20;

public class MissingNumber {

	void displayMissingNumber(int[] intArr) {

		boolean flag;
		System.out.println(" Missing Numbers are :- ");
		for (int index=1; index<=10; index++) {
			flag = true;
			for (int j=0; j<intArr.length; j++) {
				if (index == intArr[j]) {
					flag = true;
					 break;
				}
				flag = false;
			}
			if(!flag) {
				System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		MissingNumber missingNumber = new MissingNumber();
		int[] intArr = {1,2,5,6,8,9};
		missingNumber.displayMissingNumber(intArr);
	}

} 