package technoCredits.blocks;

public class Test1{

	static {
		System.out.println("Test1 static block");
	}
	
	{
		System.out.println("Test1 NS Block");
	}
	
	Test1(){
		System.out.println("Test1 constructor");
	}
}
