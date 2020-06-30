package kartikeyDJune20;

public class FebonacciSeries {

	static void febonacciSeries(int cnt) {
		int num1 = 1;
		int num2 = 1;
		int sum = 0;
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		for (int index = 3; index <=cnt; index++) {
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.print(sum+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		FebonacciSeries.febonacciSeries(5);	
		FebonacciSeries.febonacciSeries(10);
	}

}
