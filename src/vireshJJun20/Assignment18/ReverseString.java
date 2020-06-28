package vireshJJun20.Assignment18;

public class ReverseString {

	static void revString(String str) { // starting from the last index of a string and print each character till first index 
		
		for(int i=str.length()-1;i>=0;i--)
		{
		System.out.print(str.charAt(i)); 
		}
	}
	public static void main(String[] args) {
		//ReverseString.revString("Hello");
		ReverseString.revString("Hello this is technocredits");
	}
}