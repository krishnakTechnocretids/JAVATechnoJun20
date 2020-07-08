package technoCredits.abstraction;

public abstract class B implements A {

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
	
	
	abstract public boolean m5();

}
