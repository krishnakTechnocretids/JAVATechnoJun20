package shrutiDJun20CodeExams;

public class VisibilitySequence {
	void findVisibleTrees(int[] input) {
		int count = 1;
		int max = input[0];
		for (int i = 1; i < input.length; i++) {
			
			if (max < input[i]) {
				max = input[i];
				count = count + 1;
			}
		}
		System.out.println("Count of visible trees--> " + count);
	}
	public static void main(String[] args) {
		int input[] = { 3, 5, 5, 11, 9, 10, 13, 14, 16, 1, 1, 100 };
		VisibilitySequence VisibilitySequence = new VisibilitySequence();
		VisibilitySequence.findVisibleTrees(input);
	}
}
