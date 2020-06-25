package archanaNJun20;

public class IndexOfExample1 {

	void countStringChar(String input)
	{
		int digitCount=0;
		int uCount=0;
		int lCount=0;
		int loCount=0;
		int spCount=0;

		for(int index=0;index<input.length();index++){
			char ch=input.charAt(index);
			if(Character.isDigit(ch)) 
				digitCount++;
			else  if(Character.isLetter(ch)) {
				lCount++;
				if(Character.isUpperCase(ch)) 
					uCount++;
				if(Character.isLowerCase(ch))
					loCount++;
			}
			else{
				spCount++;
			}
		}
		System.out.println("Total digit "+digitCount);
		System.out.println("Total Letter "+lCount);
		System.out.println("Total Uppercase  "+uCount);
		System.out.println("Total lowercase "+loCount);
		System.out.println("Total Character "+spCount);
	}
	public static void main(String[] args) {
		IndexOfExample1 indexofexample= new IndexOfExample1();
		String input="1rRpd3F9#K(E";
		indexofexample.countStringChar(input);
	}
}
