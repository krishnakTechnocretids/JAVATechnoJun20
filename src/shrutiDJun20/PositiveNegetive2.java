package shrutiDJun20;

import java.util.Arrays;
import java.util.Scanner;

public class PositiveNegetive2 {
	int countp=0;
	int countn=0;
	int sumofpositive = 0;
	int sumofnegetive = 0;
		
		void displayPositivenegetivecount2(int[] num){
			
			for(int index=0 ; index<num.length; index++){
				if(num[index]>0){
					countp++;
					sumofpositive = sumofpositive + num[index];
				}	
				if(num[index]<0){
					countn++;
					sumofnegetive = sumofnegetive + num[index];
				}	
			}
			System.out.println("Count of Positive Numbers: "+countp);
			System.out.println("Count of Negetive Numbers: "+countn);
		}
	int getdifference2(int[] num){
			int diff = 0;
			//System.out.println("Sum of positive " +sumofpositive );
			//System.out.println("Sum of negetive " +sumofnegetive );
			diff = sumofpositive+sumofnegetive;//got stuck on this line
			return diff;
		}
		
		
		public static void main(String[] args) {
			PositiveNegetive2 positiveNegetive2 = new PositiveNegetive2();
			Scanner scanner = new Scanner(System.in);
			System.out.println("How many inputs you would like to enter");
			int size=scanner.nextInt();
			int[] number = new int[size];
			
			for(int i=0; i<size; i++){
				System.out.println("Please enter input "+ (i+1));
				number[i] = scanner.nextInt();
			}
			System.out.println("Inputs provided by user " +Arrays.toString(number));
		//	positiveNegetive2.displayPositivenegetivecount(number);
			positiveNegetive2.displayPositivenegetivecount2(number);
			System.out.println("Difference of positive number sum and negative number sum " + positiveNegetive2.getdifference2(number));
			scanner.close();
		}
	}


