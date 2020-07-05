package palakSJun20;

public class SecondHighestNumber {

	void findSecondHighestNumber(int[] array1) {
		int firstHighestN = 0;
		int secondHighestN = 0;
		for (int index = 0; index < array1.length; index++) {
			if (array1[index] > firstHighestN) {
				secondHighestN = firstHighestN;
				firstHighestN = array1[index];
			}
			else if (array1[index] > secondHighestN) {
				secondHighestN = array1[index];
			}
		
		}		
		System.out.println("Second Highest Number is "+secondHighestN);
		
	}

	public static void main(String[] args) {
		int[] array = { 10, 33, 56, 43, 99, 21 , 67 };
		SecondHighestNumber highestNumber = new SecondHighestNumber();
		highestNumber.findSecondHighestNumber(array);
	}

}
