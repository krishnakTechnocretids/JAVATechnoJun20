package apurvaJun20;

public class StringReverse {
	
	void displayReverseString(String str) {
		
		System.out.println("Given String ;\n"+str+"\n\nReverse String :-");
		for(int index=str.length()-1; index>=0; index--)
			System.out.print(str.charAt(index));
	}
	public static void main(String[] args) {
		StringReverse stringReverse = new StringReverse();
		
		String str = "Hello this is technocredits";
		
		stringReverse.displayReverseString(str);
				
				
		
		
	}

}
