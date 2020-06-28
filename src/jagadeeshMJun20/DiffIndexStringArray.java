/*Program 5: Find all differ index from given arrays.
i/p:- arr1: {"Maulik", "Harsh", "Krishna", "Technocredits"}
        arr2: {"Maulik","Harsh","Technocredits","Krishna"}		
o/p:- Values are not matching at index -> 2, [arr1 value is Krishna, arr2 value is Technocredits] 
         Values are not matching at index -> 3, [arr1 value is Technocredits, arr2 value is Krishna] */
package jagadeeshMJun20;
public class DiffIndexStringArray {
	void displayDifference(String[] arr1,String[] arr2) {
		if(arr1.length == arr2.length) {
			for(int index=0; index<arr1.length;index++) {
				for(int i=0; i<arr1[index].length();i++) {
					if(arr1[index].charAt(i)!= arr2[index].charAt(i)) {	
						System.out.println("Values are not matching at index ->"+index+" arr1 value is "+arr1[index]+ ", arr2 value is "+arr2[index]);
						break;
					}
				}
			}
		}
		else
			System.out.println("Arrays lengths are different. Hence cannot compare");
	}
	public static void main(String[] agrs) {
		DiffIndexStringArray diffIndexStringArray = new DiffIndexStringArray();
		String[] arr1= {"Maulik", "Harsh", "Krishna", "Technocredits"};
		String[] arr2= {"Maulik","Harsh","Technocredits","Krishna"};
		diffIndexStringArray.displayDifference(arr1, arr2);
	}
}