/*Find all differ index from given arrays.
i/p:- arr1: {"Maulik", "Harsh", "Krishna", "Technocredits"}
arr2: {"Maulik","Harsh","Technocredits","Krishna"}
o/p:- Values are not matching at index -> 2, [arr1 value is Krishna, arr2 value is Technocredits]
Values are not matching at index -> 3, [arr1 value is Technocredits, arr2 value is Krishna]
*/

package nikhilMJun20;

public class AllDiffIndexArray {
	void displayDiffIndexElements(String[] arr1, String[] arr2) {
		for(int index=0; index<arr1.length; index++) {
			if(!arr1[index].equals(arr2[index])) {
				System.out.println("\nArray values are not matching at index : "+index+"\narr1 value is "+arr1[index]+" and arr2 value is "+arr2[index] );
			}
		}
	}
	
	public static void main(String[] args) {
		String[] arr1 = {"Maulik", "Harsh", "Krishna", "Technocredits"};
		String[] arr2 = {"Maulik","Harsh","Technocredits","Krishna"};
		
		new AllDiffIndexArray().displayDiffIndexElements(arr1, arr2);
	}
}
