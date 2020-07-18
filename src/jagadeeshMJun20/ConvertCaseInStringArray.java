/*Assignement 29 : 17th July 2020

WAP to convert case in all elements of array. 
Input : 
String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};

Output:
array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};
 */
package jagadeeshMJun20;
public class ConvertCaseInStringArray {
	void displayOutput(String[] names) {
		String outputNames[] = { "", "", "", "", "", "" };
		for (int outerIndex = 0; outerIndex < names.length; outerIndex++) {
			for (int index = 0; index < names[outerIndex].length(); index++) {
				char ch = names[outerIndex].charAt(index);
				if (Character.isUpperCase(names[outerIndex].charAt(index))) {
					ch = Character.toLowerCase(names[outerIndex].charAt(index));
					outputNames[outerIndex] = outputNames[outerIndex] + ch;
				} else if (Character.isLowerCase(names[outerIndex].charAt(index))) {
					ch = Character.toUpperCase(names[outerIndex].charAt(index));
					outputNames[outerIndex] = outputNames[outerIndex] + ch;
				}
			}
		}
		System.out.println("Output is :");
		for (int index = 0; index < outputNames.length; index++)
			System.out.print(outputNames[index] + " ");
	}
	public static void main(String[] agrs) {
		String[] names = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};
		new ConvertCaseInStringArray().displayOutput(names);
}
}
