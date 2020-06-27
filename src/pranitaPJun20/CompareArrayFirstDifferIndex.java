/*Assignment 19 : 27th Jun'2020
 * Program 2: Find first differ index from given arrays. 
                   i/p :- arr1: {10,2,9,14,3}
                            arr2: {10,2,18,14,3}
                   o/p:- Values are not matching at index -> 2
 */
package pranitaPJun20;

public class CompareArrayFirstDifferIndex {
	public static void main(String[] args) {
		
		int[] arr1 = {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,3};
		
		CompareArrayFirstDifferIndex compareArrayFirstDifferIndex = new CompareArrayFirstDifferIndex();
		compareArrayFirstDifferIndex.findfisrtDifferIndex(arr1,arr2);
	}
	
	void findfisrtDifferIndex(int[] input1,int[] input2) {
		if(input1.length==input2.length) {
			for(int index=0;index<input1.length;index++) {
				if(input1[index] != input2[index]) {
					System.out.println("Values are not matching at index : "+index);
					return;
				}
			}
			System.out.println("All arrays are equal");
		}
		
	}
}
