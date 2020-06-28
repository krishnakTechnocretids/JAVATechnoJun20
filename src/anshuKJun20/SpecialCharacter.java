package anshuKJun20;
/*Program 3 : 
Count total special characters like _ , [ { ] } from every word, do not use any loop.
Hint : Use replace method [Think about it, how it can help].

Input :  Kr[i{s]hn}_a,Tech**/

public class SpecialCharacter {
  void findSpecialCharacter(String name){
	  String name1 =name;
	    name1 = name1.replace('[', ' ');
		name1 = name1.replace('{', ' ');
		name1 = name1.replace(']', ' ');
		name1 = name1.replace('}', ' ');
		name1 = name1.replace('_', ' ');
		name1 = name1.replace(',', ' ');
	
	  String[] arr = name1.split(" ");
	  
	  System.out.println("Given String "+name+ " have "+((arr.length)-1)+" special character");
	  
  }
  public static void main(String[] args) {
	  SpecialCharacter specialchar = new SpecialCharacter();
	  String input  = "Kr[i{s]hn}_a,Tech";
	   specialchar .findSpecialCharacter(input);

 }
}
