package technoCredits.throwthrows;

public class Calculator {

	int div(int x, int y) {
		if(y == 0)
			throw new ArithmeticException();
		int ans = x/y;
		return ans;
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int answer = 0;
		answer = cal.div(10, 0);
		System.out.println(answer);
	}
}
