package apurvaJun20;

public class ClassC {
	
	static void m5()
	{
		System.out.println("\n"+"This is Static Method m5 of ClassC called from non Static menthod m6 of Classc");
	
		ClassD.m2();
	}
	void m6()
	{
		System.out.println("\n"+"This is non Static menthod m6 of ClassC called from non Static method m3 of ClassB");
		ClassC.m5();
	}
	
}
