package jagadeeshMJun20;

public class SumOfString {
	
	void displaySum(String input) {
		int sum=0;
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				sum = sum+Integer.parseInt(String.valueOf(ch));
			System.out.print(Integer.parseInt(String.valueOf(ch)) +"+");
			}
			
		}
		System.out.println(" Output is  "+sum);
	}

	public static void main(String[] args) {
		SumOfString sumOfString = new SumOfString();
		String input = "1Hh9PR34QP";
		sumOfString.displaySum(input);
		

	}

}
