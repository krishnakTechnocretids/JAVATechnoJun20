package vaishnaviVJun20_arrayExamples;

public class Prime {
	
	int count;
	int sum;
	void isPrime(int input) {
		boolean flag = true;	
		 for(int index=2;index<=input/2;index++) {	
		   if(input%index==0) {
			 flag= false;
			 break;
		   }
		}
		if(flag == true) {
			System.out.println(input +" is a Prime number");
			count++;
	    	sum +=input;
		}	
	}
	
	void findPrimeNumbers(int startNum,int endNum) {
		count =0;
		sum=0;
		for(int index =startNum;index<=endNum;index++) {
			isPrime(index);
		 } 
		 System.out.println("count of prime numbers between 2 to 100 is: " +count);
		 System.out.println("sum of prime numbers between 2 to 100 is: " +sum);
		 System.out.println("Avg of prime numbers between 2 to 100 is: " +(sum/count));
	}
	
	public static void main(String[] args) {
		Prime prime = new Prime();
		prime.isPrime(17);
		int startNumber=2;
		int endNumber=100;
		prime.findPrimeNumbers(startNumber,endNumber);
	}

}
