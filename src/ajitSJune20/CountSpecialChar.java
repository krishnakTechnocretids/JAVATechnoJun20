package ajitSJune20;

public class CountSpecialChar {

	public static void main(String[] args) {

		String OriginalString = "Kr[i{s]hn}_a,Tech";
		String modifiedString = OriginalString.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Input String : " + OriginalString + "\n\nTotal special characters are : "
				+ (OriginalString.length() - modifiedString.length()));
	}
}
