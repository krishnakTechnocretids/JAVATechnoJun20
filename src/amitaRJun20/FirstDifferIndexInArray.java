/*Find first differ index from given arrays. 
                   i/p :- arr1: {10,2,9,14,3}
                            arr2: {10,2,18,14,3}
                   o/p:- Values are not matching at index -> 2*/

package amitaRJun20;

public class FirstDifferIndexInArray {
	
	//method to find first different index between two array
	void findDiffIndex(int[] array1,int[] array2) {
		if(array1.length == array2.length) {
			boolean flag = true;
			for(int index=0; index < array1.length; index++) {
				if(array1[index]!=array2[index]) {
					flag = false;
					System.out.println("Values are not matching at index "+index);
					break;
				}
			}
			if(flag == true)
				System.out.println("Both arrays are equal");			
		}
		else
			System.out.println("Array length are not equal");		
	}
	
	public static void main(String[] args) {
		
		FirstDifferIndexInArray diffIndex = new FirstDifferIndexInArray();
		
		int[] array1 = {10,2,9,14,3};
		int[] array2 = {10,2,18,14,3};	
		System.out.println("Two Given arrays are : \n{10,2,9,14,3}\n{10,2,18,14,3}");
		diffIndex.findDiffIndex(array1,array2);
	}
}
