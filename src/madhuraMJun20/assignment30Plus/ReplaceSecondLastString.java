package madhuraMJun20.assignment30Plus;

/*Replace second last globant with Technocredits. 
input-> Hi Globant Hello Globant Hi Globant GM Globant Hi Globant

output->  Hi Globant Hello Globant Hi Globant GM Technocredits Hi Globant
*/
public class ReplaceSecondLastString {
	 void replacedString(String input) { 
		 String originalStr = input;
	 
		 String temp1 = input.substring(input.lastIndexOf("Globant")); // Globant
		 input = input.substring(0, input.lastIndexOf("Globant"));// Hi Globant Hello Globant Hi Globant GM Globant Hi
	 
		 String temp2 = input.substring(input.lastIndexOf("Globant")).replace("Globant","Technocredits");// Globant Hi =Technocredits Hi 
		 input = input.substring(0, input.lastIndexOf("Globant"));// Hi Globant Hello Globant Hi Globant GM
		 
		 originalStr = input + temp2 + temp1; 
		 System.out.println(originalStr); 
	 }
	 
	/*void replacedString(String input) {
		int totalCount = 0;
		String str = input.replace("Globant", "*");
		totalCount = (input.length() - str.length()) / 6;
		String[] arr = new String[input.length()];
		arr = input.split(" ");
		String output = "";
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].equals("Globant")) {
				count++;
				if (count == (totalCount - 1)) {
					arr[index] = "Technocredits";
				}
			}
			output += arr[index] + " ";
		}
		output = output.trim();
		System.out.println(output);
	}*/

	public static void main(String[] args) {
		ReplaceSecondLastString replaceSecondLastString = new ReplaceSecondLastString();
		String input = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		replaceSecondLastString.replacedString(input);
	}
}
