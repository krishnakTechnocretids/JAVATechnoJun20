/*
 Assignement 29 : 17th July 2020

WAP to convert case in all elements of array. 
Input : 
String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};

Output:
array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};

*/

package vireshJJun20;

public class ConvertCase {

	static String tempString2 = "";

	// Method accepts Array, converts each index to appropriate case and then saves
	// in output array.
	String[] StringConvertCase(String[] inputArray) {
		String[] outputArray = inputArray;
		for (int arrIndex = 0; arrIndex < inputArray.length; arrIndex++) {
			String str = inputArray[arrIndex];
			String tempString = "";
			for (int strIndex = 0; strIndex < str.length(); strIndex++) {

				if (str.charAt(strIndex) >= 65 && str.charAt(strIndex) <= 90) {
					tempString += (char) ((int) str.charAt(strIndex) + 32);
				} else if (str.charAt(strIndex) >= 'a' && str.charAt(strIndex) <= 'z') {
					tempString += (char) ((int) str.charAt(strIndex) - 32);
				} else {
					tempString2 += str.charAt(strIndex) + " ";
				}
			}
			outputArray[arrIndex] = tempString;
		}
		return outputArray;
	}

	// Method to display the array on console.
	void displayArray(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index]);
			if (!(index == arr.length - 1)) {
				System.out.print(", ");
			} else
				System.out.print("");
		}
		System.out.println(")");
	}

	public static void main(String[] args) {
		String[] inputArr = { "AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh" };
		System.out.print("Input Array : (");
		new ConvertCase().displayArray(inputArr);
		String[] outputArray = new ConvertCase().StringConvertCase(inputArr);
		System.out.println("");
		System.out.print("Output Array: (");
		new ConvertCase().displayArray(outputArray);
		System.out.println("");
		if (!(tempString2.isEmpty())) {
			System.out.println("Array contains few Strings with special chars/integers which cant be converted to either upper case/lower case.");
			System.out.println("And those are : " + tempString2);
		}
	}
}
