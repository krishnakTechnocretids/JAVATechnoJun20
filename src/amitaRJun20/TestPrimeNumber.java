/*Program 1: Create a class to satisfy below requirements. 
                  a) Given number is prime or not. 
                  b) Print total count of prime numbers between 2->100.
                  c) Find sum of all prime numbers between 2->100
                  d) Find avg of prime numbers between 2->100 */
package amitaRJun20;

public class TestPrimeNumber {
	
	//Method to check if a number is prime number or not
	void isPrimeNumber(int num) {
		boolean flag = false;
		for(int index = 2; index<=Math.sqrt(num); index++) {
			if(num%index == 0) {
				flag = true;
				break;
			}	
		}
		if(flag == false)
			System.out.println(num+" is a Prime number");
		else
			System.out.println(num+" is not a prime number");
	}
	
	//Method to find count,sum and average of all prime number between 2 & 100
	void findAllPrimeNumbers(int startnum,int endnum) {
		
		int count = 0, sum = 0;
		double average = 0;		
		for(int index = startnum; index<=endnum; index++) {
			boolean flag = false;
			for(int i=2; i<=Math.sqrt(index); i++) {
				if(index%i == 0) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				count++;
				sum += index;
				average = sum/count;
			}	
		}
		System.out.println("Total Prime number between "+startnum+" & " +endnum+ " are "+count);
		System.out.println("Sum of all prime number between "+startnum+" & " +endnum+ " is "+sum);
		System.out.println("The average of all prime number between "+startnum+" & " +endnum+" is "+average);
	}

	public static void main(String[] args) {
		TestPrimeNumber primenumber=new TestPrimeNumber();
		int startnum=2;
		int endnum=100;
		primenumber.isPrimeNumber(121);
		primenumber.findAllPrimeNumbers(startnum, endnum);
	}
}
