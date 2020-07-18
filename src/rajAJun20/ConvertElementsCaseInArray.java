package rajAJun20;

import java.util.Arrays;

public class ConvertElementsCaseInArray {
	
	String[] displayConvertCaseOfArrayElements(String[] givenArray) {
		String[] changedArray = new String[givenArray.length];
		
		for(int index = 0 ; index < givenArray.length ; index++ ) {
			changedArray[index] = ""; 
			for(int innerIndex = 0  ; innerIndex < givenArray[index].length() ; innerIndex++ ) {
				if(givenArray[index].charAt(innerIndex) >= 'A' && givenArray[index].charAt(innerIndex) <= 'Z') {
					changedArray[index] += (char)(givenArray[index].charAt(innerIndex) + 32);
				} else if(givenArray[index].charAt(innerIndex) >= 'a' && givenArray[index].charAt(innerIndex) <= 'z') {
					changedArray[index] += (char)(givenArray[index].charAt(innerIndex) - 32);
				} else
					changedArray[index] += givenArray[index].charAt(innerIndex);
			}
		}
		return changedArray;
	}
	
	public static void main(String[] args) {
		String[] strArray = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};
		
		System.out.println("Array before case conversion is : \n" + Arrays.toString(strArray));
		
		System.out.println("\nOutput of string array after case conversion is : \n" + Arrays.toString(new ConvertElementsCaseInArray().displayConvertCaseOfArrayElements(strArray)));
		
	}
}
