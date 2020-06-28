package technoCredits.arrayExample;


public class Example1 {

	public static void main(String[] args) {
		Example1 example1 = new Example1();
		int[] num = new int[4]; // 4*4 = 16 // num --> memory address
		num[0] = 10;
		num[1] = 11;
		num[2] = 12;
		num[3] = 13;		
		int sum = num[0] + num[1] + num[2] + num[3];
		System.out.println("Total sum is " + sum);
		System.out.println("0th Index : " + num[0]); //10
		System.out.println("1st Index :" + num[1]);
		System.out.println("2nd Index :" + num[2]);
		System.out.println("3rd Index : " + num[3]);
	}
}
