package harshadBJun20;

/*2) Write a program which print first and last index of every characters only if character has multiple occurrence.

Input : technocredits
Output :
t -> first index = 0 Last index = 11
e -> first index = 1 Last index = 8
c -> first index = 2 Last index = 6

Hint : To find first index of character --> indexOf() method
            To find last index of character --> lastIndexOf() method.*/
			
public class FirstLastIndex{

	void returnFirstIndex(String str){
		
		for(int index=0;index<str.length();index++){
			char ch = str.charAt(index);
			if(index == str.indexOf(ch) && index!=str.lastIndexOf(ch)){
				System.out.print(ch+" -> first index = "+index);
				//if(index == str.indexOf(ch)) {
					for(int j=0;j<str.length();j++){
						if(j==str.lastIndexOf(ch)){
							System.out.println(" last index = "+j);
						}
					}			
				//}
			}
				
		}
	}
	public static void main(String args[]){
		FirstLastIndex firstLastIndex = new FirstLastIndex();
		String name="technocredits";
		
		firstLastIndex.returnFirstIndex(name);
	}

}			
