package yashCJun20;

import java.util.Scanner;

public class FreqOfChar {
	
	void findFrq(String[] name, char ch){
		
	
		int count = 0;
		for (int i=0;i<name.length;i++) {
			count = 0;
		for(int index=0;index<name[i].length();index++) {
			if(name[i].charAt(index) == ch)
				count++;
		}
		System.out.println(name[i]+" -----> "+count);
		}
		
	}
	public static void main(String[] args) {
		
		int size=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many names you want to pass?");
		size=scanner.nextInt();
		String[] name = new String[size];
		for (int i=0;i<size;i++) {
			System.out.println("Please enter the names");
			name [i]=scanner.next();
		
	}
		System.out.println("Please enter the character : ");
		char c= scanner.next().charAt(0);
		FreqOfChar freqOfChar=new FreqOfChar();
		freqOfChar.findFrq(name,c);


		scanner.close();
		

}
}



