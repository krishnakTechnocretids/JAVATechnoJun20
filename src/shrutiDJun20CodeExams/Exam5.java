/*String input = "Globant";
output : Globant
         Globan
		 Globa
		 Glob
		 Glo
		 Gl
		 G*/
package shrutiDJun20CodeExams;

public class Exam5 {

	void stringOperation(String input){
		
		for(int index=0; index<input.length(); index++){
		//	for(int innerindex=0; innerindex<(input.length()-1);innerindex++){
			System.out.println(input.substring(0, input.length()-index));
		//	}
			
		}

	}
	
	public static void main(String[] args) {
		Exam5 exam5 = new Exam5();
		exam5.stringOperation("Globant");
		
	}
}
