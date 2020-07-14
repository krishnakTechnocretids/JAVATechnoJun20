package technoCredits.abstraction.p1;

public class Example1 {
	int x = 10;

	public Example1() {
		/*this(20);
		System.out.println("Default constructor" + x);*/
		super();
		m1(x);
	}
	
	Example1(int z) {
		super();
		System.out.println(z);
	}

	void m1(int y) {
		System.out.println("This is m1" + x);
	}

	public static void main(String[] args) {
		new Example1();
	}

}
