package palakSJun20;

public class FourthClass {
	static void FirstMethod(){
		System.out.println("First Static Method Inside Fourth Class");
	}
	static void SecondMethod(){
		System.out.println("Second Static Method Inside Fourth Class");
		FourthClass.FirstMethod();
	}

}
