/*
 Find all differ index from given arrays.
i/p:- arr1: {"Maulik", "Harsh", "Krishna", "Technocredits"}
      arr2: {"Maulik","Harsh","Technocredits","Krishna"}	
o/p:- Values are not matching at index -> 2, [arr1 value is Krishna, arr2 value is Technocredits] 
      Values are not matching at index -> 3, [arr1 value is Technocredits, arr2 value is Krishna]
 */
package shrutiDJun20;

public class StringArrIndexDiff {
	
	void findDiffStringIndex(String[] input1, String[] input2){
		boolean flag = true;
		if(input1.length==input2.length){
		for(int i = 0 ; i < input1.length ; i++){
				if(!input1[i].equals(input2[i])){
					flag = false;
					System.out.println("Values are not matching at index "+ i +" : Array 1 has value " +input1[i]+", Array 2 has value "+ input2[i]);				}		
			}
		}	
		else
			System.out.println("Arrays are not equal, cannot be compared");
		
		if(flag == true)
			System.out.println("Arrays are equal");
			
	}

	public static void main(String[] args) {
		StringArrIndexDiff StringArrIndexDiff=new StringArrIndexDiff();
		String[] arr1= {"Maulik", "Harsh", "Technocredits", "Krishna"};
	     String[]  arr2= {"Maulik","Harsh", "Krishna", "Technocredits"};
	     StringArrIndexDiff.findDiffStringIndex(arr1, arr2);
	     
		
	}
}
