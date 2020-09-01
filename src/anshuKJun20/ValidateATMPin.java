package anshuKJun20;

import java.util.Arrays;
import java.util.Scanner;

public class ValidateATMPin {
	static Scanner sc = new Scanner(System.in);

	void validateAtmPin(String input) {
		String AtmPinNo = "";
		boolean status = false;
		try {
			if (input.length() <= 4) {
				for (int index = 0; index < 4; index++) {
					char ch = input.charAt(index);
					if (Character.isDigit(ch)) {
						if (input.lastIndexOf(ch) == input.indexOf(ch)) {
							AtmPinNo = ch + AtmPinNo;

							if (AtmPinNo.length() == 4) {
								char[] array = AtmPinNo.toCharArray();
								Arrays.sort(array);
								String arraysorted = String.valueOf(array);

								StringBuilder strReverse = new StringBuilder(arraysorted);
								strReverse.reverse();
								if (input.equals(arraysorted) || input.equals(String.valueOf(strReverse))) {
									System.out.println(input + " ---> Valid pin");
								} else {
									System.out.println(
											input + " --> Invalid pin : Either in asscending or in dessending order.");
								}
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
		} catch (NumberFormatException ne) {
			ne.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ValidateATMPin AtmPin = new ValidateATMPin();
		String proceed = "";
		do {
			System.out.println("Enter your Attm Pin :-");
			String input = sc.nextLine();
			AtmPin.validateAtmPin(input);
			System.out.println(" Do yo want to proceed agin ? y/n");
			proceed = sc.nextLine();
		} while (proceed.equals("y"));
		sc.close();

	}
}
