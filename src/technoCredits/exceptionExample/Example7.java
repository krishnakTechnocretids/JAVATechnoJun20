package technoCredits.exceptionExample;

public class Example7 {

	void m1() {
		try {
			System.out.println(2); // 2
			int x = 5 / 0; // ---- >
		} catch (Exception e) {
			System.out.println(1);
		}

		Example5 example5 = null;
		try {
			System.out.println("Hi");
			example5.m1();
			System.out.println(3);
		} catch (Exception ne) {
			System.out.println(4);
		}
		System.out.println(6);
		System.out.println(7);
		Boolean b1 = new Boolean("Hi");
		System.out.println(b1); /// false
		
		Boolean b2 = new Boolean("Hi");
		System.out.println(b2); /// false
		
		System.out.println(b1.equals(b2)); // true
		System.out.println(b1 == b2);
		
		
	}

	public static void main(String[] args) {
		new Example7().m1();// Last in first out
	}
}
