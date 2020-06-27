package vaishnaviVJun20_arrayExamples;

public class FirstDifferIndex {
	
	void findFirstDifferIndex(int[] array1, int[] array2) {
	   for(int index=0;index<array1.length;index++) {
		   if(array1[index]!= array2[index])
			   System.out.println("Values are not matching at index->" +index);
	   }	
	}

	public static void main(String[] args) {
		FirstDifferIndex firstDifferIndex = new FirstDifferIndex();
		int[] array1 = {10,2,9,14,3};
		int[] array2 = {10,2,18,14,3};
		firstDifferIndex.findFirstDifferIndex(array1,array2);
	}

}
