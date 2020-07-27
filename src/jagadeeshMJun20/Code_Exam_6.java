package jagadeeshMJun20;

public class Code_Exam_6 {
	
	 void displayOutput(String input) {
		 int temp = 0;
		 char ch='0';
		 System.out.println(input);
			 for(int len=1;len<input.length();len++) {
				temp= input.charAt(len);
				temp = temp - 32;
				ch = (char)temp;
			 System.out.println(ch+input.substring(len+1));
			 
		 }
	 }
		public static void main(String[] args) {
			new Code_Exam_6().displayOutput("Globant");
		}
	

}
