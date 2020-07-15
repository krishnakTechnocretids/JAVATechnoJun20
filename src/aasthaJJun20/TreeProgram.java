package aasthaJJun20;
//[3,5,5,11,9,10,13] --> 4

public class  TreeProgram{
	void displayVisibleTrees(int[] input) {
		int count = 1, tallest = input[0];
		for(int index = 1; index < input.length; index++) {
			if(input[index] > tallest) {
				tallest = input[index];
				count++;
			}
		}
		System.out.println("Total no. of visible trees : "+count);
	}
	
	public static void main(String[] args) {
		int[] input = {3,5,5,11,9,10,13};
		TreeProgram treeProgram = new TreeProgram();
		treeProgram.displayVisibleTrees(input);
	}
}
