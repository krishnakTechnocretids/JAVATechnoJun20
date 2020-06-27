package swapnaWJun20;

public class CharInteger {

	public static void main(String[] args) {

		String  input = "1Hh9PR34QP";
		CharInteger charInteger = new CharInteger();
		charInteger.findSumOfDigit(input);
	}

	void findSumOfDigit(String input){
		int sum = 0;

		for (int index = 0; index < input.length(); index++) {

			if(Character.isDigit(input.charAt(index))) {
				String input1 = input.valueOf(input.charAt(index));
				int value = Integer.parseInt(input1);
				sum = sum + value;
			}
		}
		System.out.println("Output : " +sum);	 
	}
}
