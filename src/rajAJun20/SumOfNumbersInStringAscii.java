package rajAJun20;

public class SumOfNumbersInStringAscii {
	
	void findSumOfNumbersInString(String input){
		int sum = 0;
		for(int index = 0; index < input.length(); index++){
			if(input.charAt(index) >= '0' && input.charAt(index) <= '9'){
				sum += Integer.parseInt(String.valueOf(input.charAt(index)));
			} 
		}
		System.out.println("Sum of all the numbers present in string " + input + " is : " + sum);
	}

	public static void main(String[] args){
		new SumOfNumbersInStringAscii().findSumOfNumbersInString("J7u9y8h1h8j4b7j3j6");
	}
}