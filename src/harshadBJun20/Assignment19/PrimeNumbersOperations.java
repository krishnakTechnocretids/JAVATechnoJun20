package harshadBJun20.Assignment19;
/*Assignment 19 : 27th Jun'2020

Program 1: Create a class to satisfy below requirements. 
                  a) Given number is prime or not. 
                  b) Print total count of prime numbers between 2->100.
                  c) Find sum of all prime numbers between 2->100
                  d) Find avg of prime numbers between 2->100*/

public class PrimeNumbersOperations {
	
	boolean CheckIsPrimeNumber(int number) {
		boolean flag=true;	
		for(int index=2;index<=Math.sqrt(number);index++) {
			if(number % index == 0) {
				flag=false;
				break;
			}
		}	
		return flag;
	}
	
	void findPrimeNumbers(int num) {
		boolean flag;
		flag = CheckIsPrimeNumber(num);
		if(flag==true)
			System.out.println(num+" is a Prime Number.");
		else 
			System.out.println(num+" is not a Prime Number.");
	}
		
	void printTotalCountSumAndAvgOfPrimeNumbers(int num1, int lastNum) {
		int primeNumCount=0,sumOfPrimeNumbers=0;
		boolean flag=false;
		System.out.println("Prime numbers between "+num1+" -> "+lastNum+": ");
		for(int i=num1;i<lastNum;i++) {
			flag=CheckIsPrimeNumber(i);
			if(flag==true) {
				System.out.print(i+" ");
				primeNumCount++;
				sumOfPrimeNumbers+=i;
			}
		}
		System.out.println();
		System.out.println("Total count of prime numbers between "+num1+" -> "+lastNum+" is: "+primeNumCount);
		System.out.println("The sum of prime numbers between "+num1+" -> "+lastNum+" is: "+sumOfPrimeNumbers);
		System.out.println("The average of prime numbers between "+num1+" -> "+lastNum+" is: "+(sumOfPrimeNumbers/primeNumCount));
	}
	
	public static void main(String[] args) {
		PrimeNumbersOperations primeNumbersOperations = new PrimeNumbersOperations();
		primeNumbersOperations.findPrimeNumbers(3);
		primeNumbersOperations.findPrimeNumbers(10);
		primeNumbersOperations.printTotalCountSumAndAvgOfPrimeNumbers(2, 100);
	}
}
