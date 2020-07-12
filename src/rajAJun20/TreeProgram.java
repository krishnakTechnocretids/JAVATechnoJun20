package rajAJun20;

public class TreeProgram {
	
	int count = 1;

	void displayVisibleTrees(int[] array) {
		int max= array[0];
		for(int index = 1; index < array.length; index++) {
			if(array[index] > max) {
				max = array[index];
				count++;
			}
		}
		System.out.println("Visible Trees are : " +count);
	}

	public static void main(String[] args) {
		int[] inputArray = {3,5,5,11,9,10,13};
        new TreeProgram().displayVisibleTrees(inputArray);
	}
}