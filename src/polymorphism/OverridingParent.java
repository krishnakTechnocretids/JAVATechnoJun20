package polymorphism;

public class OverridingParent {
	
	String s1 = "shruti";
	int num = 10;
	private int num2 = 20;
	int num3 = 30;
	static final int num4 = 40;
	

	static void m1(){
		System.out.println("void m1 method of parent");
	}
	
	String m2(){
		System.out.println("String -- static method m2 of parent");
		return null;
	}
	
	private static void m3(){
		System.out.println("private m3() method of parent");
	}
	
	protected int m4(){
		System.out.println("Protected int m4 method of parent");
		return 1;
	}

	public final void m5(){
		System.out.println("Final public m5() method of Parent");
	}
}
