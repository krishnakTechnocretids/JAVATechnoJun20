package harshadBJun20;

/*2) Create a class with following functionality. [Estimated time: 35 mins]
a) Find one character frequency from given name.
     Input: name - technocredits
               character - e
     Output : e -> 2 time in technocredits

b) Find all character frequency from given name.
     Input: name - aakanksha
     Output : a -> 4
	           a -> 4
                   k -> 2
                   a -> 4
                   n -> 1
                   k -> 2
                   s -> 1
                   h -> 1
                   a -> 4
c) Find all character frequency from each name given in String array.
     Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
     Output : r -> 1 time in raj
                   a -> 1 time in raj
                   j -> 1 time in raj
         =====================
		   a -> 3 time in aarya
		   a -> 3 time in aarya
		   r -> 1 time in aarya
                   y -> 1 time in aarya
                   a -> 3 time in aarya	
         ====================
          And so on....		 */

import java.util.Scanner;
		  
public class ReturnCharFrequency{

	void findOneCharFreqName(String str1, char ch){
		//String str="technocredits";
		//char oneCh;
		int freqCount=0;
		for(int index=0;index<str1.length();index++){
			if(str1.charAt(index)==ch)
			{
				freqCount++;
			}
		}

		System.out.println(ch+" ---> "+freqCount);

	}	

	void findAllCharFreqName(String str2){
		for(int index=0;index<str2.length();index++){
			findOneCharFreqName(str2, str2.charAt(index));	
		}	
	}	

	void findAllCharFreqNameString(String str2){
		for(int index=0;index<str2.length();index++){
			findOneCharFreqName(str2, str2.charAt(index));
			System.out.print(" time in "+str2);;
			System.out.println();
		}
	}	

	void findAllCharFreqNameInStringArray(String[] str3){
		for(int index=0;index<str3.length;index++){
			System.out.println();
			findAllCharFreqNameString(str3[index]);	
			System.out.println("=====================");
		}			
	}	

	public static void main(String args[]){
		ReturnCharFrequency returnCharFrequency = new ReturnCharFrequency();

		Scanner sc = new Scanner(System.in);
		int menuOption;
		String yesOrNo="";
		do{
			System.out.println("---------------------------Frequency of character in String Menu--------------------------------");
			System.out.println("1.Find one character frequency from given name.");
			System.out.println("2.Find all character frequency from given name.");
			System.out.println("3.Find all character frequency from each name given in String array.");
			System.out.println();
			System.out.println("Enter number from 1-3 for above Menu option you want to perform: ");
			menuOption = sc.nextInt();

			switch(menuOption){
			case 1:
				String name1;
				char oneCh;
				//Scanner sc=new Scanner(System.in);
				System.out.println("Enter a String: ");
				name1=sc.next();
				System.out.println("Enter a character to check its frequency: ");
				oneCh=sc.next().charAt(0);
				returnCharFrequency.findOneCharFreqName(name1,oneCh);
				break;

			case 2:
				String name2;
				System.out.println("Enter a String: ");
				name2=sc.next();
				returnCharFrequency.findAllCharFreqName(name2);
				break;

			case 3:
				int size=0;
				System.out.println("Enter how many names you want to store in array: ");
				size = sc.nextInt();
				String[] names = new String[size];

				for(int index=0;index<size;index++){
					System.out.println("Enter Name "+(index+1)+ ": ");
					names[index]=sc.next();
				}
				returnCharFrequency.findAllCharFreqNameInStringArray(names);

				break;

			default:
				System.out.println("Invalid menu option entered");

			}

			System.out.println("Do you want to continue (Yes/No)?: ");
			yesOrNo=sc.next();			
		}while(yesOrNo.equals("Yes") || yesOrNo.equals("yes"));

		sc.close();
	}

}