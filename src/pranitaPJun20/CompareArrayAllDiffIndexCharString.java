/*
 * Program 5: Find all differ index from given arrays.
               i/p:- arr1: {"Maulik", "Harsh", "Krishna", "Technocredits"}
                       arr2: {"Maulik","Harsh","Technocredits","Krishna"}		
               o/p:- Values are not matching at index -> 2, [arr1 value is Krishna, arr2 value is Technocredits] 
                        Values are not matching at index -> 3, [arr1 value is Technocredits, arr2 value is Krishna]
 */
package pranitaPJun20;

public class CompareArrayAllDiffIndexCharString {
	
	void findAllDiffIndexString(String[] input1,String[] input2) {
		
		if(input1.length==input2.length) {
			for(int index=0;index<input1.length;index++) {
				if(input1[index] != input2[index]) {
					System.out.println("Values are not matching at index : "+index+", "+"[arr1 value is "+input1[index]+","+"arr2 value is "+input2[index]+"]");
					
				}
			}
		}
	}
		
	
	public static void main(String[] args) {
		String[] arr1 = {"Maulik", "Harsh", "Krishna", "Technocredits"};
		String[] arr2 =  {"Maulik","Harsh","Technocredits","Krishna"}	;
		
		CompareArrayAllDiffIndexCharString compareArrayAllDiffIndexCharString = new CompareArrayAllDiffIndexCharString();
		compareArrayAllDiffIndexCharString.findAllDiffIndexString(arr1,arr2);
		
	}

}
