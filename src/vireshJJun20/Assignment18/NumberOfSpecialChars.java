package vireshJJun20.Assignment18;

public class NumberOfSpecialChars {

	static void checkSpecChar(String str){ // to remove special characters then observes the difference in string length.
		int ln1= str.length();
		String newStr= str.replace("_", "").replace("[","").replace("{","").replace("]","").replace("}","").replace(",","");
		System.out.println(newStr);
		int ln2= newStr.length();
		System.out.println("Total special characters are: " + (ln1-ln2));
	}
	
	public static void main(String[] args) {
		
		String str= "Kr[i{s]hn}_a,Tech";
		
		NumberOfSpecialChars.checkSpecChar(str);
	}
}
