package vireshJJun20.CodingExam2;

public class SumOfNumbersString {
	
	static void operation(String str) {
		
		//int length= str.length();
		int num=0;
		int sum=0;
		for (int i= 0; i < str.length(); i++) {
			char ch= str.charAt(i);
			
			if (Character.isDigit(ch)) {
				
				String st= String.valueOf(ch);
				num= Integer.parseInt(st);
				sum= sum+num;
			}
		}
		System.out.println("Addition is: " +sum);
	}

	public static void main(String[] args) {
		SumOfNumbersString.operation("1Hh9PR34QP");
	}
}
