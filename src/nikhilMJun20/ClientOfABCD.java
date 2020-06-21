/*
Write a code based on above figure, [create 4 classes and 1 client class having main method]. from main method you will call m1 method of call A as mentioned in figure.
*/

package nikhilMJun20;

public class ClientOfABCD {
	public static void main(String[] args) {
		ServiceA serviceA = new ServiceA();
		
		System.out.println("\n*main() of ClientOfABCD --> method1() of ServiceA:-\nCALLING non-static method1() of class ServiceA FROM static main() method of class ClientOfABCD.\nObject of class ServiceA is required and created.\nRULE: For static to non-static method calling between classes, object of service method class (ServiceA) is required");
		
		serviceA.method1();
	}
}
