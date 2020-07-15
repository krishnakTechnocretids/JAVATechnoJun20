package maheshKJun20.StringExamples;

public class SumOfDigits {
	
	void displaySumOfDigits(String str) {
		String temp = "0";
		int sum = 0;
		for (int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))) {
				temp += str.charAt(index);
			}else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		if(!temp.equals("0"))
			sum += Integer.parseInt(temp);
		System.out.println("Sum of all numbers in String '" + str +  "' is:" + sum);
	}
	 
	public static void main(String[] args) {
		SumOfDigits sumOfDigits = new SumOfDigits();
		sumOfDigits.displaySumOfDigits("P71Rr29T2E");
		sumOfDigits.displaySumOfDigits("P6Rr29T2E3");
	}
}
