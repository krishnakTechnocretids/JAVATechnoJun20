package harshadBJun20.CodingExams;

/*String input = "Globant";
output : Globant
         Globan
		 Globa
		 Glob
		 Glo
		 Gl
		 G*/
		 
public class PrintStringCodingExamProgram1{
	void display(String str){
		for(int index=str.length();index>0;index--)
		{
			System.out.println(str.substring(0, index));
		}
	}
	
	public static void main(String args[]){
		String input= "Globant";
		new PrintStringCodingExamProgram1().display(input);
	}
}		 