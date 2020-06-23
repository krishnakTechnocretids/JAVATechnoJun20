package abhishekSJun20;

//Find the frequency of character from a given String array.
//Note: Take String array and character from the user
import java.util.Scanner;

public class FrequencyOfCharaterInString {

	void printFreqOfChar(String[] array, char ch) {
		// int count=0;
		for (int index = 0; index < array.length; index++) {
			int count = 0;
			String input = array[index];
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == ch)
					count++;
			}
			System.out.println("Total number of " + ch + " in String " + input + " : " + count);
		}
	}

	public static void main(String[] args) {
		FrequencyOfCharaterInString freqofchar = new FrequencyOfCharaterInString();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter size of StringArray :");
		int size = scanner.nextInt();
		String[] num = new String[size];

		for (int index = 0; index < size; index++) {
			System.out.print("PLease enter name " + (index + 1) + " to find char in it:");
			num[index] = scanner.next();
		}
		System.out.print("Please any letter you want to count in given name:");
		char ch = scanner.next().charAt(0);

		freqofchar.printFreqOfChar(num, ch);

		scanner.close();

	}

}