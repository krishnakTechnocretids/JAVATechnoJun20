package aasthaJJun20;

public class PrimeNumbers {
	boolean isPrimeNumber(int num){
		for(int index = 2; index <= Math.sqrt(num); index++){
			if(num%index == 0){
				return false;
			}
		}
		return true;
	}
	
	void displayPrimeNumber(int num){
		if(isPrimeNumber(num))
			System.out.println("Given number "+num+" is a prime number");
		else
			System.out.println("Given number "+num+" is not a prime number");
	}
	
	void displayCountSumAvg(int start, int end){
		int count = 0, sum = 0;
		for(int index = start; index <= end; index++){
			if(isPrimeNumber(index)){
				count++;
				sum += index;
			}
		}
		System.out.println("There are total "+count+" prime numbers in range ("+start+","+end+")");
		System.out.println("The sum of all the prime numbers in range ("+start+","+end+") = "+sum);
		System.out.println("The average of all the prime numbers in range ("+start+","+end+") = "+(Double.valueOf(sum)/Double.valueOf(count)));
	}
		
	public static void main(String[] args){
		PrimeNumbers primeNumbers = new PrimeNumbers();
		primeNumbers.displayPrimeNumber(2);
		primeNumbers.displayCountSumAvg(2,100);
	}
}
