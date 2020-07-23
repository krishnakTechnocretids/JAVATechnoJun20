package technoCredits;

public class ArrayToString {

	public static void main(String[] args) {
		String[] arr = {"Hi","Hello"};
		String output = "";
		for(int index = 0; index<arr.length;index++) {
			output += arr[index] + " ";
		}
		output = output.trim();
	}
}
