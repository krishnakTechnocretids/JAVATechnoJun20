package anshuKJun20;

public class ClassA {
	void methodM1(){
		System.out.println(" Non static methodM1()--------> Non Static methodM2() of same Class:- To call Non Static Method From Non Static Method No need of Object we can direct call method. ");
		ClassA.methodM2();
	}
	static void methodM2(){
		System.out.println(" Non Static methodM2()----->Static methodM4() of ClassB:- There is no need to create object for calling Static method from Non Static Method. We can call it as CLassName.Method Or direct call");
		ClassB.methodM4();
	}
	
	
		
	}


