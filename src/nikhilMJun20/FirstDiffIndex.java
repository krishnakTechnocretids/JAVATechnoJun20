/*Find first differ index from given arrays.
i/p :- arr1: {10,2,9,14,3}
arr2: {10,2,18,14,3}
o/p:- Values are not matching at index -> 2
*/

package nikhilMJun20;

public class FirstDiffIndex {
	void diffIndex(int[] arr1, int[] arr2) {
		for(int index=0; index<arr1.length; index++) {
			if(arr1[index]!=arr2[index]) {
				System.out.println("\nArray values are not matching at index : "+index);
				return;
			}
		}
		System.out.println("\nBoth arrays are identical.");
	}
	
	public static void main(String[] args) {
		FirstDiffIndex firstDiffIndex = new FirstDiffIndex();
		
		int[] arr1 = {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,3};
		
		firstDiffIndex.diffIndex(arr1, arr2);
	}
}
