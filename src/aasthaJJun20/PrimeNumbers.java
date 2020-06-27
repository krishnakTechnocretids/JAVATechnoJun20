package aasthaJJun20;

public class PrimeNumbers {
	//a) Given number is prime or not. 
		boolean isPrimeNumber(int num){
			for(int index = 2; index <= Math.sqrt(num); index++){
				if(num%index == 0){
					return false;
				}
			}
			return true;
		}
		
		// b) Print total count of prime numbers between 2->100.
		int findTotalPrimeInRange(int start, int end){
			int count = 0;
			for(int index = start; index <= end; index++){
				if(isPrimeNumber(index))
					count++;
			}
			return count;
		}
		
		//c) Find sum of all prime numbers between 2->100
		int findSumOfPrimesInRange(int start, int end){
			int sum = 0;
			for(int index = start; index <= end; index++){
				if(isPrimeNumber(index))
					sum += index;
			}
			return sum;
		}
		
		//d) Find avg of prime numbers between 2->100
		double findAvgOfPrimesInRange(int start, int end){
			return Double.valueOf(findSumOfPrimesInRange(start,end))/Double.valueOf(findTotalPrimeInRange(start,end));
		}
		
		public static void main(String[] args){
			PrimeNumbers primeNumbers = new PrimeNumbers();
			int startNum = 2;
			int endNum = 100;
			if(primeNumbers.isPrimeNumber(startNum))
				System.out.println("Given number "+startNum+" is a prime number");
			else
				System.out.println("Given number "+startNum+" is not a prime number");
			System.out.println("There are total "+primeNumbers.findTotalPrimeInRange(startNum,endNum)+" prime numbers in range ("+startNum+","+endNum+")");
			System.out.println("The sum of all the prime numbers in range ("+startNum+","+endNum+") = "+primeNumbers.findSumOfPrimesInRange(startNum,endNum));
			System.out.println("The average of all the prime numbers in range ("+startNum+","+endNum+") = "+primeNumbers.findAvgOfPrimesInRange(startNum,endNum));
		}
}
