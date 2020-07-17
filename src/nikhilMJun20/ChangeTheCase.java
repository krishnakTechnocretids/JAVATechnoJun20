/*
Assignement 29 : 17th July 2020

WAP to convert case in all elements of array. 
Input : 
String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};

Output:
array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};
*/

package nikhilMJun20;

public class ChangeTheCase {
	String changeCase(String str) {
		String caseChangedStr="";
		for(int index=0; index<str.length(); index++) {
			if(str.charAt(index) >= 'a' && str.charAt(index) <= 'z') {
				//caseChangedStr += Character.toUpperCase(str.charAt(index));
				caseChangedStr +=  (char)(str.charAt(index)-32);
			}else if(str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {
				//caseChangedStr += Character.toLowerCase(str.charAt(index));
				caseChangedStr += (char)(str.charAt(index)+32);
			}
		}
		return caseChangedStr;
	}
	
	void displyArray(String[] strArray) {
		System.out.print("{ ");
		for(int index=0; index<strArray.length; index++) {
			System.out.print("\""+strArray[index]+"\", ");
		}
		System.out.print("}");
	}
	
	public static void main(String[] args) {
		ChangeTheCase changeTheCase = new ChangeTheCase();
		String[] strArray = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};
		//Printing the original array elements
		System.out.println("Original elements of the given array of strings:-");
		changeTheCase.displyArray(strArray);
		//Changing the case of the array elements
		for(int index=0; index<strArray.length; index++) {
			strArray[index] = changeTheCase.changeCase(strArray[index]);
		}
		//Printing the case-changed array elements
		System.out.println("\n\nArray elements with changed case:-");
		changeTheCase.displyArray(strArray);
	}
}
