package rachanaGJun20;

public class Exam5 {

	void display(String str) {
		while(str.length()!=0) {
			System.out.println(str);
			str = str.substring(0,str.length()-1);
		}
	}
	public static void main(String[] args) {
		String str = "Globant";
		 new Exam5().display(str);
		
	
	}

}
