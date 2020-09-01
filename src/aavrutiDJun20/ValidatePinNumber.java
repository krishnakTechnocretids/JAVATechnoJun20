package aavrutiDJun20;

import java.util.Arrays;

public class ValidatePinNumber {
	
	void validatePin(String number) {
		String num = "";
		boolean flag = true;
		
		try {
			Integer.parseInt(number);
			
			for(int index=0;index<number.length();index++) {
				if(num.contains(String.valueOf(number.charAt(index)))) {
					flag = false;
					break;
				}
				else {
					num += number.charAt(index);
				}
			}
			if(flag) {
				char charArray[] = number.toCharArray();
				Arrays.sort(charArray);
				String numSorted = String.valueOf(charArray);
				
				StringBuilder strReverse = new StringBuilder(numSorted);
				strReverse.reverse();
				if(number.equals(numSorted) || number.equals(String.valueOf(strReverse)))
					flag = true;
				else
					flag = false;
			}
		}
		catch(NumberFormatException ne){
			flag = false;
		}
		finally {
			if(flag) {
				System.out.println(number + " --> Valid Pin");
			}
			else {
				System.out.println(number+ " --> Invalid Pin");
			}
		}
	}

	public static void main(String[] args) {
		
		String[] numbers = {"9654","3578","97A2","9553","3687","98765","76$2"};
		
		for(int index=0;index<numbers.length;index++) {
			if(numbers[index].length()>4) {
				System.out.println(numbers[index] + " --> Invalid Pin");
			}
			else {
				new ValidatePinNumber().validatePin(numbers[index]);
			}
		}
	}
}
