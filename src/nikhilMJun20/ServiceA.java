package nikhilMJun20;

public class ServiceA {
	void method1() {
		System.out.println("\nCall received @ non-static method1() of class ServiceA FROM static main() method of class ClientOfABCD.\n\n*method1() of ServiceA --> method2() of ServiceA:-\nCALLING static method2() of class ServiceA FROM non-static method1() of class ServiceA.\nObject of class ServiceA is not required.\nRULE: For non-static to static method calling within class, object of service method class (ServiceA) is not required. (We use class name (ServiceA) with method for better readability.)");
		
		ServiceA.method2();
	}
	
	static void method2() {
		System.out.println("\nCall received @ static method2() of class ServiceA FROM non-static method1() of class ServiceA.\n\n*method2() of ServiceA --> method4() of ServiceB:-\nCALLING static method4() of class ServiceB FROM static method2() of class ServiceA.\nObject of class ServiceB is not required.\nRULE: For static to static method calling between classes, object of service method class (ServiceB) is not required. (We use class name (ServiceB) with method for better readability.)");
		
		ServiceB.method4();
	}
}
