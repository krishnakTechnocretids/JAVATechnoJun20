package aavrutiDJun20.array;

public class DifferInStringArr {
	
	void differIndexInStringArr(String[] arr1,String[] arr2) {
		if(arr1.length == arr2.length) {
			for(int index=0;index<arr1.length;index++) {
				if(!arr1[index].equals(arr2[index]))
					System.out.println("\nValues are not matching at index -> " + index + ", [arr1 value is " + arr1[index] + ", arr2 value is " + arr2[index] + "]");
			}			
		}
		else
			System.out.println("Array are not identical");
	}
	
	public static void main(String[] args) {
		DifferInStringArr differInStringArr = new DifferInStringArr();
		
		String[] arr1 = {"Maulik", "Harsh", "Krishna", "Technocredits"};
		String[] arr2 = {"Maulik", "Harsh", "Technocredits","Krishna"};
		
		differInStringArr.differIndexInStringArr(arr1,arr2);
	}
}