package technoCredits.modifiers;
public class PrimeOperations {
	int count = 0;
	int sum = 0;
	boolean isNumberPrime(int num){
		boolean flag = true;
		for(int i=1; i<=(num/2) ; i++){
		if (num%i==0){
			flag = false;
			return false;
		}
	}
		if(flag==true){
			System.out.println(num + " is a prime number");
			return true;
		}
		else {
			System.out.println(num + " isnot a prime number");
			return false;
		}
	}

	int totalCountofprime(int start, int end ){
		int count=0 ;
		//int sum = 0;
		for(int i = start;i<=end;i++){
			if(isNumberPrime(i))
				count++;
		}
		return count;
	}
	
	int sumOfPrime(int start , int end){
		int sum = 0;
		for(int i = start;i<=end;i++){
			if(isNumberPrime(i))
				sum = sum+i;
		}
		System.out.println( "Sum of Prime: "+ sum);
		return sum;
	}
	
	double findAvg(){
		
	double avg = sum/count;
	System.out.println( "Avg of Prime: "+ sum);
	return avg;
	}

public static void main(String[] args) {
	PrimeOperations primeOperations = new PrimeOperations();
	primeOperations.isNumberPrime(14);
	System.out.println(primeOperations.totalCountofprime(2,100));
	System.out.println(primeOperations.sumOfPrime(2, 100));
	System.out.println(primeOperations.findAvg());
}
}
