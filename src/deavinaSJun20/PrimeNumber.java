package deavinaSJun20;

public class PrimeNumber {
	public static void main(String[] args) {
		new PrimeNumber().listofPrimenumbers(2, 100);
	}

	boolean isPrimeNumber(int number) {
		boolean flag = true;
		for (int index = 2; index < Math.sqrt(number); index++) {
			if (number % index == 0) {
				flag = false;
				return false;
			}
		}
		if (flag == true) {
			System.out.println(number + " is a prime number.");
			return true;
		} else {
			System.out.println(number + " is not a prime number.");
			return false;
		}
	}
	void listofPrimenumbers(int startIndex, int lastIndex) {
		// boolean flag1=false;
		int sum = 0;
		int count=0;
		for (int i = startIndex; i <= lastIndex; i++) {
			boolean flag1 = isPrimeNumber(i);
			if (flag1 == true) {
				sum = sum + i;
				count++;
			}
		}
System.out.println("The Sum of Prime numbers between 2 to 100 is " +sum);
System.out.println("The Total count of Prime numbers between 2 to 100 is " +count);
System.out.println("The Average of Prime numbers between 2 to 100 is "+(sum/count));
	}
}
