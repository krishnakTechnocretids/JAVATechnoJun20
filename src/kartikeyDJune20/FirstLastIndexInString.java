package kartikeyDJune20;

public class FirstLastIndexInString {
	
	static void firstLastIndexInString(String input) {
		
		for(int index=0;index< input.length();index++) {
			int firstIndex=0;
			int lastIndex=0;
			char ch=input.charAt(index);
			firstIndex=input.indexOf(ch);
			lastIndex=input.lastIndexOf(ch);
			if(firstIndex!=index && lastIndex!=0)
				System.out.println(ch+ "--> first index="+firstIndex+" last index="+lastIndex);
			
		}
		
	}
	public static void main(String[] args) {
		FirstLastIndexInString.firstLastIndexInString("technocredits");
		
	}

}
