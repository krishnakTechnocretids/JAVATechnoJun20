package aadeshJun20;


public class MiddleCharacter {

	void displayMiddleCharacter(String[] str) {

		int midCharIndex=0;

		for(int index=0; index<str.length; index++) {
			if(str[index].length()%2==0)
				midCharIndex=(str[index].length())/2-1;
			else
				midCharIndex=(str[index].length())/2;
			System.out.println("Middle Character of String "+str[index]+":"+str[index].charAt(midCharIndex));

		}
	}
	public static void main(String[] args) {
		MiddleCharacter middleCharacter = new MiddleCharacter();
		String str ="Harsh Maulik";

		String [] strArray= str.split(" ");

		middleCharacter.displayMiddleCharacter(strArray);
	}
}	