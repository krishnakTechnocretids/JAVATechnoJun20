package jagadeeshMJun20;

public class ReverseString {
	void displayString(String input) {
		System.out.print("Output : ");
		for(int index=(input.length()-1);index>=0;index--)
		System.out.print(input.charAt(index));	
		}
	public static void main(String[] agrs) {
		ReverseString reverseString = new ReverseString();
		String input = "Hello this is technocredits";
		System.out.println("Input : "+input);
		reverseString.displayString(input);
	}
}
