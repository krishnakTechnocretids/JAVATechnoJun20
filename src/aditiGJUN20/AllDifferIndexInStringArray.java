/*
Find all differ index from given arrays.
	i/p:- arr1: {"Maulik", "Harsh", "Krishna", "Technocredits"}
	arr2: {"Maulik","Harsh","Technocredits","Krishna"}        
	o/p:- 
	Values are not matching at index -> 2, [arr1 value is Krishna, arr2 value is Technocredits] 
	Values are not matching at index -> 3, [arr1 value is Technocredits, arr2 value is Krishna]}
*/


package aditiGJUN20;

public class AllDifferIndexInStringArray {
	
	//Method to find array index which has different element value
	void getAllDifferIndex(String[] arr1, String[] arr2) {
		if(arr1.length==arr2.length) {
			for(int index=0;index<arr1.length;index++) {
				if(!arr1[index].equals(arr2[index])) {
					System.out.println("\nValues are not matching at index-> "+index+
							",\n[arr1 value is \""+arr1[index]+"\" arr2 value is \""+arr2[index]+"\"]");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		AllDifferIndexInStringArray allDifferIndexInStringArray=new AllDifferIndexInStringArray();
		System.out.println("Find all differed index for given string array..");
		String[] arr1={"Maulik", "Harsh", "Krishna", "Technocredits"},
				arr2={"Maulik","Harsh","Technocredits","Krishna"};
		System.out.println("arr1: {\"Maulik\", \"Harsh\", \"Krishna\", \"Technocredits\"}\n" + 
				"arr2: {\"Maulik\",\"Harsh\",\"Technocredits\",\"Krishna\"}");
		allDifferIndexInStringArray.getAllDifferIndex(arr1,arr2);
	}

}
