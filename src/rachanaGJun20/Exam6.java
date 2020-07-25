package rachanaGJun20;

public class Exam6 {

	void display(String str) {
		int index=0;
		while(str.length()>1 && index< str.length()) {
			System.out.println(str.substring(index,str.length()));
			index++;
		}
	}
	public static void main(String[] args) {
		String str = "Globant";
		 new Exam6().display(str);
}
}