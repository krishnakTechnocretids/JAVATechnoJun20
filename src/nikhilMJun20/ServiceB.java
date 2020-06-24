package nikhilMJun20;

public class ServiceB {
	void method3() {
		ServiceC serviceC = new ServiceC();
		
		System.out.println("\nCall received @ non-static method3() of class ServiceB FROM static method4() of class ServiceB.\n\n*method3() of ServiceB --> method6() of ServiceC:-\nCALLING non-static method6() of class ServiceC FROM non-static method3() of class ServiceB.\nObject of class ServiceC is required and created.\nRULE: For non-static to non-static method calling between classes, object of service method class (ServiceC) is required");
		
		serviceC.method6();
	}
	
	static void method4() {
		ServiceB serviceB = new ServiceB();
		
		System.out.println("\nCall received @ static method4() of class ServiceB FROM static method2() of class ServiceA.\n\n*method4() of ServiceB --> method3() of ServiceB:-\nCALLING non-static method3() of class ServiceB FROM static method4() of class ServiceB.\nObject of class ServiceB is required and created.\nRULE: For static to non-static method calling within class, object of service method class (ServiceB) is required");
		
		serviceB.method3();
	}
}
