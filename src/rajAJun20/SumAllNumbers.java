package rajAJun20;

public class SumAllNumbers {
	
	void displaySumOfAllNumbersInString(String str) {
		String temp = "0";
		int sum = 0;
		for (int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))) {
				temp = temp + str.charAt(index);
			}else {
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
		}
		if(!temp.equals("0"))
			sum = sum + Integer.parseInt(temp);
		System.out.println("Sum of all numbers in given string " + str +  " is : " + sum);
	}
	
	public static void main(String[] args) {
		SumAllNumbers sumAllNumbers = new SumAllNumbers();
		sumAllNumbers.displaySumOfAllNumbersInString("P71Rr29T2E");
		sumAllNumbers.displaySumOfAllNumbersInString("P6Rr29T2E3");
	}
}
