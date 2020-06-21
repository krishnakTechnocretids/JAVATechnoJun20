package technoCredits.arrayExample;

public class Example2 {
	
	public static void main(String[] args) {
		Example2 example1 = new Example2();
		//example1.add(5, 7);
		int[] num = new int[4]; // 4*4 = 16 // num --> memory address
		num[0] = 10;
		num[1] = 11;
		num[2] = 12;
		num[3] = 13;
		
		int sum = num[0] + num[1] + num[2] + num[3];
		System.out.println("Total sum is " + sum);
		
		for(int index=0;index<4;index++) {
			System.out.println(num[index]);	
		}
	}
	
}
