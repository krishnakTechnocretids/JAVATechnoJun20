class Calculator
{

	int x=10;
	int y=20;


	void add()
	{
		System.out.println("Addition of variable is"+(x+y));			
	}

	void sub()
	{
		System.out.println("Sub is"+(x-y));
	}

	void mul()
	{
		System.out.println("multiplication is"+(x*y));
	}

	void div()
	{
		System.out.println("Division is"+(y/x));
	}

	public static void main(String[] agrs)
	{
		Calculator calculator=new Calculator();
		calculator.div();
		calculator.sub();
		calculator.add();
		calculator.mul();
	}



}