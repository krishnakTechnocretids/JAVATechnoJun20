/*
Create a class to satisfy below requirements. 
	a) Given number is prime or not. 
	b) Print total count of prime numbers between 2->100.
    c) Find sum of all prime numbers between 2->100
    d) Find avg of prime numbers between 2->100
 */

package aditiGJUN20;

public class PrimeNumberOps {
	int primeNumAddition=0, primeCnt=0;
	
	// Method contains logic to number is prime or not
	boolean isPrime(int number) {
		boolean flag=true;	
		for(int index=2;index<=Math.sqrt(number);index++) {
			if(number % index == 0) {
				flag=false;
				break;
			}
		}	
		return flag;
	}
	
	// Using isPrime() Method, displaying number is prime or not
	void getPrimeNum(int num) {
		boolean flag=isPrime(num);
		if(flag==true)
			System.out.println(num+" is Prime Number.");
		else 
			System.out.println(num+" is not Prime Number.");
	}
	
	// Method to find prime numbers in given range.
	void arithmaticOpsOnPrimeNum() {
		boolean flag=false;
		System.out.println("\nPrime numbers within 2-100 range: ");
		for(int num=2;num<=100;num++) {
			flag=isPrime(num);// Method to check number is prie or not
			if(flag==true) {
				System.out.print(num+" ");
				primeCnt++;
				primeNumAddition+=num;
			}
		}
	}
	
	public static void main(String[] args) {
		PrimeNumberOps primeNumberOps= new PrimeNumberOps();
		int num1=53, num2=110;
		
		primeNumberOps.getPrimeNum(num1);// Number is prime or not
		primeNumberOps.getPrimeNum(num2);// Number is prime or not
		
		primeNumberOps.arithmaticOpsOnPrimeNum();// To find prime numbers between 2-100 
		System.out.println("\nTotal prime numbers in range (2-100) are: "+primeNumberOps.primeCnt
				+ "\nSum of all Prime numbers between (2-100) is: "+primeNumberOps.primeNumAddition+
				"\nAverage of Prime numbers between (2-100) is: "
				+(primeNumberOps.primeNumAddition/primeNumberOps.primeCnt));
	}
}
