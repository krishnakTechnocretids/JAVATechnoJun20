/*Program 2: Find first differ index from given arrays. 
                   i/p :- arr1: {10,2,9,14,3}
                            arr2: {10,2,18,14,3}
                   o/p:- Values are not matching at index -> 2 */
package jagadeeshMJun20;
public class DiffInArray {
	void mainLogic(int[] arr1, int[] arr2) {
		
		for(int index=0;index<arr1.length;index++) {
			if(arr1[index]!=arr2[index]) 
				System.out.println("Values are not matching at index -> "+index);
		}
	}
	public static void main (String [] args) {
		DiffInArray diffInArray = new DiffInArray();
		int[] arr1 = {10, 2, 9, 14, 3};
		int[] arr2 = {10, 2, 18, 14, 3};
		diffInArray.mainLogic(arr1,arr2);
}
}
