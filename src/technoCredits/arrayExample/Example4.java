package technoCredits.arrayExample;

import java.util.Scanner;

public class Example4 {

	void printLengthOfInput(String[] input) {
		for(int index=0;index<input.length;index++) {
			System.out.println(input[index] + ":" + input[index].length()); //Maulik
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many elements you want to consider ?");
		int size = scanner.nextInt();
		String[] name = new String[size];
		
		for(int index=0;index<name.length;index++) {
			System.out.println("Enter name " + index + ":");
			name[index] = scanner.next();
		}
		
		Example4 example4 = new Example4();
		example4.printLengthOfInput(name);
		
//		String[] nameOtherOption = {"Maulik","Krishna","Harsh","Technocredits"};
//		int[] num = {12,13,11,99,88};
	}
}
