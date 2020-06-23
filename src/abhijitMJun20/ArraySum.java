package abhijitMJun20;

import java.util.Scanner;

public class ArraySum {
	
	void add(int[] numbersum){
		int sum=0;
		for(int index=0;index<numbersum.length;index++){
			if(numbersum[index]%2==0) {
				sum=sum+numbersum[index];
			}
		}
		System.out.println("Sum of even number is :"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySum arraySum=new ArraySum();
		System.out.println("How many number you want");
		Scanner scanner= new Scanner(System.in);
		int number=scanner.nextInt();
    	int []num= new int[number];
    	System.out.println("Enter you number");
    	for(int index=0;index<num.length;index++){
    		num[index]= scanner.nextInt();	
    	}
    	arraySum.add(num);
    	scanner.close();
	}
}
