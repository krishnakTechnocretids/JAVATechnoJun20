package deavinaSJun20;

public class CountSpecialChar {
	static int count = 0;

	public static void main(String[] args) {
		String name = " Kr[i{s]hn}_a,Tech";
		System.out.println("total special characters are " + new CountSpecialChar().countSpecialChar(name));
	}

	int countSpecialChar(String name) {
		name.replace('{', ' ');
		count++;
		name.replace('[', ' ');
		count++;
		name.replace(']', ' ');
		count++;
		name.replace('_', ' ');
		count++;
		name.replace(',', ' ');
		count++;
		name.replace('}', ' ');
		count++;
		return count;
	}
}
