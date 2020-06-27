package rajAJun20;

public class CountSpecialCharacter {
	void specialCharCount(String str) {
		
		String string = str;
		
		string = string.replace('[' , ' ');
		string = string.replace('{' , ' ');
		string = string.replace(']' , ' ');
		string = string.replace('}' , ' ');
		string = string.replace('_' , ' ');
		string = string.replace(',' , ' ');

		String[] strArray = string.split(" ");
		System.out.println("Given String is : " +str+ "\nCount of Special Characters is : " +(strArray.length - 1));
	}

	public static void main(String[] args) {
		
		CountSpecialCharacter specialCharCount = new CountSpecialCharacter();

		String string = "Kr[i{s]hn}_a,Tech";
		specialCharCount.specialCharCount(string);

	}
}	

