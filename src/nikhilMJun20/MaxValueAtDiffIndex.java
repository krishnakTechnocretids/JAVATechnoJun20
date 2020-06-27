/*Find max value at differed index.
i/p:- arr1: {10,2,9,14,3}
arr2: {10,2,18,14,3}
o/p :- Values are not matching at index -> 2, From (9,18) max value is 18
*/

package nikhilMJun20;

public class MaxValueAtDiffIndex {
	void findMaxAtDiffIndex(int[] arr1, int[] arr2) {
		int max = 0;
		for(int index=0; index<arr1.length; index++) {
			max = arr1[index];
			if(arr1[index] != arr2[index]) {
				if(arr2[index]>max)
					max=arr2[index];
				System.out.println("\nArray values are not matching at index : "+index+"\nBetween "+arr1[index]+" and "+arr2[index]+" Max value is "+max);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,3};
				
		new MaxValueAtDiffIndex().findMaxAtDiffIndex(arr1, arr2);
	}
}
