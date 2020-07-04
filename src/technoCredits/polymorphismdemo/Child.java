package technoCredits.polymorphismdemo;

// Only object behaviors change from one object to another.
//m1 is a property of Parent class, properties can't be override.

public class Child{

	
	public void m2(){
		System.out.println("Child m1");
	}
	
	
	public static void main() {
		
	}
	
	public static void main(int x) {
		
	}
	
	public static void main(String msg) {
		
	}
	
	public static void main(String[] args) {
		//Parent parent = new Child();
		//parent.m1(); // m1 is a property of Parent class, properties can't be override.
		//Child.m1();
		
		Parent p1 = new Parent();
		//p1.x = 100;
		System.out.println(p1.x);
		
	}
	
}
