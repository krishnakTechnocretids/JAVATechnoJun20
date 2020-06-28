/*Program 2 : 
Create a new method to print middle character of all words.

Input = "Harsh Maulik";
Output : r is middle character in Harsh
              u is middle character in Maulik */

package swapnaWJun20;

public class MiddleChar {

	void findMiddleChar(String name)
	{
		String arrayInp []= name.split(" ");
		for(int index=0;index<arrayInp.length;index++)
		{
			char middleValue = arrayInp[index].charAt(((arrayInp[index].length()-1)/2));
			System.out.println(middleValue + " is middle character in " + arrayInp[index]);
		}
	}

	public static void main(String[] args) {
		String inp = "Harsh Maulik";
		
		MiddleChar middleChar = new MiddleChar();
		middleChar.findMiddleChar(inp);
	}
}
