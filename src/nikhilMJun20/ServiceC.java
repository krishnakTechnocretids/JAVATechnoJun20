package nikhilMJun20;

public class ServiceC {
	static void method5() {
		System.out.println("\nCall received @ static method5() of class ServiceC FROM non-static method6() of class ServiceC.\n\n*method5() of ServiceC --> method2() of ServiceD:-\nCALLING static method2() of class ServiceD FROM static method5() of class ServiceC.\nObject of class ServiceC is not required.\nRULE: For static to static method calling between classes, object of service method class (ServiceD) is not required. (We use class name (ServiceD) with method for better readability.)");
		
		ServiceD.method2();
	}
	
	void method6() {
		System.out.println("\nCall received @ non-static method6() of class ServiceC FROM non-static method3() of class ServiceB.\n\n*method6() of ServiceC --> method5() of ServiceC:-\nCALLING static method5() of class ServiceC FROM non-static method6() of class ServiceC.\nObject of class ServiceC is not required.\nRULE: For non-static to static method calling within class, object of service method class (ServiceC) is not required. (We use class name (ServiceC) with method for better readability.)");
		
		ServiceC.method5();
	}
}
