/*Create a class to satisfy below requirements.
a) Given number is prime or not.
b) Print total count of prime numbers between 2->100.
c) Find sum of all prime numbers between 2->100
d) Find avg of prime numbers between 2->100
*/

package nikhilMJun20;

public class PrimeNumbers {
	int primeSum, primeCnt;
	
	void isPrime(int num) {
		boolean flag = true;
		for(int div=2; div<=Math.sqrt(num); div++) {
			if(num % div == 0) {
				flag = false;
				break;
			}
		}
		if(flag == true) {
			System.out.println(+num+" is a Prime Number.");
			primeCnt++;
			primeSum += num;
		}
	}
	
	void findPimeNumbers(int startNum, int endNum) {
		primeSum=0; 
		primeCnt=0;
		for(int num=startNum; num<=endNum; num++) {
			isPrime(num);
		}
		System.out.println("\nCount of Prime numbers within 2 to 100 : "+primeCnt+"\nSum of Prime numbers within 2 to 100 : "+primeSum+"\nAverage of Prime numbers within 2 to 100 : "+(primeSum/primeCnt));
	}		
	
	public static void main(String[] args) {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		int num = 13, startNum=2, endNum=100;
		
		System.out.println("This program will find out if entered integer is Prime number or not.\nAlso, second part of this program will display all the prime numbers within a number range.\n");
				
		primeNumbers.isPrime(num);
		
		System.out.println("\n\nPrime numbers within "+startNum+" to "+endNum+":-");
		primeNumbers.findPimeNumbers(startNum, endNum);
	}
}
