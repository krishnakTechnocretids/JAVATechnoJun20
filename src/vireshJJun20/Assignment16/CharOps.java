package vireshJJun20.Assignment16;

import java.util.Scanner;

public class CharOps {

	void oneCharFreq(String Name, String chr) {
		int cnt = 0;
		for (int i = 0; i < Name.length(); i++) {
			String temp = String.valueOf(Name.charAt(i));
			if (temp.equals(chr)) {
				cnt++;
			}
		}
		if (cnt != 0)
			System.out.println(" - Given Character " + chr + " is present " + cnt + " times in a given name: " + Name);
		else
			System.out.println(" - Given Character " + chr + " is not present in a given name: " + Name);
	}

	void AllCharFreq(String Name) { // aabc

		for (int i = 0; i < Name.length(); i++) {
			int cnt = 0;
			for (int j = 0; j < Name.length(); j++) {
				if (Name.charAt(i) == Name.charAt(j)) {
					cnt++;
				}
			}
			System.out.println(" - " + Name.charAt(i) + " > " + cnt);
		}
	}

	void AllCharFreqArray(String[] arr) {

		for (int i = 0; i < arr.length; i++) {
			AllCharFreq(arr[i]);
			System.out.println("=======================");
		}
	}

	public static void main(String[] args) {
		CharOps charOps = new CharOps();
		Scanner scanner = new Scanner(System.in);
		String[] arr = { "raj", "aarya", "aavruti", "shruti" };
		System.out.println("**Below logic is to search the asked character frequency in the asked name.");
		System.out.print(" - Enter a name: ");
		String name = scanner.next();
		System.out.print(" - Enter a Character: ");
		String chr = scanner.next();
		charOps.oneCharFreq(name, chr);
		System.out.print(
				"**Do you want to check the logic: to search the frequency of each character in a given name? (y/n)");
		String tmp1 = scanner.next();
		if (tmp1.equals("y")) {
			System.out.print(" - Enter a name: ");
			String name1 = scanner.next();
			System.out.print(" - The name is: " + name1);
			charOps.AllCharFreq(name1);
		}
		System.out.print(
				"**Do you want to check the logic: to search the frequency of each character in each name of a pre-defined aray? (y/n)");
		String tmp2 = scanner.next();
		if (tmp2.equals("y")) {
			System.out.print(" - How many numbers to add:  ");
			int num = scanner.nextInt();
			String[] nArray = new String[num];
			for (int i = 0; i < nArray.length; i++) {
				System.out.print(" - Enter name " + (i + 1) + " : ");
				nArray[i] = scanner.next();

			}
			charOps.AllCharFreqArray(nArray);

		}
		scanner.close();
	}

}
