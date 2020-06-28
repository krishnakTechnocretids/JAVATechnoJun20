/*
 * Program 3: Find all differ index from given arrays. 
                 i/p:- arr1: {10,2,9,14,3}
                        arr2: {10,2,18,14,13}
                o/p:- Values are not matching at index -> 2
                         Values are not matching at index -> 4
 */
package pranitaPJun20;

public class CompareArrayAllDifferIndex {
	
	public static void main(String[] args) {
		int[] arr1 = {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,13};
		
		CompareArrayAllDifferIndex compareArrayAllDifferIndex = new CompareArrayAllDifferIndex();
		compareArrayAllDifferIndex.findAllDifferIndex(arr1,arr2);
	}
	
	void findAllDifferIndex(int[] input1,int[] input2) {
		
		if(input1.length==input2.length) {
			for(int index=0;index<input1.length;index++) {
				if(input1[index] != input2[index]) {
					System.out.println("Values are not matching at index : "+index);
					
				}
			}
		}
		
	}
}
