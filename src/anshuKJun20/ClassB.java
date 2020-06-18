package anshuKJun20;

public class ClassB {
	void methodM3(){
		 ClassC classc = new ClassC();
		System.out.println("Non Static methodM3--->  Non Static methodM7 of Class C:-Non Static Method of M7 does not in memory in main method(), so there is need to create object to locate in memory.");
		classc.methodM7();
	}
	static void methodM4(){
	ClassB classb = new ClassB();
	   System.out.println("Static methodM4 ----> NonStatic MethodM3 of same Class:- Always Create Object for calling Non static method from static Method");
	   classb.methodM3();

}
}
