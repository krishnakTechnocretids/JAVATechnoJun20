package swapnaWJun20;

public class ReverseString {

	void inpReverse(String input)
	{
		System.out.println("Input : "+input);
		
		System.out.print("Output : ");
		
		for(int index=input.length()-1;index>=0;index--)
		{
			System.out.print(input.charAt(index));
		}
	}

	public static void main(String[] args) {

		String input = "Hello this is technocredits";
		ReverseString reverseString = new ReverseString();
		reverseString.inpReverse(input);
	}
}
