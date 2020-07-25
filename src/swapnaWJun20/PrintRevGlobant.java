package swapnaWJun20;

public class PrintRevGlobant {

	void printString() {
		String input = "Globant";
		for (int index = 0; index < input.length(); index++) {
			for (int index1 = index; index1 < input.length(); index1++) {
				if (index == index1)
					System.out.print(Character.toUpperCase(input.charAt(index1)));
				else
					System.out.print(input.charAt(index1));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new PrintRevGlobant().printString();
	}
}
