package technoCredits.finalExample;

public class Test1 {

	final int X;
	
	{
		
	}
	
	{
		X = 20;
	}
	
	{
		System.out.println(X);
	}
	
	Test1(){
		//X = 10;
	}
	
	Test1(int y){
		//X = 20;
	}
	
	Test1(String input){
		this(10);
	}
}
