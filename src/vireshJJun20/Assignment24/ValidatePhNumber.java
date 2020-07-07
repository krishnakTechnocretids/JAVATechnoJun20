package vireshJJun20.Assignment24;

public class ValidatePhNumber {

	boolean flag=true;

	boolean isNumCorrect(String phNum) {
		if (phNum.length() >= 10 && phNum.length()<=14) {
			if (phNum.length() == 10) {
				if (phNum.charAt(0) == '9' || phNum.charAt(0) == '8' || phNum.charAt(0) == '7') {
					for (int index=0; index< phNum.length(); index++) {
						if (!Character.isDigit(phNum.charAt(index))) {
							flag=false;
							break;
						}
					}
					
				}
				else
					flag= false;
			}
			if (phNum.length() == 14) {
				for (int index = 0; index < phNum.length(); index++) {

					if (phNum.charAt(index) == '+' && phNum.charAt(3) == ' ') {
						flag = true;
						break;
					} else
						flag = false;
				}
			}
			if (phNum.length() == 12) {
				for (int index = 0; index < phNum.length(); index++) {
					if (phNum.charAt(3) == ' ' && phNum.charAt(7) == ' ') {
						flag = true;
						break;
					} else
						flag = false;
				}
			}

			if (phNum.length() == 11) {
				if (phNum.charAt(0) == '0') {
					if (phNum.charAt(1) == '9' || phNum.charAt(1) == '8' || phNum.charAt(1) == '7') {
						for (int index = 2; index < phNum.length(); index++) {
							if (!Character.isDigit(phNum.charAt(index))) {
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
