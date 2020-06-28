/*Program 1: Create a class to satisfy below requirements. 
a) Given number is prime or not. 
b) Print total count of prime numbers between 2->100.
c) Find sum of all prime numbers between 2->100
d) Find avg of prime numbers between 2->100 */
package jagadeeshMJun20;

public class PrimeNumberOps {
	void findPrime() {
		int count=0;
		int sum=0;
		for(int num=2;num<100; num++) {
			boolean flag =false;	
				for(int index=2; index<11; index++) {
				if(num!=index && num%index == 0) 
					flag =true;
			}
				if(flag == false) {
				count++;
				sum =sum+num;
			System.out.println(num +" is prime number");
				}
		}
		System.out.println("Total count of prime numbers between 2->100 : "+count);
		System.out.println("Sum of all prime numbers between 2->100 : "+sum);
		System.out.println("Avg of prime numbers between 2->100 : "+(sum/count));
	}
public static void main(String[] agrs) {
	PrimeNumberOps primeNumberOps = new PrimeNumberOps();
	primeNumberOps.findPrime();
}
}
