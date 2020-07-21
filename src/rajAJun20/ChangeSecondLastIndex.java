package rajAJun20;

public class ChangeSecondLastIndex {
	String[]  replaceLastSecondWordInString(String str, String replaceWord, String actualWord) {
		String[] array = str.split(" ");
		int count = 0;
		for (int index = array.length-1; index >= 0 ; index--) {
			if (array[index].equals(actualWord)) {
				count++;
				if (count == 2) {
					array[index] = replaceWord;
					break;
				}
			}
		}

		return array;
	}

	public static void main(String[] args) {
		String str = "Hi Globant Hello Globant Hi Globant GM Globant Hi Globant";
		System.out.println("Given string is : \n" +str);
		String replaceWord = "Technocredits" , actualWord = "Globant";
		String output = "";
		String[] array = new ChangeSecondLastIndex().replaceLastSecondWordInString(str, replaceWord , actualWord);
		for(int index=0; index<array.length;index++) {
			output += array[index] + " ";
		}
		System.out.println("String after replacement is: \n" +output);
	}
}
