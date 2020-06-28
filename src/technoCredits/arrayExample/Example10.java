package technoCredits.arrayExample;

public class Example10 {

	void m1(Integer x) {
		x = 20;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		Integer x1 = 10;
		new Example10().m1(x1);
		System.out.println(x1);
	}
}
