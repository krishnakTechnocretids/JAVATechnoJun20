package aasthaJJun20;
//[3,5,5,11,9,10,13] --> 4

public class  TreeProgram{
	void displayVisibleTrees(int[] input) {
		int count = 0, tallest = 0;
		for(int index = 0; index < input.length; index++) {
			if(input[index] > tallest) {
				tallest = input[index];
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		int[] input = {3,5,5,11,9,10,13};
		TreeProgram treeProgram = new TreeProgram();
		treeProgram.displayVisibleTrees(input);
	}
}
