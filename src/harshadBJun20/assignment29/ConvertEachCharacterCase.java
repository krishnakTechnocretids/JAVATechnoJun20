package harshadBJun20.assignment29;

/*Assignement 29 : 17th July 2020

WAP to convert case in all elements of array. 
Input : 
String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};

Output:
array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};*/

public class ConvertEachCharacterCase {
	
	void convertCase(String[] arr) {
		String str="";
		String[] outputArray = new String[arr.length];
		char ch;
		System.out.println("Case Converted String:");
		System.out.print("{");
		for(int index=0;index<arr.length;index++) {
			for(int innerIndex=0;innerIndex<arr[index].length();innerIndex++) {
				if(Character.isLowerCase(arr[index].charAt(innerIndex))) {
					ch=Character.toUpperCase(arr[index].charAt(innerIndex));
					str +=ch;
				}
				else if(Character.isUpperCase(arr[index].charAt(innerIndex))) {
					ch=Character.toLowerCase(arr[index].charAt(innerIndex));
					str +=ch;
				}
			}
			outputArray[index] = str;
			str="";
			System.out.print("\""+outputArray[index]+"\""+",");
		}
		System.out.println("}");
	}
	public static void main(String[] args) {
		ConvertEachCharacterCase convertEachCharacterCase = new ConvertEachCharacterCase();
		String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};
		
		System.out.println("Original String:");
		System.out.print("{");
		for(int index=0;index<array.length;index++) {
			System.out.print("\""+array[index]+"\""+",");
		}
		System.out.println("}\n");
		convertEachCharacterCase.convertCase(array);
		
	}
}
