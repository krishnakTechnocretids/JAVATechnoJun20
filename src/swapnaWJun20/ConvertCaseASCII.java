/*WAP to convert case in all elements of array. 
Input : 
String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};

Output:
array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};*/

package swapnaWJun20;

public class ConvertCaseASCII {

	void caseConvertString(String input[]) {
		System.out.print("{");
		for (int outerIndex = 0; outerIndex < input.length; outerIndex++) {
			String convertString = "";
			for (int index = 0; index < input[outerIndex].length(); index++) {
				if (input[outerIndex].charAt(index) >= 'A' && input[outerIndex].charAt(index) <= 'Z')
					convertString += (char) (input[outerIndex].charAt(index) + 32);
				else
					convertString += (char) (input[outerIndex].charAt(index) - 32);
			}
			input[outerIndex] = convertString;
			System.out.print("\"" + input[outerIndex] + "\",");
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		ConvertCaseASCII convertCaseASCII = new ConvertCaseASCII();
		String[] array = { "AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh" };
		System.out.print("Output : ");
		convertCaseASCII.caseConvertString(array);
	}
}
