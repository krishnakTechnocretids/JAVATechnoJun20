package rajAJun20;

public class Client {
	public static void main(String[] args) {
		System.out.println("Main method() is calling First Class method m1()");
		FirstClass firstclass = new FirstClass();
		firstclass.m1();
	}
}
