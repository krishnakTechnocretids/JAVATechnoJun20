package kARAN1595;

public class FindCharaterIndex {
	void countChars(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (index == input.indexOf(input.charAt(index))) {
				if (input.indexOf(input.charAt(index)) != input.lastIndexOf(input.charAt(index))) {
					System.out.println(input.charAt(index) + " -> first index = " + input.indexOf(input.charAt(index)));
					System.out.println(" Last index = " + input.lastIndexOf(input.charAt(index)));
				}
			}
		}
	}

	public static void main(String[] args) {
		FindCharaterIndex findCharaterIndex = new FindCharaterIndex();
		findCharaterIndex.countChars("technocredits");
	}
}