/*
 Find first differ index from given arrays. 
  i/p :- arr1: {10,2,9,14,3}
  arr2: {10,2,18,14,3}
  o/p:- Values are not matching at index -> 2
*/

package aditiGJUN20;

public class FirstDifferIndexInArray {
	// Method to find first array index which has different element value 
	void getFirstDifferIndex(int[] arr1, int[] arr2) {
		if(arr1.length==arr2.length) {
			for(int index=0;index<arr1.length;index++) {
				if(arr1[index]!=arr2[index]) {
					System.out.println("Values are not matching at index :"+index);
					return;
					// once it will go through condition it'll return - So always return only first differ index.
				}
			}
		}
	}
	public static void main(String[] args) {
	
		FirstDifferIndexInArray firstDifferIndexInArray=new FirstDifferIndexInArray();
		int[] arr1={10,2,9,14,3},
				arr2={10,2,18,14,3};
		System.out.println("First Differ Index: ");
		System.out.println("arr1={10,2,9,14,3}\n" + 
				"arr2={10,2,18,14,3}");
		firstDifferIndexInArray.getFirstDifferIndex(arr1, arr2);
	}
}
