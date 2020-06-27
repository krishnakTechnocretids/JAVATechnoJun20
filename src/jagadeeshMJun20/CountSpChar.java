package jagadeeshMJun20;

public class CountSpChar {
	void displaySpCharacter(String input) {
		int len = input.replaceAll("[a-zA-Z0-9]","").length();
		System.out.println("Total special character are "+len);
	}
	public static void main(String[] agrs) {
		CountSpChar countSpChar = new CountSpChar();
		String input = "Kr[i{s]hn}_a,Tech";
		countSpChar.displaySpCharacter(input);
	}
}
