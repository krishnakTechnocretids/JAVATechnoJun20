package vaishnaviVJun20_arrayExamples;

//Find the missing number in integer array of 1 to 10

public class MissingNumber {
	
	void findMissingNumberInArray(int[] numArray) {
		int totalNum = numArray.length+1;
		int totalSum= totalNum*(totalNum+1)/2;
		int sum = 0;
		for(int index=0;index<numArray.length;index++) {
			sum+=numArray[index];
		}
		int missingNumber = totalSum - sum;
		System.out.println("Missing number from an aaray is: "+missingNumber);
	}

	public static void main(String[] args) {
		MissingNumber missingNumber = new MissingNumber();
		int[] array = {1,2,3,4,5,6,8,9,10};
		missingNumber.findMissingNumberInArray(array);
	}

}
