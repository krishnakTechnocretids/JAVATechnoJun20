package anshuKJun20;

public class ClientClass {
	public static void main(String[] args) {
		ClassA classa = new ClassA();
		System.out.println("main() of ClientClass --> methodM1() of ClassA:- To Call Non Static Method From Static method Always Object is required of that class");
		
		classa.methodM1();
	}

}
