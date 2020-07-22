package yashCJun20.Assignment29;
public class convertCaseInAllElementsOfArray {

	void convertCaseInAllElementsOfArray(String[] arr) {
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
		convertCaseInAllElementsOfArray convertCase = new convertCaseInAllElementsOfArray();
		String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};
		convertCase.convertCaseInAllElementsOfArray(array);
	}
}