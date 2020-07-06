package vireshJJun20.Assignment24;

public class ValidatePhNumber {

	boolean flag=true;

	boolean isNumCorrect(String num) {
		if (num.length() >= 10 && num.length()<=14) {
			if (num.length() == 10) {
				if (num.charAt(0) == '9' || num.charAt(0) == '8' || num.charAt(0) == '7') {
					for (int index=0; index< num.length(); index++) {
						if (!Character.isDigit(num.charAt(index))) {
							flag=false;
							break;
						}
					}
					
				}
				else
					flag= false;
			}
			if (num.length() == 14) {
				for (int index = 0; index < num.length(); index++) {

					if (num.charAt(index) == '+' && num.charAt(3) == ' ') {
						flag = true;
						break;
					} else
						flag = false;
				}
			}
			if (num.length() == 12) {
				for (int index = 0; index < num.length(); index++) {
					if (num.charAt(3) == ' ' && num.charAt(7) == ' ') {
						flag = true;
						break;
					} else
						flag = false;
				}
			}

			if (num.length() == 11) {
				if (num.charAt(0) == '0') {
					if (num.charAt(1) == '9' || num.charAt(1) == '8' || num.charAt(1) == '7') {
						for (int index = 2; index < num.length(); index++) {
							if (!Character.isDigit(num.charAt(index))) {
								flag = false;
								break;
							}
						}
					}
				}
				else flag = false;
			}

		}
		else 
			flag= false;
		
		return flag;
	}

	public static void main(String[] args) {

		String[] arr= {"+91 9765463742","09765463742", "976 546 3742", "9765463742", "9765463A42", "976546342", "6976546342"};
		for (int index= 0; index< arr.length; index++) {
			String num = arr[index]; //
			boolean flag = new ValidatePhNumber().isNumCorrect(num);
			if (flag == true)
				System.out.println( arr[index] + ": Number is valid");
			else
				System.out.println(arr[index] +  ": Number is not valid");
		}
	}
}
