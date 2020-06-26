package vireshJJun20.Assignment17;

public class IndexCheck {

	void checkIndex(String str) { // kindly ignore this method, basic method used as a reference for better
									// understanding
		for (int i = 0; i < str.length(); i++) {

			char ch1 = str.charAt(i);
			int temp = str.indexOf(ch1);
			System.out.println(ch1 + " -> First index = " + temp + " Last index = " + str.lastIndexOf(ch1));

		}
	}

	void checkIndex1(String str) { // This method gives the expected output after the updates suggested.

		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			int ch1Cnt = str.indexOf(ch1);
			if (str.indexOf(ch1) != str.lastIndexOf(ch1)) { //Suggested step by Krishna.
				if (i == str.indexOf(ch1)) {
					System.out.println(ch1 + " -> First index = " + ch1Cnt + "  Last index = " + str.lastIndexOf(ch1));
				}
			}
		}
	}

	public static void main(String[] args) {
		IndexCheck iCheck = new IndexCheck();
		iCheck.checkIndex1("technocredits");
	}
}
