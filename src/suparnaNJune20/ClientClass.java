package suparnaNJune20;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calling from Client class");
		FirstClass firstVar = new FirstClass();
		System.out.println("This call from client to FirstClass  with class var name as firstMethod() is non static method ");
		firstVar.firstMethod();
	}

}
