package nikhilMJun20;

import java.util.Scanner;

public class PrimeNumbers {
	void isPrime(int num) {
		boolean flag = true;
		for(int div=2; div<=Math.sqrt(num); div++) {
			if(num % div == 0) {
				flag = false;
				break;
			}
		}
		if(flag == true)
			System.out.print(num+" is a Prime Number.");
		else
			System.out.println(num+" is NOT a Prime Number.");
	}
	
	void findPimNumbers() {
		boolean flag = true;
		int primeSum=0, primeCnt=0;
		System.out.println("\n\nPrime numbers within 2 to 100:-");
		for(int num=2; num<=100; num++) {
			flag = true;
			for(int div=2; div<=Math.sqrt(num); div++) {
				if(num % div == 0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.print(num+" ");
				primeCnt++;
				primeSum += num;
			}
		}
		System.out.println("\n\nCount of Prime numbers within 2 to 100 : "+primeCnt+"\nSum of Prime numbers within 2 to 100 : "+primeSum+"\nAverage of Prime numbers within 2 to 100 : "+(primeSum/primeCnt));
	}
		
	
	public static void main(String[] args) {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This program will find out if entered integer is Prime number or not.\nAlso, second part of this program will display all the prime numbers within a number range.\n\nPlease enter a number:");
		primeNumbers.isPrime(scanner.nextInt());
		
		primeNumbers.findPimNumbers();
	}
}
