package harshadBJun20.CodingExams;

public class PrintStringCodingExam6 {

	void display(String str){
		for(int index=str.length();index>0;index--)
		{
			
			System.out.println(str.substring((str.length())-index,str.length()));
		}
	}
	
	void display1(String str){
		for(int index=0;index<str.length();index++)
		{
			System.out.println(str.substring(index,str.length()));
		}
	}
	public static void main(String[] args) {
		String input="Globant";
		new PrintStringCodingExam6().display1(input);
		//new PrintStringCodingExam6().display1(input);
	}
}
