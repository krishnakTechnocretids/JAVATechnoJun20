package jagadeeshMJun20;

public class PinValidation {

		void validatePinNum(String pinNum) {
			if (validatePin(pinNum) && allDigits(pinNum) && repetitiveNum(pinNum)) {
				if (ascendingOrder(pinNum))
					System.out.println("Input: " + pinNum + "  --> Valid PIN");
				else if (descendingOrder(pinNum))
					System.out.println("Input: " + pinNum + "  --> Valid PIN");
				else
					System.out.println("Input: " + pinNum + "  --> Invalid PIN");
			} else
				System.out.println("Input: " + pinNum + "  --> Invalid PIN");
		}

		Boolean validatePin(String pinNum) {
			if (pinNum.length() == 4)
				return true;
			else {
				return false;
			}
		}

		Boolean allDigits(String pinNum) {
			try {
				int num = Integer.parseInt(pinNum);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		}

		Boolean repetitiveNum(String pinNum) {
			int nextDigit = 0;
			int tempdigit = 0;
			for (int index = 0; index < pinNum.length(); index++) {
				tempdigit = (int) pinNum.charAt(index);
				for (int innerindex = (index + 1); innerindex < pinNum.length(); innerindex++) {
					nextDigit = (int) pinNum.charAt(innerindex);
					if (tempdigit == nextDigit) {
						return false;
					}
				}
			}
			return true;
		}

		Boolean ascendingOrder(String pinNum) {
			int nextDigit = 0;
			for (int index = 0; index < pinNum.length(); index++) {
				int firstDigit = (int) pinNum.charAt(index);
				for (int innerindex = (index + 1); innerindex < pinNum.length(); innerindex++) {
					nextDigit = (int) pinNum.charAt(innerindex);
					if (firstDigit < nextDigit) {
						return false;
					}
				}
			}
			return true;
		}

		Boolean descendingOrder(String pinNum) {
			int nextDigit = 0;
			for (int index = 0; index < pinNum.length(); index++) {
				int firstDigit = (int) pinNum.charAt(index);
				for (int innerindex = (index + 1); innerindex < pinNum.length(); innerindex++) {
					nextDigit = (int) pinNum.charAt(innerindex);
					if (firstDigit > nextDigit) {
						return false;
					}
				}
			}
			return true;
		}

		public static void main(String[] agrs) {
			PinValidation pinValidation = new PinValidation();
			String[] pinNumbers = { "9654", "3578", "97A2", "9553", "8759", "98765", "76$2" };

			for (int index = 0; index < pinNumbers.length; index++)
				pinValidation.validatePinNum(pinNumbers[index]);

		}
	}
