package deavinaSJun20;

public class PrintString_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Globant";
		new PrintString_2().printString_2(input);
	}
	void printString_2(String input) {
            
		for (int index = 0; index <= (input.length())-1; index++) {
			System.out.println(input.substring(index, index + 1).toUpperCase() + input.substring(index + 1));
		}
	}
}
