package maheshKJun20;

public class ClientClass {
	
	public static void main(String[] args) {
		//Starting point for communication between classes. We will be calling firstclass.methodOne (non static)
		System.out.println("**************Communication Started from Main method of ClientClass**************");
		FirstClass firstclass = new FirstClass();
		firstclass.methodOne();
	}
}
