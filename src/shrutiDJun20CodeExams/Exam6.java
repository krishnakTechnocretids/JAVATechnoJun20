
package shrutiDJun20CodeExams;

public class Exam6 {
void stringOperation(String input){
		String temp = input;
		for(int index=0; index<input.length(); index++){				
			temp = input.substring(index, input.length());
			temp = temp.replace(temp.charAt(0), temp.toUpperCase().charAt(0));
			System.out.println(temp);
		}
	}
	public static void main(String[] args) {
		Exam6 exam6 = new Exam6();
		exam6.stringOperation("Globant");
}
}