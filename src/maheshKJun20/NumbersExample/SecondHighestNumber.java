package maheshKJun20.NumbersExample;

public class SecondHighestNumber {
	
	void displaySecondHigeshtNumber(int[] intArray) {
		int highestNum = intArray[0], secondHighestNum =0;
		for (int index=0; index<intArray.length;index++) {
			if(intArray[index]>highestNum) {
				secondHighestNum = highestNum;
				highestNum = intArray[index];
			}
		}
		System.out.println("Second Highest Number in Array is: " + secondHighestNum);
	}
	
	public static void main(String[] args) {
		SecondHighestNumber secondHighestNumber = new SecondHighestNumber();
		int[] intArray = {10,33,56,43,99,21};
		secondHighestNumber.displaySecondHigeshtNumber(intArray);
	}
}
