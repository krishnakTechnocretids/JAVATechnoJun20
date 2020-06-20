package technoCredits;

public class SwitchEx2 {

	static void switchEx(char ch) {
		switch(ch) {
			case 'a':
			case 'A':
				System.out.println("This is " + ch);
				break;
			case 'b':
			case 'B':
				System.out.println("This is " + ch);
				break;
		}
	}
	
	static void switchEx1(int number) {
		int x = 5;
		switch(10+10) {
		case 10:
			System.out.println(number);
			break;
		case 20:	
			System.out.println(number);
			break;
		}
	}
	
	public static void main(String[] args) {
		SwitchEx2.switchEx('B');
	}
}
