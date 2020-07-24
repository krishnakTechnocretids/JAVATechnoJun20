package yashCJun20.Assignment28;
public class SumOfAllNumbersInString {
	void toCalculateSumOfAllNumbersInString(String str) {
		String temp="";
		int sum=0;
		for(int index=0;index<str.length();index++) {
			int asciinum = str.charAt(index);
			if(asciinum>=48 && asciinum<=57) {
				sum += Character.getNumericValue(asciinum);

			}
			else {
				if(temp.length()>0) {
					sum=sum+Integer.parseInt(temp);
					temp="";
				}
			}
		}
			if (temp.length()>0) {
				sum=sum+Integer.parseInt(temp);
			}
			System.out.println("Sum of all numbers in String is:" + sum);
	}
	public static void main(String[] args) {
		
		SumOfAllNumbersInString sumOfAllNumbersInString = new SumOfAllNumbersInString();
		String s ="J7u9y8h1h8j4b7j3j6";
		sumOfAllNumbersInString.toCalculateSumOfAllNumbersInString(s);
	}
}