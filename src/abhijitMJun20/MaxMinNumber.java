package abhijitMJun20;
import java.util.Scanner;
public class MaxMinNumber {
	  
	void findmaxNum(int[] input) {
        int max=0;
		for(int index=0;index<input.length;index++){
			if(input[index]>max) {max=input[index];}
		}
		System.out.println("Maximam number is :" +max);
	}
	void findminNum(int[] input) {
		int min=input[0];
		for(int i=0;i<input.length;i++){
			if(input[i]<min) {min=input[i];}
		}
		System.out.println("Minimam number is :" +min);
	}
	
	public static void main(String[] args) {
	       Scanner scanner =new Scanner(System.in);
	       System.out.println("How many number you want :");
	    	int number=scanner.nextInt();
	    	int []num= new int[number];
	    	for(int index=0;index<num.length;index++)
	    	{
	    		System.out.println("Enter your " +(index+1)+" number");
	    		num[index]=scanner.nextInt();
	    	}
	    	MaxMinNumber maxminnumber= new MaxMinNumber();
	    	maxminnumber.findmaxNum(num);
	    	maxminnumber.findminNum(num);
	    	
	    	scanner.close();
	} 
}
