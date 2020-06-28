/*
 Create a new method to print middle character of all words.

Input = "Harsh Maulik";
Output : r is middle character in Harsh
              u is middle character in Maulik
 */
package shrutiDJun20;

public class FindMidChar {
	
	void findMidElement(String name){
		
		int l1 = 0;

		if (name.length()%2==0) {   //name is of even length//    length/2=ch //maulik
			l1=(((name.length())/2)-1);
		}
		else if(name.length()%2 !=0){   //name is of odd length//   length/2=ch //harsh
			l1=((name.length())/2);
		}
		System.out.println("Middle Char of " +name+ " is " +name.charAt(l1));		
		}
	
public static void main(String[] args) {
	FindMidChar findMidChar=new FindMidChar();
	findMidChar.findMidElement("maulik");
	findMidChar.findMidElement("harsh");
}
}
