package apurvaJun20;

public class Example1 {
	static int rno;
	String name;
	
	void displayData() {
		System.out.println(rno + " " + name);
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1(); // name="M" [I] // rno=10 [S]
		example1.name = "Hello ";
		
		Example1 example2 = new Example1(); // name = "K" 
		example2.name = "Shiro";
		
		example1.displayData(); //
	}
}
