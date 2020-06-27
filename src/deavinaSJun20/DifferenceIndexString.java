package deavinaSJun20;

public class DifferenceIndexString {

	public static void main(String[] args) {
		String[] arr1= {"Maulik", "Harsh", "Krishna", "Technocredits"};
		String[] arr2= {"Maulik","Harsh","Technocredits","Krishna"};
		new DifferenceIndexString().diffrenceIndexvaluetringArray(arr1, arr2);
	}
	void diffrenceIndexvaluetringArray(String[]arr1,String[]arr2) {
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i]!=(arr2[i])) {
					System.out.println("Values are not matching at index -> " + i +",[arr1 value is " +arr1[i]+ ", arr2 value is "+arr2[i]);
				}
			}
		} else {
			System.out.println("Arrays are not having same length");
		}
	}
}
