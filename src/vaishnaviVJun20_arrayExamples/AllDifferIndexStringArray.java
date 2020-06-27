package vaishnaviVJun20_arrayExamples;

public class AllDifferIndexStringArray {

	void findAllDifferIndexStringArray(String[] array1, String[] array2) {
		 for(int index=0;index<array1.length;index++) {
			   if(array1[index]!= array2[index]) {
				   System.out.print("Values are not matching at index->" +index +",");
			       System.out.println("arra1 value is "+array1[index] +", arra2 value is "+array2[index]);
			   }
		 }	   
	}
	
	public static void main(String[] args) {
		AllDifferIndexStringArray allDifferIndexStringArray = new AllDifferIndexStringArray();
		String[] array1 = {"Maulik","Harsh","Krishna","Technocredits"};
		String[] array2 = {"Maulik","Harsh","Technocredits","Krishna"};
		allDifferIndexStringArray.findAllDifferIndexStringArray(array1,array2);
	}

}
