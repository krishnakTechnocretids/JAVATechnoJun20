/*
Assginment19:
 Program 1: Create a class to satisfy below requirements. 
                  a) Given number is prime or not. 
                  b) Print total count of prime numbers between 2->100.
                  c) Find sum of all prime numbers between 2->100
                  d) Find avg of prime numbers between 2->100

Program 2: Find first differ index from given arrays. 
                   i/p :- arr1: {10,2,9,14,3}
                            arr2: {10,2,18,14,3}
                   o/p:- Values are not matching at index -> 2
 
 
Program 3: Find all differ index from given arrays. 
                 i/p:- arr1: {10,2,9,14,3}
                        arr2: {10,2,18,14,13}
                o/p:- Values are not matching at index -> 2
                         Values are not matching at index -> 4
		
Program 4: Find max value at differed index.
              i/p:- arr1: {10,2,9,14,3}
                     arr2: {10,2,18,14,3}
              o/p :- Values are not matching at index -> 2, From (9,18) max value is 18
		
Program 5: Find all differ index from given arrays.
               i/p:- arr1: {"Maulik", "Harsh", "Krishna", "Technocredits"}
                       arr2: {"Maulik","Harsh","Technocredits","Krishna"}		
               o/p:- Values are not matching at index -> 2, [arr1 value is Krishna, arr2 value is Technocredits] 
                        Values are not matching at index -> 3, [arr1 value is Technocredits, arr2 value is Krishna]*/
package kARAN1595;

import java.util.Scanner;

public class PrimeNumber {
	
	

	public boolean isPrime(int number) {
		boolean flag=true;
		if(number<=1)
		{
			flag=false;
			return flag;
		}
		for(int index=2;index<number;index++) {
			if(number %index==0) {
				flag= false;
                return flag;		
                }
		}
		return flag;
		
		
	}
	
	void countOfPrimeNumber()
	{
		
		int counter =0;
		int sumOfPrimeNumber = 0;
		 String  primeNumber = "";
		for(int outerIndex=2;outerIndex<=100;outerIndex++)
		{
			boolean flag=true;
			
			for(int innerIndex=(outerIndex)/2;innerIndex>=2;innerIndex--)
			{
				if(outerIndex%innerIndex==0)
				{
                     flag=false;
                     break;
				}
				
			}
			
			if(flag==true)
			{
				sumOfPrimeNumber += outerIndex;
				primeNumber  = primeNumber +outerIndex+" ";
		        counter++;
			}
			
		}
		System.out.println(primeNumber); 
		System.out.println("\nSum of all Prime Number : " + sumOfPrimeNumber);
		System.out.println("Average of Prime number:"+(sumOfPrimeNumber)/counter);
		System.out.println("Count of Prime Number:"+counter);
	}

	public static void main(String[] args) {
		
		PrimeNumber prime = new PrimeNumber();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter any no to know is it Prime/Not Prime:");
		int number = scan.nextInt();
		if(prime.isPrime(number))
		{
			System.out.println("No is Prime Number:"+number);
		}
		else {
			System.out.println("No is not Prime Number:"+number);
		}
		scan.close();
	
		
		prime.countOfPrimeNumber();
	}

}
