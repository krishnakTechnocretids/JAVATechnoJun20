/*
 2) Write a program which print first and last index of every characters only if character has multiple occurrence.

Input : technocredits
Output :
t -> first index = 0 Last index = 11
e -> first index = 1 Last index = 8
c -> first index = 2 Last index = 6
Hint : To find first index of character --> indexOf() method
            To find last index of character --> lastIndexOf() method.
 */
package shrutiDJun20;

public class FirstnLastIndex {
	
	void printFirstnLastIndex(String name){
		for(int index=0;index<name.length();index++){
			char ch = name.charAt(index);
			if(index==name.indexOf(ch)&& name.indexOf(ch)!= name.lastIndexOf(ch))
			//if(index==name.indexOf(ch))
				//	if(name.indexOf(ch)!= name.lastIndexOf(ch))
				System.out.println(ch + "-->"+ "First Index = " +name.indexOf(ch)+" Last Index = "+ name.lastIndexOf(ch));
	}
	}
	
	public static void main(String[] args) {
		FirstnLastIndex firstnLastIndex =new FirstnLastIndex();
		firstnLastIndex.printFirstnLastIndex("technocredit");
		
	}

}

