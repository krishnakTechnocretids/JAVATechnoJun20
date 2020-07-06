package swapnaWJun20;

public class MobileNoValidity {

	boolean flag;

	boolean checkAlphabet(String mobNo) {
		flag = true;
		for (int i = 0; i < mobNo.length(); i++) {
			if (Character.isAlphabetic(mobNo.charAt(i)))
				flag = false;
		}
		return flag;
	}

	void checkMobileNo(String mobNo) {
		if (mobNo.length() > 14 || mobNo.length() < 10) {
			System.out.println("\n" + mobNo + " : Mobile no is invalid.");
		} else {
			if (mobNo.length() == 10 && mobNo.startsWith("9") || mobNo.startsWith("8") || mobNo.startsWith("7")) {
				checkAlphabet(mobNo);
				if (flag == true)
					System.out.println("\n" + mobNo + " : Mobile no is valid.");
				else
					System.out.println("\n" + mobNo + " : Mobile no is invalid.");
			} else if (mobNo.length() == 11 && mobNo.startsWith("0")) {
				checkAlphabet(mobNo);
				if (flag == true)
					System.out.println("\n" + mobNo + " : Mobile no is valid.");
				else
					System.out.println("\n" + mobNo + " : Mobile no is invalid.");
			} else if (mobNo.length() == 12 && mobNo.charAt(3) == ' ' && mobNo.charAt(7) == ' ') {
				checkAlphabet(mobNo);
				if (flag == true)
					System.out.println("\n" + mobNo + " : Mobile no is valid.");
				else
					System.out.println("\n" + mobNo + " : Mobile no is invalid.");
			} else if (mobNo.startsWith("+91") && mobNo.length() == 14) {
				checkAlphabet(mobNo);
				if (flag == true)
					System.out.println("\n" + mobNo + " : Mobile no is valid.");
				else
					System.out.println("\n" + mobNo + " : Mobile no is invalid.");
			} else {
				System.out.println("\n" + mobNo + " : Mobile no is invalid.");
			}
		}
	}

	public static void main(String[] args) {
		MobileNoValidity mobileNoValidity = new MobileNoValidity();

		mobileNoValidity.checkMobileNo("+91 9765463742");
		mobileNoValidity.checkMobileNo("09765463742");
		mobileNoValidity.checkMobileNo("976 546 3742");
		mobileNoValidity.checkMobileNo("9765463742");

		mobileNoValidity.checkMobileNo("998979765463742"); // invalid
		mobileNoValidity.checkMobileNo("0765463742");// invalid
		mobileNoValidity.checkMobileNo("99897  83742"); // invalid
		mobileNoValidity.checkMobileNo("998 97 83742");// invalid
		mobileNoValidity.checkMobileNo("998 979 S7Y2");// invalid
	}
}