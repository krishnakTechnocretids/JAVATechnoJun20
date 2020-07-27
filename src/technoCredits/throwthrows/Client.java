package technoCredits.throwthrows;

public class Client {

	void m1() throws ClassNotFoundException{
		throw new ClassNotFoundException();
	}
	
	void m2() {
		try {
			m1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Manager mng = (Manager)Class.forName("technoCredits.throwthrows.Manager").newInstance();
		mng.display();
		
		
	}
}
