package barkhaPJun20;

public class FunctionsOfPrimeNum {
	int sum=0;
	int count=0;
	
	boolean primeNumber(int num) {
		boolean flag=true;    
		for (int index=2; index<=num/2; index++) {
			if (num%index==0) {
				flag=false;  // if flag false then not Prime Num
				break;
			}	
		}if (flag==true)	
			return true;    //if method returns true then num is Prime
		else
			return false;
	}
	void printCountOfPrimeNumInGivenRange(int startNum, int endNum) {
		int sum=0;
		int count=0;
		
		for (int index=startNum; index<=endNum; index++) {
			boolean flag=primeNumber(index);
			if (flag==true) {
				count++;
				sum=sum+index;
			}
		}
			System.out.println("Total Count of Prime Numbers between range "+startNum +" to "+endNum +" is "+count);
			System.out.println("Sum of all Prime Numbers between range "+startNum +" to "+endNum +" is "+sum);
			System.out.println("Average of all Prime Numbers between range "+startNum +" to "+endNum +" is "+((float)sum/(float)count));
		
		}
	public static void main(String[] args) {	
		FunctionsOfPrimeNum functionsOfPrimeNum=new FunctionsOfPrimeNum();
		functionsOfPrimeNum.printCountOfPrimeNumInGivenRange(2, 100);
	}
}	
