package barkhaPJun20;

public class FibbonacciSeries {
	
	void fibbonacciNumbers(int order) {
		int num1=0;
		int num2=1;
		int sum;
		System.out.println("Fibbonacci Series is :");
		for (int numCount=0; numCount<=order; numCount++) {
			sum=num1+num2;                   //0+1  sum=1
			num1=num2;                       //num1=1
			num2=sum;						 //num2=1
			System.out.print(num1+" ");
		}
	}	
	public static void main(String[] args) {
		FibbonacciSeries fibbonacciSeries=new FibbonacciSeries();
		int order=5;
		fibbonacciSeries.fibbonacciNumbers(order);
	}
}
