package kARAN1595;

public class SpecialCharaterCount {
	void countSpecialCharactersInWord(String str) {
		int count = 0;
		String name = str.replace("[", "").replace("{", "").replace("]", "").replace("}", "").replace("_", "").replace(",", "");
		count = str.length() - name.length();
		System.out.println("special characters are: " + count);

	}

	public static void main(String[] args) {
		SpecialCharaterCount specialCharaterCount = new SpecialCharaterCount();
		String input = "Kr[i{s]hn}_a,Tech";
		specialCharaterCount.countSpecialCharactersInWord(input);

	}
}
