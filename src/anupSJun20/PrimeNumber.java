package anupSJun20;
/*Program 1: Create a class to satisfy below requirements. 
                  a) Given number is prime or not. 
                  b) Print total count of prime numbers between 2->100.
                  c) Find sum of all prime numbers between 2->100
                  d) Find avg of prime numbers between 2->100*/
public class PrimeNumber {
	static int findPrimeNumber(int num) {
		for(int index = 2;index<=Math.sqrt(num);index++) {
			if(num%index == 0) {
				return 0;
			}
		}
		return num;
	}
	static int totalCountOfPrimeNumbers(int startNum, int endNum) {
		int count = 0;
		for(int index = startNum;index<=endNum;index++) {
			if (findPrimeNumber(index) != 0)
				count++;
		}
		return count;
	}
	
	static int sumOfPrimeNumbers(int startNum, int endNum) {
		int sum = 0;
		for(int index = startNum;index<=endNum;index++) {
			if (findPrimeNumber(index) != 0)
				sum = sum + findPrimeNumber(index);
		}
		return sum;
	}
	static void findaverageofPrimeNumbers(int startNum, int endNum) {
		int avg = sumOfPrimeNumbers(startNum,endNum)/totalCountOfPrimeNumbers(startNum,endNum);
	    System.out.println("The average of prime numbers between "+ startNum + " & " + endNum+ " is : " + avg);
	}
	
	public static void main(String[] args) {
		int num = 21;
		if (findPrimeNumber(num) == 0) 
			System.out.println("The number is not a prime number " + num);
		else
			System.out.println("The number is a prime number " + num);	
		int startNum = 2;
		int endNum = 100;
		totalCountOfPrimeNumbers(startNum, endNum);
		System.out.println("The number of prime numbers between "+ startNum + " & " + endNum+ " is : " + totalCountOfPrimeNumbers(startNum, endNum));
		sumOfPrimeNumbers(startNum, endNum);
		System.out.println("The sum of prime numbers between "+ startNum + " & " + endNum+ " is : " + sumOfPrimeNumbers(startNum, endNum));
		findaverageofPrimeNumbers(startNum, endNum);
	}

}
