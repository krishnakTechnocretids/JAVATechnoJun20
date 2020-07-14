package technoCredits.blocks;

public class Example1 {


	{
		System.out.println("NS Block3");
	}
	
	
	public Example1() {
		System.out.println("Default Constructor");
	}
	
	
	public static void main(String[] args) {
		new Example1();
	}
	

	{
		System.out.println("NS Block2");
	}
	
	{
		System.out.println("NS Block1");
	}
	
	static{
		System.out.println("Static Block 1");
	}
	
}
