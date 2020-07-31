package polymorphism;

public class OverridingChild1 extends OverridingParent{
	
	String s1 = "shruti child";
	int num = 100;
	private int num2 = 200;
	int num3 = 300;
	static final int num4 = 400;
	

	static void m1(){
		System.out.println("void m1 method of child");
	}
	@Override
	String m2(){
		System.out.println("String -- static method m2 of child");
		return null;
	}
	
	private void m3(){
		System.out.println("private m3() method of child");
	}
	
	 protected int m4(){
		System.out.println("Protected int m4 method of child");
		return 1;
	}

	//public final void m5(){
	//	System.out.println("Final public m5() method of Parent");
	//}
	
	public static void main(String[] args) {
		OverridingChild1 c = new OverridingChild1();
		OverridingParent p = new OverridingParent();
		OverridingParent a = new OverridingChild1();
		a.m1();
		c.m1();
		
		
	}
}
