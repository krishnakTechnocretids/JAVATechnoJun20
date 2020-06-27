package amitaRJun20;

public class CountSpecialCharacter {
	
	void specialCharCount() {
		
		String input="Kr[i{s]hn}_a,Tech";
		System.out.println("Input string is : "+input);		
		int charCount=0;
		charCount=input.length()-(input.replace("[","").replace("{","").replace("]","").replace("}","").replace("_","").replace(",","")).length();
		System.out.println("Total Special Characters are: "+charCount);			
	}
	public static void main(String[] args) {
		CountSpecialCharacter countchar=new CountSpecialCharacter();
		countchar.specialCharCount();
	}
}
