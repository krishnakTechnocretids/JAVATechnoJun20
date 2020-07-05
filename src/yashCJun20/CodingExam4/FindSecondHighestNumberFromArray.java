package yashCJun20.CodingExam4;

public class FindSecondHighestNumberFromArray {
	
	void toFindSecondHighestNumberFromArray(int[] number) {
		
		int firstNumber=Integer.MIN_VALUE;;
		int secondNumber=Integer.MIN_VALUE;;
		for (int index=0;index<number.length;index++) {
			if(number[index]>firstNumber) {
				secondNumber=firstNumber;
				firstNumber=number[index];
			}
			else if (number[index] > secondNumber && number[index] != firstNumber) 
				secondNumber = number[index]; 
			
		}
		System.out.print("The second highest number Is " + secondNumber);
	}
	public static void main(String[] args) {
	FindSecondHighestNumberFromArray findSecondHighestNumberFromArray = new FindSecondHighestNumberFromArray();
	int[] number = {10,33,56,43,99,21};
	findSecondHighestNumberFromArray.toFindSecondHighestNumberFromArray(number);
}

}