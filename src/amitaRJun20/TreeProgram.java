package amitaRJun20;

import java.util.Arrays;

public class TreeProgram {
	
	void display(int[] input) {
		
		int count =1;
		int max =input[0];
		
		for(int index =0; index<input.length; index++) {			
			if(input[index]>max) {
				count++;
				max = input[index];
			}
		}
		System.out.println("Total tree count is "+count);
	}

	public static void main(String[] args) {
		int[] array = {3,5,5,11,9,10,13};
		new TreeProgram().display(array);
	}
}