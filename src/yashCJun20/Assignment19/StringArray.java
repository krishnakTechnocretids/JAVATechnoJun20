package yashCJun20.Assignment19;

public class StringArray {
	
	void toFindAllDifferIndex (String [] arr1,String [] arr2){
		
		for (int i=0;i<arr1.length;i++) {
			
        	if (arr1[i]!=arr2[i]) {
        		System.out.println("Values are not matching at index ->"+ i + ","+"[arr1 value is " +arr1 [i] +"," +"arr2 value is "+arr2 [i]+"]");     
         }
		}
	}

	public static void main(String[] args) {
		
		StringArray stringArray=new StringArray();
		String [] array1 ={"Maulik", "Harsh", "Krishna", "Technocredits"};
	    String [] array2 = {"Maulik","Harsh","Technocredits","Krishna"};
	    stringArray.toFindAllDifferIndex(array1, array2);
		
		
				
	}
	

}
