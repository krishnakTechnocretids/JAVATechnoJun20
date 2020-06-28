/*
 Find first differ index from given arrays. 
arr1: {10,2,9,14,3}
arr2: {10,2,18,14,3}
o/p:- Values are not matching at index -> 2 
 */
package shrutiDJun20;

public class CompareIntArray {

	void compareArray(int[] input1, int[] input2){
		//compare length first
		int diffIndex=0;
		if(input1.length==input2.length){
			for(int i=0;i<input1.length;i++){
				if(input1[i]!= input2[i]){
					diffIndex=i;
					System.out.println("first difference found in given arrays is at index "+ diffIndex);
					return;
				}
			}
		}
	}
		
	
	public static void main(String[] args) {
		CompareIntArray compareIntArray = new CompareIntArray();
		int input1[] = {10,2,9,14,3};
		int input2[]= {10,2,18,14,3};
		compareIntArray.compareArray(input1, input2);
	}
}
