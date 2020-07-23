package piyushPJun20;
public class CountSpChar {
	void displaySpCharCount(String str) {
		String str1 = str;
		str1 = str1.replace("[","").replace("{","").replace("]","").replace("}","").replace("_","").replace(",","");
		String[] strArray = str1.split(" ");
		System.out.println("Input: " + str);
		System.out.println("Output: Number of Special Characters: " + (strArray.length));
	}

	public static void main(String[] args) {
		CountSpChar count = new CountSpChar();

		String str = "Kr[i{s]hn}_a,Tech";
		count.displaySpCharCount(str);
	}
}
