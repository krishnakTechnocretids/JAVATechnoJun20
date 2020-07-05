package madhuraMJun20;

//int[] number = {10,33,56,43,99,21}
//2 var 
public class Exam4 {
	void findSecondMaxNumber(int[] number) {

		int max = number[0];
		int secondMax = number[number.length - 2];
		for (int index = 0; index < number.length; index++) {
			for (int innerIndex = index + 1; innerIndex < number.length; innerIndex++)
				if (number[index] > number[innerIndex]) {
					max = number[index];
					number[index] = number[innerIndex];
					number[innerIndex] = max;
				}

		}
		secondMax = number[number.length - 2];
		System.out.println("Second Maximum number of array is : " + secondMax);
	}

	public static void main(String[] args) {
		Exam4 exam4 = new Exam4();
		int[] number = { 10, 33, 56, 43, 99, 21, 79 };
		exam4.findSecondMaxNumber(number);
	}

}
