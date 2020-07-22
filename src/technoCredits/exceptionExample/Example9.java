package technoCredits.exceptionExample;

public class Example9 {

	void m1() {
		try {
			System.out.println(1);
			Double d1 = new Double("10.Maulik");
		}catch(ArithmeticException ae) {
			System.out.println("AE");
		}catch(NumberFormatException ne) {
			System.exit(0);
			System.out.println("NE : " + ne.getMessage());
		}finally {
			System.out.println("Finally");
		}
	}
	public static void main(String[] args) {
		new Example9().m1();
	}
}
