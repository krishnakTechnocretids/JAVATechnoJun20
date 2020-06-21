package nikhilMJun20;

public class ServiceD {
	static void method1() {
		System.out.println("\nCall received @ static method1() of class ServiceD FROM static method2() of class ServiceD.");
	}
	
	static void method2() {
		System.out.println("\nCall received @ static method2() of class ServiceD FROM static method5() of class ServiceC.\n\n*method2() of ServiceD --> method1() of ServiceD:-\nCALLING static method1() of class ServiceD FROM static method2() of class ServiceD.\nObject of class ServiceD is not required.\nRULE: For static to static method calling within class, object of service method class (ServiceD) is not required. (We use class name (ServiceD) with method for better readability.)");
		
		ServiceD.method1();
	}
}
