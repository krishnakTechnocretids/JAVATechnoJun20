package swapnaWJun20;

public class CountVariations {

	void checkInput(String name)
	{
		int dCount = 0;
		int uCount = 0;
		int lCount = 0;
		int specialCount = 0;

		System.out.println("Input: " + name);

		for(int index=0;index<name.length();index++)
		{
			char ch = name.charAt(index); 

			if(Character.isDigit(ch)) 
				dCount++;
			else if(Character.isLowerCase(ch)) 
				lCount++;
			else if(Character.isUpperCase(ch))
				uCount++;
			else
				specialCount++;
		}

		System.out.println("\nTotal Digits: "+ dCount +
				"\nTotal Letters: " + (uCount+lCount)+
				"\nTotal Uppercase: " + uCount+
				"\nTotal Lowercase: " +lCount +
				"\nTotal Special char: "+specialCount);
	}

	public static void main(String[] args) {

		String input ="1rRpd3F9#K(E";

		CountVariations countVariations = new CountVariations();
		countVariations.checkInput(input);
	}
}
