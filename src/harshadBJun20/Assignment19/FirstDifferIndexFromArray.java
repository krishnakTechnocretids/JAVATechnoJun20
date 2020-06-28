package harshadBJun20.Assignment19;

/*Program 2: Find first differ index from given arrays. 
                   i/p :- arr1: {10,2,9,14,3}
                            arr2: {10,2,18,14,3}
                   o/p:- Values are not matching at index -> 2*/

public class FirstDifferIndexFromArray {
	
	void findFirstDiffIndex(int[] a1, int[] a2) {
		boolean flag=true;
		int indexNotMatching=0;
		if(a1.length == a2.length) {
			for(int index=0; index<a1.length;index++) {
				if(a1[index] != a2[index]) {
					indexNotMatching = index;
					flag = false;
					break;
				}			
			}
		}else {
			System.out.println("Arrays are not matching");
			return;
		}
		
		if(flag == false) 
			System.out.println("Values are not matching at index -> " +indexNotMatching);
		else 
			System.out.println("All values matching");	
	}
	public static void main(String[] args) {
		FirstDifferIndexFromArray firstDifferIndexFromArray = new FirstDifferIndexFromArray();
		int[] arr1 = {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,3};
		
		firstDifferIndexFromArray.findFirstDiffIndex(arr1, arr2);
	}
}
