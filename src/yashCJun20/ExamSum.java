package yashCJun20;

public class ExamSum {
	
	void sum (String name) {
		
			int sum=0;
			for(int i=0;i<name.length();i++) {
				if(Character.isDigit((name.charAt(i)))) {
					String charValue = String.valueOf(name.charAt(i));
					int digit = Integer.parseInt(charValue);
					sum = sum + digit;
				}
			}
			System.out.println("Output: "+sum);	
		}
	
	public static void main(String[] args) {
		ExamSum examSum = new ExamSum();
		String s="1Hh9PR34QP";
		examSum.sum(s);
	}

}
