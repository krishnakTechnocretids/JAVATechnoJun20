package technoCredits.throwthrows;

public class Student {
	int rno;
	public static void main(String[] args) {
		String s = "Globant";
		while(s.length()>0) {
			System.out.println(s);
			int index = s.length()-1;
			s = s.substring(0,s.length()-1);
		}
	}
}
