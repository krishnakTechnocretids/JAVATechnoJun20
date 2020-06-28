/*Program 1: Create a class to satisfy below requirements. 
                  a) Given number is prime or not. 
                  b) Print total count of prime numbers between 2->100.
                  c) Find sum of all prime numbers between 2->100
                  d) Find avg of prime numbers between 2->100*/

package ajitSJune20;

public class OperationOnPrimeNum {
	
	//Check whether Given number is Prime or not
	boolean isPrime(int number) { 
		boolean flag = true;
		
		for (int index = 2; index <= Math.sqrt(number); index++) {
			if ((number % index == 0)) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			return true;
		} else {
			return false;
		}
	}
	
	//Calculate Sum and Average of All prime number and total Prime numbers Count between  2 --> 200
	void opsOnPrimeNum(int start, int end) {
		int count=0, sum=0;
		for (int index = start; index <= end; index++) {
			boolean flag = isPrime(index);
			if (flag == true) {
				count++;
				sum= sum+index;
			}
		}
		System.out.println("\nTotal count of prime numbers between 2->100 are: " + count);
		System.out.println("Sum of all prime numbers between 2->100 is: " + sum);
		System.out.println("Average of all " + count + " prime numbers between 2->100 is " + sum/count);
	}

	public static void main(String[] args) {
		
		OperationOnPrimeNum operationOnPrimeNum=new OperationOnPrimeNum();
		
		int[] array= {9, 13};
		for (int index=0; index<array.length;index++) { 
			int number= array[index];

			boolean resultIsPrime= operationOnPrimeNum.isPrime(number);
			if (resultIsPrime)
				System.out.println(number + " is a Prime Number.");
			else
				System.out.println(number + " is not a Prime Number.");
		}
		operationOnPrimeNum.opsOnPrimeNum(2,100);
		

	}

}
