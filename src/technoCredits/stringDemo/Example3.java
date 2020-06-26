package technoCredits.stringDemo;

public class Example3 {

	public static void main(String[] args) {
		String input1 = "";
		System.out.println(input1.length());
		String msg = "Hi Hello Hi    Hello";
		String[] input = msg.split(" ");
		System.out.println(input[0]);
		for(int index=0;index<input.length;index++) {
			System.out.println(input[index].length());
		}
	}
}
