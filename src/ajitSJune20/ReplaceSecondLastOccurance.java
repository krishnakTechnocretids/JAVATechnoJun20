package ajitSJune20;

public class ReplaceSecondLastOccurance {

	static String find = "Globant";
	static String replacewith = "Technocredits";

	String[] stringReplaceWith(String str, String find, String replacewith) {
		String[] array = str.split(" ");
		int count = 0;
		for (int index = array.length - 1; index >= 0; index--) {
			if (array[index].equals(find)) {
				count++;
				if (count == 2) {
					array[index] = replacewith;
					break;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		String str = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		System.out.println("Input=====> " + str);
		String output = "";
		String[] resultArray = new ReplaceSecondLastOccurance().stringReplaceWith(str, find, replacewith);
		for (int index = 0; index < resultArray.length; index++) {
			output += resultArray[index] + " ";
		}
		System.out.println("Output====> " + output);
	}

}
