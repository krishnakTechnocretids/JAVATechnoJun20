package barkhaPJun20;

public class ClassTestDebug {

	void frequencyOfNumber(int[] array, int number) {
		int count = 0;

		for (int index = 0; index < array.length; index++) {
			if (array[index] == number)
				count++;
		}
		if (count == 0)
			System.out.println("Given Number " + number + " is not present in predefined array ");
		else
			System.out.println("Given Number " + number + " is present in predefined array with frequency " + count);
	}

	public static void main(String[] args) {
		ClassTestDebug arrayFreqOfNumber = new ClassTestDebug();
		int[] array1 = { 10, 3, 9, -99, 81, 3, -11 };
		arrayFreqOfNumber.frequencyOfNumber(array1, 30);
		arrayFreqOfNumber.frequencyOfNumber(array1, -99);
		arrayFreqOfNumber.frequencyOfNumber(array1, 11);
	}

}