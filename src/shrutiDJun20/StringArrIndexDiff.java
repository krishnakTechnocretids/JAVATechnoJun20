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
		String s1 ="";
		String s2 ="";
		if(input1.length==input2.length){
		for(int i = 0 ; i < input1.length ; i++){
		//	for(int j = 0 ; j < input2.length ; j++){
				if(!input1[i].equals(input2[i])){
					s1 = input1[i];
					s2 = input2[i];
					System.out.println("Values are not matching at index "+ i +" : Array 1 has value " +s1+", Array 2 has value "+ s2);				}		
			}
		}		
	}

	public static void main(String[] args) {
		StringArrIndexDiff StringArrIndexDiff=new StringArrIndexDiff();
		String[] arr1= {"Maulik", "Harsh", "Krishna", "Technocredits"};
	     String[]  arr2= {"Maulik","Harsh","Technocredits","Krishna"};
	     StringArrIndexDiff.findDiffStringIndex(arr1, arr2);
	     
		
	}
}
