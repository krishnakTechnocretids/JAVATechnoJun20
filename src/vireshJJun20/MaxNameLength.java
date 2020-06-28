package vireshJJun20;

import java.util.Scanner;

class MaxNameLength {

	void countChar(String[] nameList) {
		String LongName= nameList[0];
		int length= LongName.length();
		for (int i = 1; i < nameList.length; i++) {
			if (nameList[i].length() > length) {
				length = nameList[i].length();
				LongName = nameList[i];
			} 
		}
			System.out.print("The longest name from given list is: " + LongName +" with " + length + " characters.");
	}

	public static void main(String[] args) {
		MaxNameLength maxNameLength = new MaxNameLength();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of names to compare:");
		int NamesCnt = scanner.nextInt();
		String[] ar = new String[NamesCnt];
		for (int i = 0; i < ar.length; i++) {
			System.out.print("Enter Name " + (i + 1) + " :");
			ar[i] = scanner.next();
		}
		maxNameLength.countChar(ar);
	}
}
