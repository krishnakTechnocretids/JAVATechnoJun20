package madhuraMJun20.scannerClass;
/*String input = "1Hh9PR34QP";
Hint : 1+9+3+4 [all digits]
output : 17
1) String can be converted to int but there is no direct method to convert char to int
2) char has to be coverted first to string and then to interger.*/
public class Exam2 {
	void sumOfDigits(String input) {
		int sum =0;
		for(int index=0;index<input.length() ;index++)
			if(Character.isDigit(input.charAt(index))){
				char ch = input.charAt(index);
				String num = String.valueOf(ch);
				int num1 = Integer.parseInt(num);
				
				sum = sum + num1;
			}
				
			System.out.println("Sum if digits is : " +sum);
	}
	
	public static void main(String[] args) {
		Exam2 exam2 = new Exam2();
		String input= "1Hh9PR34QP";
		exam2.sumOfDigits(input);
	}

}
