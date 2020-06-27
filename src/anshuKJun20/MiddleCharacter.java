package anshuKJun20;
/*Create a new method to print middle character of all words.

Input = "Harsh Maulik";
Output : r is middle character in Harsh
              u is middle character in Maulik */
 
public class MiddleCharacter {
	void findMiddleCharacter(String input) {
		int  middlechar;
		char ch;
		String[] name = input.split(" ");
		for(int i = 0;i<name.length;i++) {
		  if(name[i].length() %2 ==0) {
			  middlechar = (name[i].length())/2 -1;
			   ch = name[i].charAt(middlechar);
		  }else {
			  middlechar = (name[i].length())/2;
		     ch = name[i].charAt(middlechar);
		  }
		  System.out.println("Middle character in "+name[i]+"--->"+ch);
		} 
		
	}
	public static void main(String[] args) {
		MiddleCharacter findmiddlechar = new MiddleCharacter();
		String name  ="Harsh Maulik";
		findmiddlechar.findMiddleCharacter(name);
	}
}
