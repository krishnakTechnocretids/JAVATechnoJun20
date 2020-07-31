package shrutiDJun20Assignments;

public class ReplaceSecondLastWithoutLoop {
	
	void replaceString(String input, String word){
		
		String tempInput = input;
		System.out.println("----original input--------");
		System.out.println(input +"\n");
		int index = input.lastIndexOf(word);
		String temp3 = tempInput.substring(index);
		int lastIndex = input.lastIndexOf(word);
		String temp1 = input.substring(0,lastIndex);
		String temp2 = input.substring(lastIndex).replace(word, "Technocredit ");
		temp1 = temp1+temp2+temp3;
		System.out.println("------required output--------");
		System.out.println(temp1);
		
	}	
	public static void main(String[] args) {
		String input = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		String word = "Globant";
		ReplaceSecondLastWithoutLoop replaceSecondLastWithoutLoop = new ReplaceSecondLastWithoutLoop();
		replaceSecondLastWithoutLoop.replaceString(input, word);

	}
}

