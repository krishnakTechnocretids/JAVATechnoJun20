//Find the missing number in integer array of 1 to 10?

package maheshKJun20.ArrayExample;

public class MissingNumInIntegarArray1To10 {
	
	void displayMissingNum(int[] intArray) {
		//Method to find and display missing number in Integer Array
		boolean flag;
		System.out.println("Missing Numbers are:");
		for (int index=1;index<=10;index++) {
			flag = true;
			for (int innerIndex=0; innerIndex<intArray.length;innerIndex++) {
				if (index == intArray[innerIndex]) {
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
		MissingNumInIntegarArray1To10 missingNumInIntegarArray1To10 = new MissingNumInIntegarArray1To10();
		int[] intArray = {1,2,3,4,5,6,8,9,10};
		missingNumInIntegarArray1To10.displayMissingNum(intArray);
	}

}
