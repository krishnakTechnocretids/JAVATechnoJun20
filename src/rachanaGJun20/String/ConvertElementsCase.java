/*Assignement 29 : 17th July 2020

WAP to convert case in all elements of array. 
Input : 
String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};

Output:
array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};*/
package rachanaGJun20.String;

public class ConvertElementsCase {
	String[] arry = { "AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh" };

	void getCaseConvertedString() {
		
		String tempStr = "";
		String str ;
		for (int outerIndex = 0; outerIndex < arry.length; outerIndex++) {
			str = arry[outerIndex];
			for (int innerIndex = 0; innerIndex < str.length(); innerIndex++) {
				if (str.charAt(innerIndex) >= 'A' && str.charAt(innerIndex) <= 'Z') {
					tempStr = tempStr + (char) (str.charAt(innerIndex) + 32);
				} else if ((str.charAt(innerIndex) >= 'a' && str.charAt(innerIndex) <= 'z')) {
					tempStr = tempStr + (char) (str.charAt(innerIndex) - 32);
				}
				arry[outerIndex] = tempStr;
			}
			tempStr = "";
		}
		displayCaseConvertedArray();
	}

	private void displayCaseConvertedArray() {

		System.out.println("Case converted Array is:");
		System.out.print("{");
		for (int index = 0; index < arry.length; index++) {
			System.out.print(" " + arry[index] + " ");
		}
		System.out.print("}");
	}

	public static void main(String[] args) {
		System.out.println("Given Array: { \"AaVruti\", \"NiKhil\", \"AdiTi\", \"MAhesh\", \"ArchaNA\", \"jaGAdeesh\" };");
		new ConvertElementsCase().getCaseConvertedString();
		

	}

}
