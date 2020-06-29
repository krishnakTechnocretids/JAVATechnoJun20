package rajAJun20;

public class MissingNumber {
	
	void findMissingNumber(int[] input) {
		int sum = 0, differSum = 0;
		for (int index = 1; index <= 10; index++) {
			sum = sum + index;
		}
		for (int index = 0; index < input.length; index++) {
			differSum = differSum + input[index];
		}
		System.out.println("The missing integer is: " + (sum - differSum));
	}

	public static void main(String[] args) {
		MissingNumber missingNumber = new MissingNumber();
		
		int[] numArray = {1,2,3,4,5,6,8,9,10};
		
		missingNumber.findMissingNumber(numArray);
	}
}
