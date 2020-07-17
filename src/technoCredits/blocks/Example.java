package technoCredits.blocks;

public class Example {
	{
		System.out.println("NS block");
	}
	
	public Example() { //2
		this(10); //3
		System.out.println("Default");
	}
	
	public Example(int x) {
		super();// 4
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		Example example = new Example(); //1
	}
}
