package rachanaGJun20.CoadingExam;
import java.util.TreeSet;

public class ATMPinValidate {
	
	// Pin number validations
	void validateATMPin(String[] atmpins) {

		for (int index = 0; index < atmpins.length; index++) {
			String pinnumber = atmpins[index];
			TreeSet<Integer> pinset = new TreeSet<Integer>();
			if (pinnumber.length() == 4) {
				if (isDigit(pinnumber)) {
					for (int j = 0; j < pinnumber.length(); j++) {
						pinset.add(Integer.parseInt(String.valueOf(pinnumber.charAt(j))));
					}
					if (pinset.size() < 4) {
						System.out.println("Number is not valid as number having repeated digits " + pinnumber);
					} else {
						if (isAsc(pinnumber, pinset) || isDesc(pinnumber, pinset)) {
							System.out.println("Number is valid  " + pinnumber);
						} else {
							System.out.println("Number is not valid " + pinnumber);
						}
					}
				}
			} else {
				System.out.println("Number is not of valid length " + pinnumber);
			}
		}
	}

	// check number is in asc order
	boolean isAsc(String pinnumber, TreeSet<Integer> pinset) {
		String formPin = "";
		for (Integer digit : pinset) {
			formPin = formPin + digit;
		}
		if (pinnumber.equals(formPin)) {
			return true;
		}
		return false;
	}

	//check number is in desc order
	boolean isDesc(String pinnumber, TreeSet<Integer> pinset) {
		String formPin = "";
		for (Integer digit : pinset.descendingSet()) {
			formPin = formPin + digit;
		}
		if (pinnumber.equals(formPin)) {
			return true;
		}
		return false;
	}

	// check for digit
	boolean isDigit(String pinnumber) {
		try {
			Integer.parseInt(pinnumber);

		} catch (NumberFormatException e) {
			System.out.println("ATm Pin Should contain all digits " + pinnumber);
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		ATMPinValidate atmpinvalidate = new ATMPinValidate();
		String[] atmpins = { "9654", "3578", "97A2", "9553", "3687", "98765", "76$2" };
		atmpinvalidate.validateATMPin(atmpins);
	}

}
