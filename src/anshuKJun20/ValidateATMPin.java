package anshuKJun20;

import java.util.Scanner;

public class ValidateATMPin {
	static Scanner sc = new Scanner(System.in);

	void validateAtmPin(String input) {
		String AtmPinNo = "";
		String proceed = "";
		if (input.length() <= 4) {
			for (int index = 0; index < 4; index++) {
				char ch = input.charAt(index);
				if (Character.isDigit(ch)) {
					if (input.lastIndexOf(ch) == input.indexOf(ch)) {
						AtmPinNo = ch + AtmPinNo;
						if (AtmPinNo.length() == 4) {
							System.out.println(input + " --> valid pin");
						}
					} else {
						System.out.println(input + " --> Invalid pin : reapeated digit in your pin ");
					}
				} else {
					System.out.println(input + " --> Invalid pin : enter only numbers");
				}
			}

		} else {
			System.out.println(input + "  --> Your pin no length is not valid");
		}
	}

	public static void main(String[] args) {
		ValidateATMPin AtmPin = new ValidateATMPin();
		System.out.println("Enter your Attm Pin :-");
		String input = sc.nextLine();

		AtmPin.validateAtmPin(input);

	}
}
