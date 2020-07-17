package aavrutiDJun20.array;

public class ConvertCaseofAllElements {

	void convertCaseOfStrings(String[] arrayInput) {
		for(int outerIndex=0;outerIndex<arrayInput.length;outerIndex++) {
			String convertedCaseString = "";
			for(int innerIndex=0;innerIndex<arrayInput[outerIndex].length();innerIndex++) {
				if(arrayInput[outerIndex].charAt(innerIndex)>='A' && arrayInput[outerIndex].charAt(innerIndex)<='Z')
					convertedCaseString += (char)(arrayInput[outerIndex].charAt(innerIndex) + 32);
				else
					convertedCaseString += (char)(arrayInput[outerIndex].charAt(innerIndex) - 32);
			}
			arrayInput[outerIndex] = convertedCaseString;
		}
		System.out.print("Output --> {");
		for(int index=0;index<arrayInput.length;index++) {
			System.out.print("\"" + arrayInput[index] + "\", " );
		}
		System.out.print("}");
	}

	public static void main(String[] args) {
		ConvertCaseofAllElements convertCaseofAllElements = new ConvertCaseofAllElements();
		String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};
		System.out.println("Input  --> {\"AaVruti\", \"NiKhil\", \"AdiTi\", \"MAhesh\", \"ArchaNA\", \"jaGAdeesh\"}");
		convertCaseofAllElements.convertCaseOfStrings(array);
	}
}