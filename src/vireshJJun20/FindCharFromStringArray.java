package vireshJJun20;

import java.util.Scanner;

public class FindCharFromStringArray {

	void getChar(String[] ar, char ch) {
		/*
		 * This method displays individual names from the array-list that contains
		 * specified character, and number of times that character is repeated in the
		 * given array
		 */
		int cnt = 0;
		for (int x = 0; x < ar.length; x++) {
			String name = ar[x];
			for (int y = 0; y < name.length(); y++) {
				String tempch = String.valueOf(name.charAt(y)); // to convert character from char type to String type
				String chTostr = String.valueOf(ch);
				if (tempch.equals(chTostr)) {  				//(tempch.equalsIgnoreCase(chTostr)
					cnt++;
					System.out.println(" - Name containing " + ch + ": " + name);
				}
			}
		}
		System.out.println(" - Character " + ch + " is used " + cnt + " times in the give names.");
		System.out.println("");
	}

	public static void main(String[] ar) {
		FindCharFromStringArray findCharFromStringArray = new FindCharFromStringArray();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of names: ");
		int count = scanner.nextInt();
		System.out.println("");
		String[] nameList = new String[count];
		for (int index = 0; index < nameList.length; index++) {
			System.out.print("Enter names: ");
			nameList[index] = scanner.next();
		}
		boolean cnd = false;
		while (cnd == false) {	// while loop to check if user wants to check characters multiple times from the given list 
			System.out.println("");
			System.out.print("Enter the character you want to search: ");
			char ch = scanner.next().charAt(0);
			findCharFromStringArray.getChar(nameList, ch);
			System.out.print("Do you want to continue seaching another character? Y/N :");
			String ans = scanner.next();
			if (ans.equals("Y") || ans.equals("y"))
				cnd = false;
			else if (ans.equals("N") || ans.equals("n")) {
				cnd = false;
				System.out.println("See you again!!");
				break;
			}
		}
		scanner.close();
	}
}
