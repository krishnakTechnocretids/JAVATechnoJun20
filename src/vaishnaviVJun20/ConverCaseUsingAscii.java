package vaishnaviVJun20;

/*WAP to convert case in all elements of array. 
Input : 
String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};

Output:
array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"}; */

public class ConverCaseUsingAscii {

	String[] covertCaseInAllElements(String[] nameArray) {
		for (int index = 0; index < nameArray.length; index++) {
			String name = "";
			for (int innerIndex = 0; innerIndex < nameArray[index].length(); innerIndex++) {
				if (nameArray[index].charAt(innerIndex) >= 'A' && nameArray[index].charAt(innerIndex) <= 'Z') {
					name += (char) (nameArray[index].charAt(innerIndex) + 32);
				} else if (nameArray[index].charAt(innerIndex) >= 97 && nameArray[index].charAt(innerIndex) <= 122) {
					name += (char) (nameArray[index].charAt(innerIndex) - 32);
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
			System.out.print(newArray[index] + ", ");
		}
		System.out.print("}");
	}

}
