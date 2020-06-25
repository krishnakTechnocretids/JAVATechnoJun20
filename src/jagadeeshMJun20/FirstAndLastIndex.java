package jagadeeshMJun20;

public class FirstAndLastIndex {
		void printCharFreq(String name) {
			for(int index=0; index<name.length(); index++) {
				char ch = name.charAt(index);//t
				int count = 0;
				if (index == name.indexOf(ch)) {
				     for(int i=0; i<name.length(); i++) {
					 if (ch == name.charAt(i)) 
						count++;
						 if (count>1) {
								int num = name.indexOf(ch);
								if (ch == name.charAt(i)) 
							 System.out.println(ch+ "  -->  first index = "+num+" and Last index  = "+ i); 
						 }
				     }
		          }
			}
	} 
	public static void main(String[] args) {
		FirstAndLastIndex firstAndLastIndex = new FirstAndLastIndex();
		String name = "technocredits";
		firstAndLastIndex.printCharFreq(name);
	}
}