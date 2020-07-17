package anshuKJun20;

import java.util.Arrays;

public class CaseConverting {

	String[] getChangedCaseCharacter(String[] input) {
		String[] temparr = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			temparr[index] = "";
			for (int innerindex = 0; innerindex < input[index].length(); innerindex++) {
				if (input[index].charAt(innerindex) >= 'a' && input[index].charAt(innerindex) <= 'z') {
					temparr[index] += (char) (input[index].charAt(innerindex) - 32);
				} else if (input[index].charAt(innerindex) >= 'A' && input[index].charAt(innerindex) <= 'Z') {
					temparr[index] += (char) (input[index].charAt(innerindex) + 32);
				} else {
					temparr[index] += (input[index].charAt(innerindex));
				}
			}
		}
		return temparr;
	}

	public static void main(String[] args) {
		CaseConverting caseConverting = new CaseConverting();
		String[] array = { "AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh" };
		System.out.println("Input is----> " + Arrays.toString(array));
		System.out.println("Output is ----> " + Arrays.toString(caseConverting.getChangedCaseCharacter(array)));
		//caseConverting.getChangedCaseCharacter(array);

	}
}
