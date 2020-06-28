package abhishekSJun20;

public class CodingExam2 {
	void sumOfAlldigit(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch) == true)
				sum += Integer.parseInt(String.valueOf(ch));

		}
		System.out.println("Sum of Digit is " + sum);
	}

	public static void main(String[] args) {
		String str = "1Hh9PR34QP";
		CodingExam2 codingExam2 = new CodingExam2();
		codingExam2.sumOfAlldigit(str);

	}
}
