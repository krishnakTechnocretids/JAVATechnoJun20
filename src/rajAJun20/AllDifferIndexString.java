package rajAJun20;

public class AllDifferIndexString {
	
	void allDifferIndexOfStringArray(String[] arr1 , String[] arr2){
		
		if(arr1.length == arr2.length) {       //if (!s1[i].equals(s2[i]))

			for(int index = 0 ; index < arr1.length ; index++ ) {
				if(!arr1[index].equals(arr2[index])) {
					System.out.println("String Values are not matching at index -> " + index + " , [arr1 value is " + arr1[index] + ", arr2 value is " + arr2[index] + "]" );
				}
			}
		}
		else {
			System.out.println("Both array lengths are not equal or identical");
		}
	}
	
	public static void main(String[] args) {
		AllDifferIndexString allDifferStringIndex = new AllDifferIndexString();
	 
		String[] string1 = {"Maulik","Harsh","Krishna","Technocredits"};
		String[] string2 = {"Maulik","Harsh","Technocredits","Krishna"};
		
		allDifferStringIndex.allDifferIndexOfStringArray(string1, string2);
		
	}
	
}
