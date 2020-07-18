package deavinaSJun20;

public class ConvertCaseOfElements {

	void convertCaseOfStrings(String[] arrayInput) {
		for (int outerIndex = 0; outerIndex < arrayInput.length; outerIndex++) {
			String convertedString = "";
			for (int innerIndex = 0; innerIndex < arrayInput[outerIndex].length(); innerIndex++) {
				if (arrayInput[outerIndex].charAt(innerIndex) >= 'A'
						&& arrayInput[outerIndex].charAt(innerIndex) <= 'Z')
					convertedString += (char) (arrayInput[outerIndex].charAt(innerIndex) + 32);
				else
					convertedString += (char) (arrayInput[outerIndex].charAt(innerIndex) - 32);
			}
			arrayInput[outerIndex] = convertedString;
		}
		displayString(arrayInput);
	}

	void displayString(String[] array) {
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}

	public static void main(String[] args) {
		ConvertCaseOfElements convertCaseofElements = new ConvertCaseOfElements();
		String[] array = { "AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh" };
		System.out.println("Input  --> ");
		convertCaseofElements.displayString(array);
		System.out.println("\nOutput  --> ");
		convertCaseofElements.convertCaseOfStrings(array);
	}

}
