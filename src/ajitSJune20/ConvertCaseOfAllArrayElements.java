package ajitSJune20;

public class ConvertCaseOfAllArrayElements {

	void convertCaseOfStrings(String[] array) {
		for (int outerIndex = 0; outerIndex < array.length; outerIndex++) {
			String convertedCaseString = "";
			for (int innerIndex = 0; innerIndex < array[outerIndex].length(); innerIndex++) {
				if (array[outerIndex].charAt(innerIndex) >= 'A'
						&& array[outerIndex].charAt(innerIndex) <= 'Z')
					convertedCaseString += (char) (array[outerIndex].charAt(innerIndex) + 32);
				else
					convertedCaseString += (char) (array[outerIndex].charAt(innerIndex) - 32);
			}
			array[outerIndex] = convertedCaseString;
		}
		displayString(array);
	}

	void displayString(String[] array) {
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}

	public static void main(String[] args) {
		ConvertCaseOfAllArrayElements convertCaseOfAllArrayElements = new ConvertCaseOfAllArrayElements();
		String[] array = { "AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh" };
		System.out.print("Input  --> ");
		convertCaseOfAllArrayElements.displayString(array);
		System.out.print("\nOutput --> ");
		convertCaseOfAllArrayElements.convertCaseOfStrings(array);
	}
}
