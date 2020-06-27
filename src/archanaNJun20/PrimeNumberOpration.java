package archanaNJun20;

import java.util.Scanner;

public class PrimeNumberOpration {
	void primeOperation(){
		int count=0;
		int sum=0;
		System.out.println("Prime Numbers between 2->100 :");
		for(int index=2;index<=100;index++)	{
			boolean flag=isPrimeNumber(index);
			if(flag==true){ 
				count++;
				sum=sum+index;
			}
		}
		System.out.println("Total count of prime numbers between 2->100 : "+count);
		System.out.println("sum of all prime numbers between 2->100 : "+sum);
		System.out.println("Avg of prime number between 2->100 : "+(sum/count));
	}
	boolean isPrimeNumber(int num){
		boolean flag = true;
		for(int index = 2; index <= num/2; index++){
			if(num%index == 0){
				flag = false;
			}
		}
		if(flag == true) 
			return flag;
		else 			
			return flag;
	}
	public static void main(String[] args) {
		PrimeNumberOpration primeNumberOpration=new PrimeNumberOpration();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		if(primeNumberOpration.isPrimeNumber(num)==true)
			System.out.println("given number is Prime");
		else
			System.out.println("given number is not Prime");
		primeNumberOpration.primeOperation();
		sc.close();
	}
}

