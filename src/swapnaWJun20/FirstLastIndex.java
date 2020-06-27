package swapnaWJun20;

public class FirstLastIndex {

	void findIndex(String input)
	{
		System.out.println("Input : "+input);
		char ch =' ';

		for(int index=0;index<input.length();index++)
		{
			ch = input.charAt(index);

			if(index == input.indexOf(ch) && input.indexOf(ch) < input.lastIndexOf(ch)) 
			{
				System.out.println(ch + " -> first Index = " + input.indexOf(ch) +" Last Index = "+input.lastIndexOf(ch));
			}
		}
	}

	public static void main(String[] args) {
		String input ="technocredits";
		FirstLastIndex firstLastIndex = new FirstLastIndex();
		firstLastIndex.findIndex(input);

	}
}
