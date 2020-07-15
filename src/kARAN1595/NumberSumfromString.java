package kARAN1595;

public class NumberSumfromString {
	
	void displaySumOfNumbersFromString(String str) {
		String temp = "0";
		int sum = 0;
		for (int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))) {
				temp +=str.charAt(index);
			}else {
				sum+= Integer.parseInt(temp);
				temp = "0";
			}
		}
		if(!temp.equals("0"))
			sum = sum + Integer.parseInt(temp);
		System.out.println("Sum of all numbers in given string: " + str+": " + sum);
	}

	public static void main(String[] args) {
		NumberSumfromString numberSumfromString = new NumberSumfromString();
		numberSumfromString.displaySumOfNumbersFromString("P71Rr29T2E");
		numberSumfromString.displaySumOfNumbersFromString("P6Rr29T2E3");
	}
}
