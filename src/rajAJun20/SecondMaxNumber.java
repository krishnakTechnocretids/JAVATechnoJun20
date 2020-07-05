package rajAJun20;

public class SecondMaxNumber {
	
	void findSecondMaxNumberFromArray(int[] number) {
		
		int firstHighestNumber = number[0];
		int secondHighestNumber = number[0];
		for(int index = 0 ; index < number.length; index++) {
			if(number[index] > firstHighestNumber) {
				secondHighestNumber = firstHighestNumber; 
				firstHighestNumber = number[index];
			}  else if (number[index] > secondHighestNumber) {
				secondHighestNumber = number[index];
			}
		}
		System.out.println("Second Highest number of array is :" +secondHighestNumber);
	}
	
	public static void main(String[] args) {
		SecondMaxNumber secondMaxNUmber = new SecondMaxNumber();
		int[] array = {10,33,56,43,99,21,79};
		secondMaxNUmber.findSecondMaxNumberFromArray(array);
	}
}
