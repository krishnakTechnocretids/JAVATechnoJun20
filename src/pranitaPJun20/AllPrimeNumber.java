/*Assignment 19 : 27th Jun'2020

Program 1: Create a class to satisfy below requirements. 
                  a) Given number is prime or not. 
                  b) Print total count of prime numbers between 2->100.
                  c) Find sum of all prime numbers between 2->100
                  d) Find avg of prime numbers between 2->100
*/

package pranitaPJun20;

public class AllPrimeNumber {
//Method to check Given number is prime or not. 
	void checkPrime(int num) {
		boolean flag=true;
		for(int index=2;index<=num/2;num++) {
			if(num%index==0) {
				System.out.println("Given number "+num+" is not prime");
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Given number "+num+" is prime");
	
		}	
	}
	
//Method to check Count,Sum and average of all prime numbers in range
	boolean checkPrimeNumbRange(int num) {
		boolean flag=true;
		for(int index=2;index<=num/2;index++) {
			if(num%index==0) {
				flag=false;
				break;
				
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		AllPrimeNumber allPrimeNumber = new AllPrimeNumber();
		int num =15;
		allPrimeNumber.checkPrime(num);
		int sum=0;
		int count=0;
		for(int num1=2;num1<=100;num1++) {
			boolean flag = allPrimeNumber.checkPrimeNumbRange(num1);
			if(flag==true) {
				System.out.print(num1+" ");
				count++;
				sum=sum+num1;
			}
			
		}
		System.out.println("\nTotal prime numbers in range 2 to 100 are: "+count);
		System.out.println("\nSum of  prime numbers in range 2 to 100 is: "+sum);
		System.out.println("\nAverage of prime numbers in range 2 to 100 is " +(sum/count));
		
		
	}

}
