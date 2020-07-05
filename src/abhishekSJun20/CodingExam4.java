package abhishekSJun20;

public class CodingExam4 {
	//method to find second largest number in array
	void maxSecond(int[] number) {
		int highestNum = number[0];
		int secondHighNum = number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i] > highestNum) {
				secondHighNum = highestNum;
				highestNum = number[i];
			} else if (number[i] > secondHighNum) {
				secondHighNum = number[i];
			}
		}
		System.out.println("Second Maximum number is: " + secondHighNum);
	}
	
	public static void main(String[] args) {
		CodingExam4 CodingExam4 = new CodingExam4();
		int array[] = { 10, 33, 56, 43, 99, 21 };
		CodingExam4.maxSecond(array);
	}
}


		
		

			