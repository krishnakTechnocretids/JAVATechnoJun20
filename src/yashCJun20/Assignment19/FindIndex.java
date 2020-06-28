package yashCJun20.Assignment19;

public class FindIndex {
	
	void toFindDifferIndex (int [] arr1,int [] arr2) {
		
		for (int i=0;i<arr1.length;i++) {
		
        	if (arr1[i]!=arr2[i]) 
                System.out.println("Values are not matching at index ->"+ i );
        	
         }
			
        }
		
	public static void main(String[] args) {
		
		FindIndex findIndex = new FindIndex();
		int [] arr1 = {10,2,9,14,3};
		int [] arr2 = {10,2,18,14,3};
		findIndex.toFindDifferIndex(arr1, arr2);
	}

}
