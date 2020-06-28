package vaishnaviVJun20_arrayExamples;

public class MaxValue {
	void findMaxValueAtDifferIndex(int[] array1, int[] array2) {
		if(array1.length == array2.length) {
		   for(int index=0;index<array1.length;index++) {
			   if(array1[index]!= array2[index]) {
				   System.out.print("Values are not matching at index->" +index +",");
			       if(array1[index]>array2[index])
				      System.out.println("From (" +array1[index] +"," +array2[index] +") Max value is "+array1[index]);
			       else
				      System.out.println("From (" +array1[index] +"," +array2[index] +") Max value is "+array2[index]);
			   }	   			   
		   }
		}   else
			System.out.println("Arrays are not equal");
	}
	
	public static void main(String[] args) {
		MaxValue maxValue = new MaxValue();
		int[] array1 = {10,2,9,14,3};
		int[] array2 = {10,2,18,14,3};
		maxValue.findMaxValueAtDifferIndex(array1,array2);

	}

}
