package technoCredits.throwthrows;

public class HarshQ1 {

	private void m1() throws Exception {
		try {
	             int a =10/0;
		} catch (Exception e) {
			System.out.println("Exception");
			throw new Exception();
		} 
		System.out.println("Hi");
	}
	
	public static void main(String[] args) throws Exception {
		new HarshQ1().m1();
	}
}
