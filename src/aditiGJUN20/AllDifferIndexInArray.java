/*
Program 3: Find all differ index from given arrays. 
	i/p:- arr1: {10,2,9,14,3}
    arr2: {10,2,18,14,13}
    o/p:- Values are not matching at index -> 2
    Values are not matching at index -> 4
*/        

package aditiGJUN20;

public class AllDifferIndexInArray {
	
	// Method to find array index which has different element value 
		void findAllDifferIndex(int[] arr1, int[] arr2) {
			if(arr1.length==arr2.length) {
				for(int index=0;index<arr1.length;index++) {
					if(arr1[index]!=arr2[index])
						System.out.println("Values are not matching at index-> "+index);
				}
			}
		}
		
		public static void main(String[] args) {
			
			AllDifferIndexInArray allDifferIndexInArray=new AllDifferIndexInArray();
			int[] arr1={10,2,9,14,3},
					arr2={10,2,18,14,13};
			System.out.println("All differ Index: ");
			System.out.println("arr1={10,2,9,14,3}\n" + 
					"arr2={10,2,18,14,13}");
			allDifferIndexInArray.findAllDifferIndex(arr1, arr2);
		}
}
