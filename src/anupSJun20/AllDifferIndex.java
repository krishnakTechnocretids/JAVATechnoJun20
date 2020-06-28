package anupSJun20;
/* Program 5: Find all differ index from given arrays.
               i/p:- arr1: {"Maulik", "Harsh", "Krishna", "Technocredits"}
                       arr2: {"Maulik","Harsh","Technocredits","Krishna"}		
               o/p:- Values are not matching at index -> 2, [arr1 value is Krishna, arr2 value is Technocredits] 
                        Values are not matching at index -> 3, [arr1 value is Technocredits, arr2 value is Krishna] */

public class AllDifferIndex {
	static void findAllDifferIndex(String[] arr1,String[] arr2) {
		boolean flag = true;
		if(arr1.length == arr2.length) {
			for(int index = 0;index<arr1.length;index++) {
				if(!arr1[index].equalsIgnoreCase(arr2[index])) {
						flag = false;
						System.out.println("Values are not matching at index -> " +index+ " arr1 value is "+ arr1[index] +","+ " arr2 value is "+ arr2[index]);
					}
				}
			if (flag == true) {
				System.out.println("Both the arrays are equal");
			}
		}
		else
			System.out.println("Array lengths re not equal");
		
	}
	public static void main(String[] args) {
		String[] arr1 = {"Maulik", "Harsh", "Krishna", "Technocredits"};
		String[] arr2 = {"Maulik","Harsh","Technocredits","Krishna"};
		findAllDifferIndex(arr1,arr2);
		
	}

}
