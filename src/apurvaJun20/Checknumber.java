package apurvaJun20;

import java.util.Scanner;

public class Checknumber {
	void checkgivennumber(int[] input, int num) {
		 int count=0;
			for(int index=0;index<input.length;index++) {
				if(input[index]==num) {
					count++;
					}
			}
			
				System.out.println("Given number " + num + " is present in predefined array with frequency " +count );
			 
		    	
		}
		public static void main(String[] args) {
			Checknumber checknumber= new Checknumber();
			Scanner scanner= new Scanner(System.in);
			System.out.println("Enter how many number you want");
			int intnum= scanner.nextInt();
			int[] number= new int[intnum];
			System.out.println("Enter numbers");
			for(int index=0;index<number.length;index++)
			  {
				number[index]=scanner.nextInt();
			  }
			System.out.println("Enter number which you want search");
			  int serchno=scanner.nextInt();
			  checknumber.checkgivennumber(number,serchno);
			  scanner.close();
			  int[] num= {2,3,8,6,3,4};
			  int a=3;
			  checknumber.checkgivennumber(number, a);

		}

}
