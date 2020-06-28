package vaishnaviVJun20_arrayExamples;

public class Reverse {
	
	void printReverse(String s) {
		String name="";
		for(int index=s.length()-1;index>=0;index--) {
			name = String.valueOf(s.charAt(index));
			System.out.print(name);
		}		
	}	

	public static void main(String[] args) {
		Reverse reverse = new Reverse();
        String input = "Hello this is technocredits";
        reverse.printReverse(input);
	}

}
