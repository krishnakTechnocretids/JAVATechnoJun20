package kartikeyDJune20;

public class CountElementsinPreDefindString {
	static void countInString(String input) {
		int cntDig = 0;
		int cntUpper = 0;
		int cntLower = 0;
		int cntSpecial = 0;
		for (int index = 0; index < input.length(); index++) {

			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				cntDig++;
			else if (Character.isLetter(ch)) {

					if (Character.isLowerCase(ch))
					cntLower++;
					else
					cntUpper++;
			} else
				cntSpecial++;

		}
		System.out.println("There are " + cntDig + " digits in " + input);
		System.out.println("There are " + cntLower + " lower in " + input);
		System.out.println("There are " + cntUpper + " Uppercase in " + input);
		System.out.println("There are " + cntSpecial + " Special Characters in " + input);
		System.out.println("There are "+(cntUpper+cntLower)+" Letter in "+input);
	}

	public static void main(String[] args) {
		String input = "1rRpd3F9#K(E";
		CountElementsinPreDefindString.countInString(input);

	}

}
