package anshuKJun20;

public class ClassC {
	static void methodM5(){
		System.out.println("Static methodM5---> Static methodM9 of Class D:- Static method is always im memory of main() so we can it by Class name or By direct Call.");
		ClassD.methodM9();
	}
	void methodM7(){
		System.out.println("Non static methodM7--->Static methodm5 of same class, so Direct calling is possible and we can do it by its Class Name");
		ClassC.methodM5();
    }

}
