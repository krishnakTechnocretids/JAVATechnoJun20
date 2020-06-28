package harshadBJun20.Assignment19;
/*Program 3: Find all differ index from given arrays. 
                 i/p:- arr1: {10,2,9,14,3}
                        arr2: {10,2,18,14,13}
                o/p:- Values are not matching at index -> 2
                         Values are not matching at index -> 4*/
public class AllDifferIndexFromIntegerArray {
	
	void findAllDiffIndex(int[] a1, int[] a2) {
		if(a1.length == a2.length) {
			for(int index=0; index<a1.length;index++) {
				if(a1[index] != a2[index]) {
					System.out.println("Values are not matching at index -> " +index);					
				}	
			}
		}else {
			System.out.println("Arrays are not matching");
		}	
	}
	public static void main(String[] args) {
		AllDifferIndexFromIntegerArray allDifferIndexFromArray = new AllDifferIndexFromIntegerArray();
		int[] arr1 = {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,13};
		
		allDifferIndexFromArray.findAllDiffIndex(arr1, arr2);
	}
}
