package aasthaJJun20;

public class TestComparisionOfArrays {
	//Program 2: Find first differ index from given arrays.
		void findFirstDifferIndex(int[] input1, int[] input2){
			if(input1.length == input2.length){
				for(int index = 0; index<input1.length; index++){
					if(input1[index] != input2[index]){
						System.out.println("Values are not matching at index -> "+index);
						return;
					}
				}
			}
			else
				System.out.println("The given array differs in length");
		}
		//Program 3: Find all differ index from given arrays. 
		void findAllDifferIndex(int[] input1, int[] input2){
			if(input1.length == input2.length){
				for(int index = 0; index<input1.length; index++){
					if(input1[index] != input2[index]){
						System.out.println("Values are not matching at index -> "+index);
					}
				}
			}
			else
				System.out.println("The given array differs in length");
		}
		//Program 4: Find max value at differed index.
		void findMaxValueAtDifferIndex(int[] input1, int[] input2){
			if(input1.length == input2.length){
				for(int index = 0; index<input1.length; index++){
					if(input1[index] > input2[index]){
						System.out.println("Values are not matching at index -> "+index+", From ("+input1[index]+","+input2[index]+") max value is "+input1[index]);
					}
					else if(input1[index] < input2[index]){
						System.out.println("Values are not matching at index -> "+index+", From ("+input1[index]+","+input2[index]+") max value is "+input2[index]);
					}
				}
			}
			else
				System.out.println("The given array differs in length");
		}
		
		//Program 5: Find all differ index from given String arrays.
		void findAllStringDifferIndex(String[] input1, String[] input2){
			if(input1.length == input2.length){
				for(int index = 0; index<input1.length; index++){
					if(!input1[index].equalsIgnoreCase(input2[index])){
						System.out.println("Values are not matching at index -> "+index+", [input1 value is "+input1[index]+", input2 value is "+input2[index]+"]");
					}
				}
			}
			else
				System.out.println("The given String array differs in length");
		}
		
		public static void main(String[] args){
			TestComparisionOfArrays testComparisionOfArrays = new TestComparisionOfArrays();
			int[] arr1 = {10,2,9,14,3,};
			int[] arr2 = {10,2,18,14,3};
			int[] arr3 = {10,2,18,14,13};
			String[] arr4= {"Maulik", "Harsh", "Krishna", "Technocredits"};
	        String[] arr5= {"Maulik","Harsh","Technocredits","Krishna"};
			System.out.println("\nProgram:2 Output:---------------------------------");
			testComparisionOfArrays.findFirstDifferIndex(arr1,arr2);
			System.out.println("\nProgram:3 Output:---------------------------------");
			testComparisionOfArrays.findAllDifferIndex(arr1,arr3);
			System.out.println("\nProgram:4 Output:---------------------------------");
			testComparisionOfArrays.findMaxValueAtDifferIndex(arr1,arr2);
			System.out.println("\nProgram:5 Output:---------------------------------");
			testComparisionOfArrays.findAllStringDifferIndex(arr4,arr5);
		}
}
