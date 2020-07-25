package aavrutiDJun20;

public class PrintGlobant2 {
	
	void printGlobant(String input) {
		int num = 0;
		for(int index = input.length();index >= 0; index--) {
			for(int index2 = num; index2<input.length();index2++) {
				if(index2 == num){
					char ch = input.charAt(index2);
					System.out.print(Character.toUpperCase(ch));
				}
				else {
					System.out.print(input.charAt(index2));
				}
			}
			System.out.println();
			num++;
		}
	}
	
	public static void main(String[] args) {
		String input = "Globant";
		new PrintGlobant2().printGlobant(input);
	}
}