package technoCredits.blocks;

public class Parent {

	{
		System.out.println("Parent NS Block"); //7
	}
	
	public Parent() {
		super(); //5 //6
		System.out.println("Parent default constructor"); //8
	}
}
