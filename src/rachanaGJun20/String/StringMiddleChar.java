package rachanaGJun20.String;

public class StringMiddleChar {

	// method will find out middle character of all words from the given string
	void findStringMiddleChar(String givenstr) {

		String[] words = givenstr.split(" ");

		for (int i = 0; i < words.length; i++) {
			char middlechar = words[i].charAt(((words[i].length() - 1)) / 2);
			System.out.println("Middle char of a Word " + words[i] + " is: " + middlechar);
		}
	}

	public static void main(String[] args) {
		StringMiddleChar stringmiddlechar = new StringMiddleChar();
		String str = "Harsh Maulik";
		System.out.println("Given String is : " + str);
		stringmiddlechar.findStringMiddleChar(str);

	}

}
