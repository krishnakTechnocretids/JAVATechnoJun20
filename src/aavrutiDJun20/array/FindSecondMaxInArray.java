package aavrutiDJun20.array;

public class FindSecondMaxInArray {
	
	void findSecondMax(int[] numberArray) {
		int firstMax= numberArray[0];
		int secondMax = numberArray[0];
		
		for(int index=0;index<numberArray.length;index++) {
			if(numberArray[index] > firstMax) {
				secondMax = firstMax;
				firstMax = numberArray[index];
			}
			else if (numberArray[index] > secondMax){
				secondMax = numberArray[index];
			}
		}	
		System.out.println("Second Max Number is: " + secondMax);
	}
	
	public static void main(String[] args) {
		FindSecondMaxInArray findSecondMaxInArray = new FindSecondMaxInArray();
		int[] numberArray = {10,33,56,43,99,21,79,100};
		
		findSecondMaxInArray.findSecondMax(numberArray);		
	}
}
