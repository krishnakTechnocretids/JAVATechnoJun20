package deavinaSJun20;

public class MiddlecharClass {
	public static void main(String[] args) {
		String input = "Maulik Harsh";
		String[] Arr = input.split(" ");
		new MiddlecharClass().middleCharInStringArr(Arr);
	}
	void middlecharinString(String name) {
		int length = name.length();
		for (int i = 0; i < length; i++) {
			if (i == (length - 1) / 2) {
				char ch = name.charAt(i);
				System.out.println(ch + " is the middle character of " + name);
			}
		}

	}
	void middleCharInStringArr(String Arr[]) {
		for (int i = 0; i < Arr.length; i++) {
			middlecharinString(Arr[i]);
		}
	}
}
