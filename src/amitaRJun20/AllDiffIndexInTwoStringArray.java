/*: Find all differ index from given arrays.
               i/p:- arr1: {"Maulik", "Harsh", "Krishna", "Technocredits"}
                       arr2: {"Maulik","Harsh","Technocredits","Krishna"}		
               o/p:- Values are not matching at index -> 2, [arr1 value is Krishna, arr2 value is Technocredits] 
                        Values are not matching at index -> 3, [arr1 value is Technocredits, arr2 value is Krishna]*/

package amitaRJun20;

public class AllDiffIndexInTwoStringArray {
	
	//Method to find all differ Index from two array
	void findAllDiffIndexValue(String[] array1,String[] array2) {
		
		boolean flag = true;
		if(array1.length == array2.length) {
			for(int index=0; index < array1.length; index++) {
				if(!array1[index].equalsIgnoreCase(array2[index])) {
					flag = false;
					System.out.println("Values are not matching at index "+index+" ,array1 index is "+array1[index]+" ,array2 index is "+array2[index]);
					}
			}
			if(flag == true)
				System.out.println("Both arrays are equal");			
		}
		else
			System.out.println("Array length are not equal");		
	}

	public static void main(String[] args) {
		AllDiffIndexInTwoStringArray diffStringarray=new AllDiffIndexInTwoStringArray();
		
		String[] array1 = {"Maulik", "Harsh", "Krishna", "Technocredits"};
		String[] array2 = {"Maulik","Harsh","Technocredits","Krishna"};
		System.out.println("Two given arrays are \n [Maulik,Harsh,Krishna,Technocredits] \n [Maulik,Harsh,Technocredits,Krishna]" );
		diffStringarray.findAllDiffIndexValue(array1,array2);

	}

}
