package technoCredits.arrayExample;

public class Example3 {

	
	void add(int[] num) {
		int sum = 0;
		for(int index=0;index<num.length;index++) {
			sum += num[index];
		}
		System.out.println("Total sum is: " + sum);
	}
	
	void display(int[] input) {
		for(int index=0;index<input.length;index++) {
			System.out.println(input[index]);
		}
	}
	
	public static void main(String[] args) {
		Example3 example1 = new Example3();
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 11;
		num[2] = 12;
		num[3] = 13;
		num[4] = 14;
		example1.add(num);	
	}
	
}
