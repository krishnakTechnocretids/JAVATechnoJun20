package technoCredits;

//Hi Globant Hello Globant Hi Globant GM Globant Hi Globant Maulik
//Hi Globant Hello Globant Hi Globant GM Globant Hi 
public class ReplaceSecondLast {

	void replaceSecondLastOccurance(String input) {
		String tempInput = input;
		int index = input.lastIndexOf("Globant"); // 50Globant
		input = input.substring(0,index); // 0 --> 50
		String temp3 = tempInput.substring(index); // 51 end String
		
		int lastIndex = input.lastIndexOf("Globant"); // Second last 
		String temp1 = input.substring(0,lastIndex);//  Hi Globant Hello Globant Hi  GM 
		String temp2 = input.substring(lastIndex).replace("Globant", "Techno");// Globant Hi
		temp1 = temp1 + temp2 + temp3;
		System.out.println(temp1);
	}
	
	public static void main(String[] args) {
		new ReplaceSecondLast().replaceSecondLastOccurance("Hi Globant Hello Globant Hi Globant GM Globant Hi Globant Maulik");
	}
}
