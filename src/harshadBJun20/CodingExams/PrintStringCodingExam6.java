package harshadBJun20.CodingExams;

public class PrintStringCodingExam6 {

	void display(String str){
		for(int index=str.length();index>0;index--)
		{
			
			System.out.println(str.substring((str.length())-index,str.length()));
		}
	}
	
	void display1(String str){
		String str2="",str1="";
		for(int index=0;index<str.length();index++)
		{
			str1 = str.substring(index);
			str2 = str1.substring(0,1).toUpperCase();
			System.out.println(str2+str1.substring(1, str1.length()));
		}
	}
	public static void main(String[] args) {
		String input="Globant";
		//new PrintStringCodingExam6().display(input);
		new PrintStringCodingExam6().display1(input);
	}
}
