package rachanaGJun20.CoadingExam;

import java.util.Arrays;

public class ATMPinValidateWithoutCollection {

	// Pin number validations
	public void validateATMPin(String[] atmpins) {

		for (int index = 0; index < atmpins.length; index++) {
			String pinnumber = atmpins[index];
			if (pinnumber.length() == 4) {
				if (isDigit(pinnumber)) {
					if (isRepeatedDigit(pinnumber)) {
						System.out.println("Number is not valid as Having repeated digits [" + pinnumber + "]");
					} else if ((isAsc(pinnumber) || isDesc(pinnumber))) {
						System.out.println("Number is valid  " + pinnumber);
					} else {
						System.out.println("Number is not valid " + pinnumber);
					}
				}
			} else {
				System.out.println("Number is not of valid length " + pinnumber);
			}
		}
	}

	private boolean isRepeatedDigit(String pinnumber) {
		char[] charray = pinnumber.toCharArray();
		for (int index = 0; index < charray.length; index++) {
			for (int innerindex = index + 1; innerindex < charray.length; innerindex++) {
				if (charray[index] == charray[innerindex]) {
					return true;
				}
			}
		}
		return false;
	}

	// check number is in asc order
	private boolean isAsc(String pinnumber) {
		char[] charray = pinnumber.toCharArray();
		Arrays.sort(charray);
		if (pinnumber.equals(String.valueOf(charray))) {
			return true;
		} else {
			return false;
		}
	}

	// check number is in desc order
	private boolean isDesc(String pinnumber) {
		char[] charray = pinnumber.toCharArray();
		Arrays.sort(charray);
		StringBuilder strrev = new StringBuilder(pinnumber);
		if (String.valueOf(charray).equals(String.valueOf(strrev.reverse()))) {
			return true;
		} else
			return false;
	}

	// check for digit
	private boolean isDigit(String pinnumber) {
		try {
			Integer.parseInt(pinnumber);

		} catch (NumberFormatException e) {
			System.out.println("ATm Pin Should contain all digits " + pinnumber);
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		ATMPinValidateWithoutCollection validatepin = new ATMPinValidateWithoutCollection();
		String[] atmpins = { "9654", "3578", "97A2", "9553", "3687", "98765", "76$2" };
		validatepin.validateATMPin(atmpins);
	}
}
