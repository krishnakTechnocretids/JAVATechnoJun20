package deavinaSJun20;

public class SumofIntegersInString {


	public static void main(String[] args) {
		String input = "J7u9y8h1hb7j8j4j3j6";
		System.out.print("String input : "+input+"\nSum of integers in the given string input : "+new SumofIntegersInString().getSumOfIntegers(input));
	}
	int getSumOfIntegers(String input) {
		int sumofint = 0;
		for(int index = 0; index<input.length(); index++) {
			if(input.charAt(index)>='0' && input.charAt(index)<='9') {
				sumofint += (input.charAt(index) - '0');
			}
		}
		return sumofint;
	}

}
