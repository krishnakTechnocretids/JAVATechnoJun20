package madhuraMJun20;

/*WAP to convert case in all elements of array. 
Input : 
String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};
A-Z =65-90   a-z=97-122   0-9=48-57
Output:
array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};*/
public class ConvertCaseASCII {
	void convertCaseOfElements(String[] inputArray) {
		for (int index = 0; index < inputArray.length; index++) {
			String changedName = "";
			for (int innerIndex = 0; innerIndex < inputArray[index].length(); innerIndex++) {
				if (inputArray[index].charAt(innerIndex) >= 'A' && inputArray[index].charAt(innerIndex) <= 'Z') {
					changedName += (char) (inputArray[index].charAt(innerIndex) + 32);
				} else if (inputArray[index].charAt(innerIndex) >= 'a' && inputArray[index].charAt(innerIndex) <= 'z') {
					changedName += (char) (inputArray[index].charAt(innerIndex) - 32);
				}
			}
			inputArray[index] = changedName;
			System.out.print("\"" + inputArray[index] + "\",");
		}
	}

	public static void main(String[] args) {
		ConvertCaseASCII convertCaseASCII = new ConvertCaseASCII();
		String[] inputArray = { "AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh" };
		System.out.print("{");
		convertCaseASCII.convertCaseOfElements(inputArray);
		System.out.print("}");
	}
}