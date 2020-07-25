package jagadeeshMJun20;

public class CodeExam5 {
 void displayOutput(String input) {
	 for(int len=input.length();len>0;len--) {
		 System.out.println(input.substring(0,len));
	 }
 }
	public static void main(String[] args) {
		new CodeExam5().displayOutput("Globant");
	}
}
