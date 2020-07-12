package vaishnaviVJun20_Coding_Exams;

public class TreeProgram {
	int count =1;
	
	void howManyTreesYouCanSee(int[] treeArray) {
		int max=treeArray[0];
		for(int index=0;index<treeArray.length;index++) {
			if(treeArray[index]>max) {
				max=treeArray[index];
				count++;
			}
		}
		System.out.println("Visible Tree count is: " +count);
	}

	public static void main(String[] args) {
		int[] treeArray = {3,5,5,11,9,10,13};
        new TreeProgram().howManyTreesYouCanSee(treeArray);
	}

}
