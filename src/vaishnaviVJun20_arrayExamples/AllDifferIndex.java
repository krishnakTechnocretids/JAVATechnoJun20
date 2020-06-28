package vaishnaviVJun20_arrayExamples;

public class AllDifferIndex {
	
	void findAllDifferIndex(int[] array1, int[] array2) {
		 if(array1.length == array2.length) {
		     for(int index=0;index<array1.length;index++) {
			   if(array1[index]!= array2[index])
				   System.out.println("Values are not matching at index->" +index);
		     }
		 }else
			 System.out.println("Arrays are not equal");
	}
	
	public static void main(String[] args) {
		AllDifferIndex allDifferIndex = new AllDifferIndex();
		int[] array1 = {10,2,9,14,3};
		int[] array2 = {10,2,18,14,13};
		allDifferIndex.findAllDifferIndex(array1,array2);
	}

}
