package suparnaNJune20.Assignment14;
import java.util.Scanner;
public class FrequencyOfCharInString {
	void findCharFreq(String str, String ch) {
		int charcount = 0;
		for (int index = 0; index < str.length(); index++) {
			String strNew = String.valueOf(str.charAt(index));
			if (strNew.equalsIgnoreCase(ch))
				charcount++;
		}
		System.out.println("Frequency of '" + ch + " 'cgarater in" + str + "= " + charcount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		new FrequencyOfCharInString().findCharFreq("Technocredit", "T");
	}
}
