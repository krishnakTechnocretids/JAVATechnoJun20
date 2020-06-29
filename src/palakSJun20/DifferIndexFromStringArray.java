/*Program 5: Find all differ index from given arrays.
               i/p:- arr1: {"Maulik", "Harsh", "Krishna", "Technocredits"}
                       arr2: {"Maulik","Harsh","Technocredits","Krishna"}		
               o/p:- Values are not matching at index -> 2, [arr1 value is Krishna, arr2 value is Technocredits] 
                        Values are not matching at index -> 3, [arr1 value is Technocredits, arr2 value is Krishna]*/
package palakSJun20;

public class DifferIndexFromStringArray {
	
	//Find all differ index from given arrays.
	void findDifferIndexFromStringArray(String[] arr1 , String[] arr2){
		if (arr1.length == arr2.length) {
				for (int i = 0; i < arr1.length; i++) {
					if (arr1[i]!= arr2[i]) {
						System.out.println("Values are not matching at index -> "+i +", [arr1 value is " +arr1[i] +", arr2 Value is"+ arr2[i] +"]" );
					}
				}
			} 
		else 
			System.out.println("Length are not Equal ");	
		}
		

	public static void main(String[] args) {
		DifferIndexFromStringArray indexFromStringArray = new DifferIndexFromStringArray();
		String[] arr1 = {"Maulik", "Harsh", "Krishna", "Technocredits"};
		String[] arr2 = {"Maulik","Harsh","Technocredits","Krishna"};
		indexFromStringArray.findDifferIndexFromStringArray(arr1, arr2);
		
	}

}
