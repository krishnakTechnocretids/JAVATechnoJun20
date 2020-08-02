package archanaNJun20;

public class CodingExam10 {
	void printRotation(String input1, String input2) {
		int count = 0;
		while (!input1.equals(input2)) {
			char last = input1.charAt(input1.length() - 1);
			input1 = last + input1.substring(0, (input1.length() - 1));
			count++;
		}
		System.out.println("Iteration required :"+count);
	}
	public static void main(String[] args) {
		String input1 = "abcdef";
		String input2 = "defabc";
		new CodingExam10().printRotation(input1, input2);
	}
}