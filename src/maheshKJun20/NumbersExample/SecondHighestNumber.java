package maheshKJun20.NumbersExample;

public class SecondHighestNumber {
	
	void displaySecondHigeshtNumber(int[] intArray) {
		int highestNum = 0, secondHighestNum =intArray[0];
		for (int index=0; index<intArray.length;index++) {
			if(intArray[index]>highestNum) {
				secondHighestNum = highestNum;
				highestNum = intArray[index];
			}
			else if (intArray[index]>secondHighestNum) {
				secondHighestNum = intArray[index];
			}
		}
		System.out.println("Second Highest Number in Array is: " + secondHighestNum);
	}
	
	public static void main(String[] args) {
		SecondHighestNumber secondHighestNumber = new SecondHighestNumber();
		int[] intArray =  { 10, 33, 56, 43, 99, 21, 79};
		secondHighestNumber.displaySecondHigeshtNumber(intArray);
	}
}
