package maheshKJun20;

public class ValidateAtmPin {
	
	void validatePin(String pin) {
		if (validateLength(pin)) {
			if (validateDigit(pin)) {
				if (validateNumRepitition(pin))
					if (validateAscendingOrder(pin) || validateDescendingOrder(pin))
						System.out.println("ATM pin " + pin + " is Valid");
					else
						System.out.println("Invalid pin. Order Should be Ascending or Desending");
			}				
		}		
	}
	
	boolean validateLength(String pin) {
		if (pin.length() == 4)
			return true;
		else {
			System.out.println("Invalid pin. Length of pin: " + pin.length());
			return false;
		}
	}
	
	boolean validateDigit(String pin) {
		for (int index=0; index<pin.length();index++) {
			if(!Character.isDigit(pin.charAt(index))){
				System.out.println("Invalid pin. Invalid character in the pin '" + pin.charAt(index) + "'");
				return false;
			}
		}
		return true;
	}
	
	boolean validateAscendingOrder(String pin) {
		for (int index=0; index<pin.length();index++) {
			int minAscii = (int)pin.charAt(index);
			for (int innerIndex=index+1; innerIndex<pin.length();innerIndex++) {
				if (!(minAscii < (int)pin.charAt(innerIndex))) {
					return false;
				}
			}
		}
		return true;
	}
	
	boolean validateDescendingOrder(String pin) {
		for (int index=0; index<pin.length();index++) {
			int maxAscii = (int)pin.charAt(index);
			for (int innerIndex=index+1; innerIndex<pin.length();innerIndex++) {
				if (!(maxAscii > (int)pin.charAt(innerIndex))) {
					return false;
				}
			}
		}
		return true;
	}
	
	boolean validateNumRepitition(String pin) {
		for (int index=0; index<pin.length();index++) {
			for (int innerIndex=index+1; innerIndex<pin.length();innerIndex++) {
				if (((int)pin.charAt(index) == (int)pin.charAt(innerIndex))) {
					System.out.println("Invalid pin. Number " + pin.charAt(index) +" is repeted ");
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		ValidateAtmPin validateAtmPin = new ValidateAtmPin();
		String[] pinArray = {"9654", "3578", "97A2", "9553", "3687", "98765", "76@2"};
		for (int index=0;index<pinArray.length;index++) {
			validateAtmPin.validatePin(pinArray[index]);
		}
	}
}
