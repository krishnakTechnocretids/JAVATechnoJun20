package technoCredits.abstraction.p1;

public class Employee extends Manager {
	int x = 10;
	void m1() {
		int x = 20;
		System.out.println(x); // 20 // 10 // 100
		System.out.println(this.x); // 10 //10 // 100
		System.out.println(super.x); // 100 //100 // 100
	}
	
	void m2() {
		int x = 30;
		System.out.println(x); //
		x=40;
		this.x = 300;
		System.out.println(this.x);//
		super.x = 400;
		System.out.println(super.x); //
		
		Manager manager = new Manager();
		System.out.println(manager.x); // -----> 100
	}
	
	public static void main(String[] args) {
		new Employee().m2();
	}
}
