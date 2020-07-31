package shrutiDJun20Assignments;

public class MeetingRoomFlag {
	void sumOfDigit(String string) {
		int sum = 0;
		for (int index = 0; index < string.length(); index++) {
			char ch = string.charAt(index);
			if (ch >= 48 && ch <= 57) {
				sum = sum + Integer.parseInt(String.valueOf(string.charAt(index)));
			}
		}
		System.out.println("Given String is : " + string);
		System.out.println("Sum of Digits in string : " + sum);
	}
	
	public static void main(String[] args) {
		MeetingRoomFlag m = new MeetingRoomFlag();
		
		m.sumOfDigit("J7u9y8h1h8j4b7j3j6");
	}
}
