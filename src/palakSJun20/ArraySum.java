package palakSJun20;

public class ArraySum {
	
	void display(int[] num){
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			sum = sum + num[index];
		}
		System.out.println("Sum is " + sum);
	}

	public static void main(String[] args) {
		ArraySum arraySum = new ArraySum();
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		arraySum.display(num);
	}

}
