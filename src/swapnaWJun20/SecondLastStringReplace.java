/* Replace second last globant with Technocredits.
input-> Hi Globant Hello Globant Hi Globant GM Globant Hi Globant
output-> Hi Globant Hello Globant Hi Globant GM Technocredits Hi Globant
*/

package swapnaWJun20;

public class SecondLastStringReplace {

	private void getSecondLastString(String input) {

		// last index of "Globant"
		int lastIndex = input.lastIndexOf("Globant");

		// Substring till last index of "Globant"
		String newInp = input.substring(0, input.lastIndexOf("Globant"));

		// Second last index of "Globant" by taking new string
		int secondLastIndex = newInp.lastIndexOf("Globant");

		// Substring till second last index of "Globant"
		String replaceStr = newInp.substring(secondLastIndex);

		// Replacing the word "Globant" with "Technocredits"
		String outputString = replaceStr.replace("Globant", "Technocredits");

		System.out
				.println("Output: " + newInp.substring(0, secondLastIndex) + outputString + input.substring(lastIndex));
	}

	public static void main(String[] args) {
		SecondLastStringReplace secondLast = new SecondLastStringReplace();
		String input = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		System.out.println("Input: " + input);
		secondLast.getSecondLastString(input);
	}
}
