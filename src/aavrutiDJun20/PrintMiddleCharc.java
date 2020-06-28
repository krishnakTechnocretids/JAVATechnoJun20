//Print Middle Char of the given String

package aavrutiDJun20;

public class PrintMiddleCharc {
	
	void middleCharacter(String[] input) {
		int lengthInput = 0;
		for(int index=0;index<input.length;index++) {
			if(input[index].length()%2 != 0)
				lengthInput = input[index].length()/2;
			else
				lengthInput = (input[index].length()/2)-1;
			System.out.println("Middle character of " + input[index] + " is " + input[index].charAt(lengthInput));
		}
	}

	public static void main(String[] args) {
		PrintMiddleCharc printMiddleCharc = new PrintMiddleCharc();
		
		String input = "Harsh Maulik";
		String [] arrayInput = input.split(" "); 
		printMiddleCharc.middleCharacter(arrayInput);
	}
}
