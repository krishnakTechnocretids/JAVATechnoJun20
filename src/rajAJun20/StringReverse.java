package rajAJun20;

public class StringReverse {
	void showReverseString (String str) {
		System.out.println("Given String is :\n" +str+ " \nReversed String is :- ");
		for(int index = str.length()-1 ; index >= 0 ; index--)
			System.out.print(str.charAt(index));
	}

	public static void main(String[] args) {
		StringReverse stringReverse = new StringReverse();

		String string = "Hello this is technocredits";
		stringReverse.showReverseString(string);
	}

}
