package anupSJun20;
/*WAP to do sum of numbers in given statement. (Use split method and Exception handling concept. Do not use character class methods and ascii concept.) 

Input : I have 5 Years 6 month of experience.
Output : 11*/

public class SumOfNumbersInStatement {
	int sum = 0;
	int findSumOfNumbers(String str) {
		String[] newstr = str.split(" ");
		for(int index = 0;index<newstr.length;index++) {
			try {
				int num = Integer.parseInt(newstr[index]);
				sum+=num;
			}
			catch(NumberFormatException ne) {
				
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		SumOfNumbersInStatement sumOfNumbersInStatement = new SumOfNumbersInStatement();
		String str = "I have 5 Years 6 month of experience";
		System.out.println("The input string is "+ str);
		System.out.println("The output sum is " + sumOfNumbersInStatement.findSumOfNumbers(str));
	}
}
