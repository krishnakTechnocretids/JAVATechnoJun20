package vaishnaviVJun20;

public class ConverCaseUsingAscii {

	String[] covertCaseInAllElements(String[] nameArray) {
		for (int index = 0; index < nameArray.length; index++) {
			String name = "";
			for (int innerIndex = 0; innerIndex < nameArray[index].length(); innerIndex++) {
				char ch;
				if (nameArray[index].charAt(innerIndex) >= 'A' && nameArray[index].charAt(innerIndex) <= 'Z') {
					ch = (char) (nameArray[index].charAt(innerIndex) + 32);
					name += ch;
				} else if (nameArray[index].charAt(innerIndex) >= 97 && nameArray[index].charAt(innerIndex) <= 122) {
					ch = (char) (nameArray[index].charAt(innerIndex) - 32);
					name += ch;
				}
			}
			nameArray[index] = name;
		}
		return nameArray;
	}

	public static void main(String[] args) {
		String[] array = { "VaishNAvi", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh" };
		String[] newArray = new ConverCaseUsingAscii().covertCaseInAllElements(array);
		System.out.print("Output array: {");
		for (int index = 0; index < newArray.length; index++) {
			System.out.print(newArray[index] + " ");
		}
		System.out.print("}");
	}

}
