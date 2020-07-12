package amitaRJun20;

public class TreeProgram {
	
	void display(int[] input) {
		
		int count =0;
		
		for(int i =0; i<input.length-1; i++) {
			int max =input[i];
			if(input[i+1]>max) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int[] array = {3,5,5,11,9,10,13};
		new TreeProgram().display(array);

	}

}
