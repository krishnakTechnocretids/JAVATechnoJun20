package rachanaGJun20;

public class Exam6 {

	void display(String str) {
		String temp;
		int index=0;
		
		while(str.length()>1 && index< str.length()) {
			temp = str.substring(index,str.length());
			temp = temp.replace(String.valueOf(temp.charAt(0)), String.valueOf(temp.charAt(0)).toUpperCase());
			System.out.println(temp);
			index++;
		}
	}
	public static void main(String[] args) {
		String str = "Globant";
		 new Exam6().display(str);
}
}