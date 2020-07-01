package kartikeyDJune20;

public class FebonacciSeries {

	static void febonacciSeries(int cnt) {
		int num1 = 0;
		int num2 = 1;// Series starts from 
		int sum = 0;
		System.out.print(num2 + " ");
		for (int index = 1; index < cnt; index++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(sum + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		FebonacciSeries.febonacciSeries(5);
		FebonacciSeries.febonacciSeries(10);
		FebonacciSeries.febonacciSeries(1);
	}

}
