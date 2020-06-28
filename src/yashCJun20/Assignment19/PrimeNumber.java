package yashCJun20.Assignment19;
public class PrimeNumber{
	int primeNumSum=0;
        int cnt=0;

	boolean isPrime(int num) {
		boolean flag=true;	
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num % i == 0) {
				flag=false;
				break;
			}
		}	
		return flag;
	}

	void FindPrimeNumber(int num) {
		boolean flag=isPrime(num);
		if(flag==true)
			System.out.println("\n" +num+" is Prime Number.");
		else 
			System.out.println(num+" is not Prime Number.");
	}
	void additionOfPrimeNumber() {
		boolean flag=false;
		System.out.println("Prime numbers within 2-100 range: ");
		for(int num=2;num<=100;num++) {
			flag=isPrime(num);
			if(flag==true) {
				System.out.print(num+" ");
				cnt++;
				primeNumSum=primeNumSum+num;
			}
		}
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber= new PrimeNumber();
		int number1=7; int number2=50;
		primeNumber.additionOfPrimeNumber();
		primeNumber.FindPrimeNumber(number1);
		System.out.println("\nTotal prime numbers between 2-100 are: "+primeNumber.cnt);
        System.out.println("Sum of all Prime numbers between 2-100 is: "+primeNumber.primeNumSum);
        System.out.println("Average of Prime numbers between 2-100 is: "+primeNumber.primeNumSum/primeNumber.cnt);
	}
}