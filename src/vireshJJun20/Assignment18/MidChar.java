package vireshJJun20.Assignment18;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class MidChar {

	static void findMidChar(String str) { // searching for a middle characters based on mod(even/ odd values) and div values
		String[] ar=str.split(" ");
		for (int i= 0; i< ar.length; i++) {
			String str1= ar[i];
			int mod= str1.length()%2;
			int div= str1.length()/2;
			char mChar;
			if(mod==0) 
				mChar= str1.charAt(div-1);
			else
				mChar= str1.charAt((div-1)+mod);
			System.out.println(" -> "+mChar + " is a middle character in " + str1);
		}
	}

	public static void main(String[] args) {

		String input = "Harsh maulik viresh";
		MidChar.findMidChar(input);
	}
}
