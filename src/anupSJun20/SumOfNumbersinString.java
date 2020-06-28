package anupSJun20;
/*String input = "1Hh9PR34QP";
Hint : 1+9+3+4 [all digits]
output : 17*/

public class SumOfNumbersinString {
	
	static void findSumofNumbers(String str) {
		int sum = 0;
		for(int index = 0; index<str.length();index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				String x = String.valueOf(ch);
				int a = Integer.parseInt(x);
				sum = sum+a;
			}
			
		}
		System.out.println("The sum is " + sum);
		
	}
	public static void main(String[] args) {
		findSumofNumbers("1Hh9PR34QP");
	}

}
