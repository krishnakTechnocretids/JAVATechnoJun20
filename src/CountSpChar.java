
public class CountSpChar {
	void displaySpCharCount(String str) {
		String str1 = str;

		str1 = str1.replace('[', ' ');
		str1 = str1.replace('{', ' ');
		str1 = str1.replace(']', ' ');
		str1 = str1.replace('}', ' ');
		str1 = str1.replace('_', ' ');
		str1 = str1.replace(',', ' ');

		String[] strArray = str1.split(" ");
		System.out.println("Input: "+str);
		System.out.println("Output: Number of Special Characters: "+(strArray.length - 1));
	}

	public static void main(String[] args) {
		CountSpChar count = new CountSpChar();

		String str = "Kr[i{s]hn}_a,Tech";
		count.displaySpCharCount(str);
	}
}
