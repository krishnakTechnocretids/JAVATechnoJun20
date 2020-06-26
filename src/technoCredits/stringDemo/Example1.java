package technoCredits.stringDemo;

public class Example1 {

	static void printCharFreq(String name) {
		for(int j=0;j<name.length();j++) {
			char ch = name.charAt(j);
			int count = 0;
			if(j == name.indexOf(ch)) {
				for(int i=0;i<name.length();i++) {
					if(ch == name.charAt(i)) {
						count++;
					}
				}
				System.out.println(ch + ":" + count);
			}
		}
	}
	
	public static void main(String[] args) {
		String name = "technocredits"; // 1rRpd3F9#K(E
		//Example1.printCharFreq(name);
		System.out.println(Character.isDigit('9'));
		System.out.println(Character.isLetter('p'));
		System.out.println(Character.isUpperCase('p'));
		System.out.println(Character.isLowerCase('P'));
	}
}
