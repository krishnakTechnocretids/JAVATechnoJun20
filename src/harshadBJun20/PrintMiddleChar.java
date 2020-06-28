package harshadBJun20;
/*Program 2 : 
Create a new method to print middle character of all words.

Input = "Harsh Maulik";
Output : r is middle character in Harsh
              u is middle character in Maulik */
public class PrintMiddleChar {
	
	void printMiddleCharOfWords(String str) {
		String[] str1= str.split(" "); 
		int mid=0;
		for(int index=0;index<str1.length;index++) {
			if(str1[index].length()%2==0) 
				mid= ((str1[index].length()/2)-1);
			else
			mid= (str1[index].length()/2);
			char ch=str1[index].charAt(mid);
			System.out.println(ch+" is middle character in " +str1[index]);
		}		
	}
	
	public static void main(String[] args) {
		PrintMiddleChar printMiddleChar = new PrintMiddleChar();
		String names="Harsh Maulik";
		printMiddleChar.printMiddleCharOfWords(names);
	}
}
