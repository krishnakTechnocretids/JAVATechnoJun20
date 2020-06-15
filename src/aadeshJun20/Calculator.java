package aadeshJun20;

public class Calculator {

		int x = 10;
		int y = 20;
		
		void add()
		{
		System.out.println( "addition of two numbers is " + (x+y) );
		
		}
		void sub ()
		{
		System.out.println( " sub is " + (x-y));
		}
		void mul ()
		{
		System.out.println(" mul is "+ (x*y));
		}
		void div ()
		{
		System.out.println(" div is " + (x/y));
		}
		
			public static void main(String[] args)
			{
			Calculator calculator = new Calculator();
			calculator.add();
	        calculator.div();		
			}
		
		
		
		
	}
