package yashCJun20.Assignment26;

public class SumOfAllNumbersInString {
	
	void toCalculateSumOfAllNumbersInString(String str) {
		String temp="";
		int sum=0;
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(Character.isDigit(ch)) {
				temp=temp+ch;
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
		SumOfAllNumbersInString sumchOfAllNumbersInString = new SumOfAllNumbersInString();
	    sumchOfAllNumbersInString.toCalculateSumOfAllNumbersInString("P71Rr29T2E");
	    sumchOfAllNumbersInString.toCalculateSumOfAllNumbersInString("P6Rr29T2E3");
	}
}