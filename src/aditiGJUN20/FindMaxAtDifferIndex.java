/*
Find max value at differed index.
	i/p:- arr1: {10,2,9,14,3}
	arr2: {10,2,18,14,3}
	o/p :- Values are not matching at index -> 2, From (9,18) max value is 18 
 * */

package aditiGJUN20;

public class FindMaxAtDifferIndex {
	void getMaxAtDifferIndex(int[] arr1, int[] arr2) {
		int max=0;
		if(arr1.length==arr2.length) {
			for(int index=0;index<arr1.length;index++) {
				max=arr1[index];
				if(arr1[index] != arr2[index]) {
					if(arr2[index]>max)
						max=arr2[index];
					System.out.println("\nArray values are not matching at index : "+index+
							"\nFrom ("+arr1[index]+","+arr2[index]+") Max value is "+max);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		FindMaxAtDifferIndex findMaxAtDifferIndex= new FindMaxAtDifferIndex();
		int[] arr1={10,2,9,14,3},
			arr2={10,2,18,14,3};
		System.out.println("Find max value at differed index");
		System.out.println("arr1={10,2,9,14,3}\n" + 
			"arr2={10,2,18,14,3}");
		findMaxAtDifferIndex.getMaxAtDifferIndex(arr1, arr2);
	}
}
