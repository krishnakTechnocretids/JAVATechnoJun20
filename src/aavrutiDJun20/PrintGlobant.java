package aavrutiDJun20;

public class PrintGlobant {
	
	public static void main(String[] args) {
		String input ="Globant";
		for(int index = input.length();index >= 0; index--) {
			for(int index2 = 0; index2<index;index2++) {
				System.out.print(input.charAt(index2));
			}
			System.out.println();
		}
	}
}