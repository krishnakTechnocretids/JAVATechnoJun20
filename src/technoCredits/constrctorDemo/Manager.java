package technoCredits.constrctorDemo;

public class Manager {

	private Manager(){
		
	}
	
	static public Manager getObject(){
		return new Manager();
	}
	
	
	void m1() {
		System.out.println("manager m1");
	}
	
	public static void main(String[] args) {
		Manager manager = new Manager();
		
	}
}
