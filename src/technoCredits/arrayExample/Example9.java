package technoCredits.arrayExample;

public class Example9 {
	//int x = 100;
	void m1(int x) {
		x = 20;
		System.out.println("In m1 value of X :" + x); //
	}
	
	void m2(int[] num) {
		num[2] = 200;
		System.out.println(num);
		System.out.println("In m2 value at index 2 : " + num[2]); //
	}
	
	public static void main(String[] args) {
		Example9 example9 = new Example9();
		int x = 10;
		example9.m1(x); // pass by value
		System.out.println("In main value of x is " + x); //
		
		int[] number = {10,20,30,40};
		System.out.println(number);
		example9.m2(number);
		System.out.println("In m2 value at index 2 : " + number[2]); //
	}
	
}

