package vireshJJun20.Assignment16;

import java.util.Scanner;

public class CheckNumberInArray {

	void isNumPresent(int[] ar, int num){
		int cnt=0;
		boolean check=false;
		for (int index= 0; index<ar.length; index++) {
			if(ar[index]==num){
				cnt++;
				check=true;
			}
		}
		if(check==true)
			System.out.println("Given number " + num + " is present in predefined array with frequency " + cnt );
		else 
			System.out.println("Given number " + num + " is not present in predefined array.");
	}
	
	public static void main(String[] args){
		CheckNumberInArray cn= new CheckNumberInArray();
		Scanner scanner= new Scanner(System.in);
		int[] Arr= {10,3,9,-99,81,3,-11};
		System.out.println("Predefined Array: {10,3,9,-99,81,3,-11}");
		boolean check=false;
		do {
		System.out.print("Enter a number to check: ");
		int num= scanner.nextInt();
		cn.isNumPresent(Arr, num);
		System.out.print("Do you want to check another number? y/n: ");
		String temp= scanner.next();
		if (temp.equals("y"))
			check= true;
		else if(temp.equals("n")) {
				check= false;
				System.out.println("Thank you");
				break;
			}
		}while(check= true);
	}
	
}
