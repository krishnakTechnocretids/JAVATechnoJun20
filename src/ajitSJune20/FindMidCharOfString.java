package ajitSJune20;

public class FindMidCharOfString {
	
	void displayMiddleChar(String str) {
		String[] input=str.split(" ");
		int midCharIndex = 0;
		for(int index=0; index<input.length; index++) {
			if(input[index].length()%2 == 0)
				midCharIndex = (input[index].length())/2 - 1;
			else
				midCharIndex = (input[index].length())/2;
			
			System.out.println(input[index].charAt(midCharIndex)+" is middle chracter in "+input[index]);
		}
	}
	
	public static void main(String[] args) {
		FindMidCharOfString findMidCharOfString=new FindMidCharOfString();
		
		String str="Harsh Maulik";
		findMidCharOfString.displayMiddleChar(str);
		
	}
	
}
