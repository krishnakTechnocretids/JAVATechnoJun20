/*
Create a new method to print middle character of all words.

Input = "Harsh Maulik";
Output : r is middle character in Harsh
              u is middle character in Maulik 
 
*/

package aditiGJUN20;

public class ExtractMiddleChar {
	
	// Method to find middle character of String.
//	void getMidCharOfString(String[] array) {
//		for(int i=0;i<array.length;i++) {
//			String name=array[i];
//			if(name.length()%2 ==0)
//				System.out.println(String.valueOf(name.charAt((name.length()/2)-1))+" is middle character in "+name);
//			else
//				System.out.println(String.valueOf(name.charAt((name.length()/2)))+" is middle character in "+name);			
//		}
//	}
	
	//Optimize solution..
	void getMidCharOfString(String[] array) {
		for(int i=0;i<array.length;i++) {
			String name=array[i];
			System.out.println(String.valueOf(name.charAt
					((name.length()-1)/2))+" is middle cha racter in "+name);				
		}
	}
		
	public static void main(String[] args) {
		ExtractMiddleChar extractMiddleChar=new ExtractMiddleChar();
		
		String input="Harsh Maulik";
		String[] inputArray=input.split(" ");
		extractMiddleChar.getMidCharOfString(inputArray);
	}
}
