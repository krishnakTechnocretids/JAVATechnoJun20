package barkhaPJun20;

public class FunctionsOfPrimeNum {
	int sum=0;
	int count=0;
	
	void primeOrNot(int num) {
		boolean flag=true;    
		for (int index=2; index<=num/2; index++) {
			if (num%index==0) {
				flag=false;  // if flag false then not Prime Num
				break;
			}	
		}	
		if (flag==true)
			System.out.println("Number "+num+" is Prime Number.");
		else
			System.out.println("Number "+num+" is Not Prime Number.");
	}
	void printCountOfPrimeNum() {
		//int count=0;
		
		for (int number=2; number<=100; number++) {
			boolean flag=true; 
			for (int index=2; index<=number/2; index++) {
				if (number%index==0) {
					flag=false;
					break;
				}
			}if (flag==true)	
				count++;	
				sum=sum+number;
			}		
		System.out.println("Total count of Prime numbers in the range 2-100 are: "+count);		
	}
	void printSumOfPrimeNum() {	
	
		System.out.println("Total sum of Prime numbers in the range 2-100 are: "+sum);
	}
	void printAvgOfPrimeNum() {
		float avg = (float)sum/(float)count;
		System.out.println("Total average of Prime numbers in the range 2-100 is: "+avg);
	}
	public static void main(String[] args) {
		FunctionsOfPrimeNum functionsOfPrimeNum=new FunctionsOfPrimeNum();
		int num=89;
		functionsOfPrimeNum.primeOrNot(num);
		functionsOfPrimeNum.printCountOfPrimeNum();
		functionsOfPrimeNum.printSumOfPrimeNum();
		functionsOfPrimeNum.printAvgOfPrimeNum();
	}
}	
	
			
	
	
		
	
			
			
			
		
		
	
	
	
