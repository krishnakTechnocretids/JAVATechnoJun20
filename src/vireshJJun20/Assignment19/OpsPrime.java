package vireshJJun20.Assignment19;

public class OpsPrime { 

	int count;
	int sum;
	boolean findPrime(int num) { // check if the number is a prime or not. And returns boolean value to main containing integer arrays.
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if ((num % i == 0)) {
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

	void countPrime(int from, int to) { // calls findPrime() method and based on its returned value calculate and display total count of prime numbers between 2-100 : 25
		for (int i = from; i <= to; i++) {
			boolean flag = findPrime(i);
			if (flag == true) {
				count++;
				sum= sum+i;
			}
		}
		System.out.println("The total prime numbers in between 2- 100 are: " + count);
	}

	void sumPrime() { //displays sum of all prime numbers between 2-100 : 1060
		System.out.println("Sum of all prime numbers in between 2- 100 is: " + sum);
	}

	void avgPrime() { //calculate and displays the average of prime numbers between 2-100
	
		float avg= (float)sum/(float)count;
		System.out.println("Average of all " + count + " prime numbers in between 2- 100 is " + avg);
		
	}

	public static void main(String[] args) {
		OpsPrime opsPrime = new OpsPrime();
		int[] ar= {7, 9, 13};
		System.out.println("Given array: {7, 9, 13}");
		for (int i=0; i<ar.length;i++) { //  selecting a single array element and sending it to findPrime method to check if its a prime number or not. displays a message based on the return
			int num= ar[i];
			
			boolean fl= opsPrime.findPrime(num);
			
			//System.out.println("Number : " +num);
			if (fl== true)
				System.out.println(" - number " + num + " is a prime.");
			else
				System.out.println(" - number " + num + " is not a prime.");
		}
		opsPrime.countPrime(2, 100);
		opsPrime.sumPrime();
		opsPrime.avgPrime();
	}

}
