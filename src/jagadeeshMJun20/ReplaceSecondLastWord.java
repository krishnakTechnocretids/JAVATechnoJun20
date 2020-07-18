/*Replace second last globant with Technocredits. 
input-> Hi Globant Hello Globant Hi Globant GM Globant Hi Globant

output->  Hi Globant Hello Globant Hi Globant GM Technocredits Hi Globant */
package jagadeeshMJun20;
public class ReplaceSecondLastWord {
		String replaceSecondLastString(String input, int replaceAtFrequency) {
		int counter = 0;
		String[] arr = input.split(" ");
		for (int index = (arr.length - 1); index >= 0; index--) {
			if (arr[index].equals("Globant"))
				counter++;
			if (counter == replaceAtFrequency) {
				arr[index] = arr[index].replace("Globant", "Technocredits");
				break;
			}
		}
		input = convertToString(arr,input);
	return input;
	}
	
	//To convert String array to String
		private String convertToString(String[] arr, String input) {
			input = input.replace(input, "");
			System.out.println(input);
			for (int index = 0; index < arr.length; index++)
				input += arr[index] + " ";
		return input;
		}

	public static void main(String[] agrs) {
		String input ="Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		System.out.println("Input is: "+input);
		int replaceAtFrequency=2;
		System.out.println("Output is: "+new ReplaceSecondLastWord().replaceSecondLastString(input,replaceAtFrequency));
				}
}