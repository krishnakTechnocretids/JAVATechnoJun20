package shrutiDJun20CodeExams;

public class VisibilitySequence {
	void findVisibleTrees(int[] input){
		int count = 0;
		for(int i = 0; i<input.length-1; i++){
			if(input[i]<input[i+1]){
				count = count+1;
			}
		}
		
		System.out.println("Count of visible trees--> "+count);
	}
	
	
	public static void main(String[] args) {
		int input[] = { 3,5,5,11,9,10,13};
		VisibilitySequence VisibilitySequence = new VisibilitySequence();
		VisibilitySequence.findVisibleTrees(input);
	}
}
