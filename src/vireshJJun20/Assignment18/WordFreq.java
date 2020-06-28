package vireshJJun20.Assignment18;

public class WordFreq {

	static void checkFreq(String str) { // will remove the sp charaters and to make it all in lowercase.
		String[] ar = str.split(" ");
		for (int index = 0; index < ar.length; index++) {
			ar[index] = ar[index].replaceAll("_", "");
			ar[index] = ar[index].toLowerCase();
			
		}
		for (int i = 0; i < ar.length; i++) { // this for loop is to capture the number of occurances of each word.
			String str1 = ar[i];
			int cnt1 = 1;
			if (!ar[i].equals("*")) {
				for (int j = i + 1; j < ar.length; j++) {
					String str2 = ar[j];
					if (str1.equals(str2)) {
						cnt1++;
						ar[j] = "*";
					}
				}
				System.out.println(ar[i] + " -> " + cnt1);
			}
		}
	}

	public static void main(String[] args) {
		String input = ("Tech_no Hi T_EchNo H_I Tech hi_");
		WordFreq.checkFreq(input);
	}

}