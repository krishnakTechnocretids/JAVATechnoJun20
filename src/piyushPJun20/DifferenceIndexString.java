package piyushPJun20;
/* 
Find all differ index from given arrays.
i/p:- arr1: {"Maulik", "Harsh", "Krishna", "Technocredits"}
arr2: {"Maulik","Harsh","Technocredits","Krishna"}		
o/p:- Values are not matching at index -> 2, [arr1 value is Krishna, arr2 value is Technocredits] 
Values are not matching at index -> 3, [arr1 value is Technocredits, arr2 value is Krishna]
 */

public class DifferenceIndexString {

	void displayIndex(String[] arr1, String[] arr2) {
		boolean flag = true;
		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				if (!arr1[index].equalsIgnoreCase(arr2[index])) {
					System.out.println(" Values are not matching at index -> " + index + ", [arr1 value is "
							+ arr1[index] + ", arr2 value is " + arr2[index] + "]");
					flag = false;
				}
			}
			if (flag)
				System.out.println(" Values are equal in both Array");
		} else {
			System.out.println("Length is 2 Array is not matching");
		}
	}

	public static void main(String[] args) {
		DifferenceIndexString difference = new DifferenceIndexString();
		String[] arr1 = { "Maulik", "Harsh", "Krishna", "Technocredits" };
		String[] arr2 = { "Maulik", "Harsh", "Technocredits", "Krishna" };
		difference.displayIndex(arr1, arr2);
	}

}