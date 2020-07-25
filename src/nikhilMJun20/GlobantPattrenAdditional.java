package nikhilMJun20;

public class GlobantPattrenAdditional {
	void printPattren(String str) {
		for(int index=0; index < str.length(); index++) {
			String temp = str.substring(index, str.length());
			temp = temp.replace((temp.charAt(0)), Character.toUpperCase(temp.charAt(0)));
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {
		String str = "Globant";
		new GlobantPattrenAdditional().printPattren(str);
	}
}
