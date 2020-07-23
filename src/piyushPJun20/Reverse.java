
public class Reverse {
	void display(String input) {
		System.out.print("Output : ");
		for(int index=(input.length()-1);index>=0;index--)
		System.out.print(input.charAt(index));	
		}
	public static void main(String[] agrs) {
		Reverse reverse = new Reverse();
		String input = "Hello this is technocredits";
		System.out.println("Input : "+input);
		reverse.display(input);
	}
}



	
