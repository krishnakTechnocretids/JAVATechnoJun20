package technoCredits.abstraction;

public class B implements A {

	@Override
	public void m1() {
		System.out.println("A m1");
	}
	
	public String m2() {
		return "Techno";
	}

	@Override
	public int m3(String input1, String input2) {
		/////
		return 10;
	}

	@Override
	public boolean m4() {
		return false;
	}
	
	void m5() {
		System.out.println(A.x);
		System.out.println("This is Class B's extra method");
	}

}
