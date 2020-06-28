package ajitSJune20;

public class CodingExam2 {
	
	 void displaySum(String str) {
		 int sum=0;
		 for(int index=0;index<str.length();index++) {
			 char ch=str.charAt(index);
			 if(Character.isDigit(ch)) {
				 sum += Integer.parseInt(str.valueOf(ch));
			 }
		 }
		 if(sum != 0)
			 System.out.println("Sum : "+sum);
		 else
		 System.out.println("No Digit available in given string : " +str);
	 }

	public static void main(String[] args) {
		CodingExam2 codingExam2=new CodingExam2();
		//String str="Ajit";
		String str="1Hh9PR34QP";
		codingExam2.displaySum(str);
		

	}

}
