package barkhaPJun20;

public class ReverseString {
	
	void printStringInReverse(String name) {
		System.out.println("Reverse of given String "+name+" is:");
		for (int index=(name.length()-1); index>=0; index-- ) {
			char ch=name.charAt(index);
			System.out.print(ch);
		}		
	}	
	public static void main(String[] args) {
		ReverseString reverse=new ReverseString();
		String name="Hello this is TechnoCredits";
		
		reverse.printStringInReverse(name);
	}	
}	
	

		
		
		
	
	
	
