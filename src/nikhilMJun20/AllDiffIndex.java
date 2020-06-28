/*Find all differ index from given arrays.
i/p:- arr1: {10,2,9,14,3}
arr2: {10,2,18,14,13}
o/p:- Values are not matching at index -> 2
Values are not matching at index -> 4
*/

package nikhilMJun20;

public class AllDiffIndex {
	void displayAllDiffIndex(int[] arr1, int[] arr2) {
		boolean flag = true;
		if(arr1.length == arr2.length) {
			for(int index=0; index<arr1.length; index++) {
				if(arr1[index]!=arr2[index]) {
					System.out.println("Array values are not matching at index : "+index);
					flag=false;
				}
			}
			if(flag==true)
				System.out.println("Array 1 and Array 2 are identical.");
		}else
			System.out.println("\nArray 1 and Array 2 are not matching in length.");
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,13};
		
		new AllDiffIndex().displayAllDiffIndex(arr1, arr2);
	}
}
