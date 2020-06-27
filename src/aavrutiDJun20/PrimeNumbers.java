package aavrutiDJun20;

public class PrimeNumbers {
	
	//Print whether given number is Prime Number or not
	void primeNumberOrNot(int number) {
		boolean flag = false;
		for(int index=2;index<number/2;index++) {
			if(number%index==0) {
				flag = true;
				break;
			}
		}
		if(flag==true)
			System.out.println(number + " is not a Prime Number");
		else
			System.out.println(number + " is a Prime Number");		
	}
	
	//Calculate Sum, Count and Average of Prime Numbers
	void primeNumber2To100(int startNum, int endNum) {
		int primeCnt = 0;
		int sumOfPrime = 0;
		for(int index=startNum;index<=endNum;index++) {
			boolean flag = true;
			for(int index2=(index)/2;index2>=2;index2--) {
				if(index%index2==0){
					flag = false;
					break;
				}
			}
			if(flag==true) {
				sumOfPrime += index;
				primeCnt++;
			}				
		}		
		System.out.println("\nTotal Count of Prime Number Between " + startNum + " to " + endNum + " is : " + primeCnt);
		System.out.println("\nSum of all Prime Number between " + startNum + " to " + endNum + " is : " + sumOfPrime);
		System.out.println("\nAverage of all Prime Number between " + startNum + " to " + endNum + " is : " + Double.valueOf(sumOfPrime)/Double.valueOf(primeCnt));
	}
	
	public static void main(String[] args) {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		
		primeNumbers.primeNumberOrNot(22);
		primeNumbers.primeNumberOrNot(23);
		primeNumbers.primeNumber2To100(2,100);
	}
}