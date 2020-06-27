package vaishnaviVJun20_arrayExamples;

public class Prime {
	
	int count;
	int sum;
	void isPrime(int input) {
		boolean flag = true;	
		 for(int index=2;index<=input/2;index++) {	
		   if(input%index==0) {
			 flag= false;
			 System.out.println(input+" is not a prime number");
			 break;
		   }
		}
		if(flag == true)
			System.out.println(input +" is a Prime number");
	}
	
	void findPrimeNumbers() {
		
		for(int index =2;index<=100;index++) {
			boolean flag = true;
		    for(int i=2;i<=index/2;i++) {		    	
			    if(index%i == 0) {
			    	flag = false;
			    	break;
			    }				    
		    }
		    if(flag == true)
		    	count++;		    
		 } 
		 System.out.println("count of prime numbers between 2 to 100 is: " +count);
	}
	
	void findSumOfAllPrimeNumbers() {
		for(int index =2;index<=100;index++) {
			boolean flag = true;
		    for(int i=2;i<=index/2;i++) {		    	
			    if(index%i == 0) {
			    	flag = false;
			    	break;
			    }				    
		    }
		    if(flag == true)
		    	sum +=index;
		    			    
		 } 
		 System.out.println("count of prime numbers between 2 to 100 is: " +sum);
		
	}
	
	void findAvgOfAllPrimeNumbers() {
		int avg = sum/count;
		System.out.println("Avg of prime numbers between 2 to 100 is: " +avg);
	}
	
	public static void main(String[] args) {
		Prime prime = new Prime();
		prime.isPrime(17);
		prime.findPrimeNumbers();
		prime.findSumOfAllPrimeNumbers();
		prime.findAvgOfAllPrimeNumbers();
	}

}
