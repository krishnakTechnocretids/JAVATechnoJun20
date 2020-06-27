package anshuKJun20;

public class PrimeNumber {
  void findPrimeNo(int number) {
	  double itsSquareno = Math.sqrt(number);
	  
	  for(int i=2; i<= itsSquareno; i++) {
		  if(number%i == 0)
		  {
			  System.out.println(number+" is not a prime number");
		  }
	  }
	  System.out.println(number+" is prime number");
  }
  void addPrimeNumber() {
	  int add = 0;
	  int primeCount = 0;
	  
	  for(int i =2;i<=100;i++) {
		 // double itsSquareno = Math.sqrt(i);
		  boolean flag = true;
		    int quotient= i/2;
		    for(int j = quotient;j >2;j--)
		    {
		    	if(i%j == 0)
		    	{
		    		flag = false;		    		
		    		break;
		    	}
		    }
		    if(flag==true)
		    {
		    	add += i;
		    	primeCount++;
		    }
		 }
	    System.out.println(" Total prime number is"+primeCount);
	    System.out.println("Sum of all prime number is"+add);
	    System.out.println("Average of Prime number is"+(add/primeCount));
	  }
  
  public static void main(String[] args) {
	  PrimeNumber primenumberoperation = new PrimeNumber();
	  primenumberoperation.findPrimeNo(23);
	  primenumberoperation.addPrimeNumber();
}
}
