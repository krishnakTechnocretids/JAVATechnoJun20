package kARAN1595;

public class StringEquality {
	int getRotationCount(String input1, String input2) {
		int count = 0;
		if (input1.length() == input2.length()) {
			while (!input1.equals(input2)) {
				input1 = input1.charAt(input1.length() - 1) + input1.substring(0, input1.length() - 1);
				count++;
				System.out.println(input1);
			}
			System.out.println("total Count = "+count);
		} else
			System.out.println("String doesn't have same length");
		return count;
}

	public static void main(String[] args) {
		String input1 = "abcdef";
		String input2 = "defabc";
		System.out.println("Given strings:-\n"+input1+"\n"+input2);
		new StringEquality().getRotationCount(input1, input2);
	}
}
