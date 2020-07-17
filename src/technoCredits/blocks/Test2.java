package technoCredits.blocks;

public class Test2 extends Test1{
	static {
		System.out.println("Test2 static block");
	}
	
	{
		System.out.println("Test2 NS Block");
	}
	
	Test2(){
		System.out.println("Test2 constructor");
	}
	
	public static void main(String[] args) {
		Test2 test1 = new Test2();
	}
}
