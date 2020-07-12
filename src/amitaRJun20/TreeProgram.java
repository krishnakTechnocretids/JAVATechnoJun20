package amitaRJun20;

public class TreeProgram {
	
	void display(int[] input) {
		
		int count =1;
		int max =input[0];
		
		for(int i =0; i<input.length; i++) {			
			if(input[i]>max) {
				count++;
				max = input[i];
			}
		}
		System.out.println("Total tree count is "+count);
	}

	public static void main(String[] args) {
		int[] array = {3,5,5,11,9,10,13};
		new TreeProgram().display(array);
	}
}