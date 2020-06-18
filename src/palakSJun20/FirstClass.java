package palakSJun20;

public class FirstClass {
	
	void FirstMethod(){
		System.out.println("First Method Inside First Class");
		FirstClass.SecondMethod();
	}
	static void SecondMethod(){
		System.out.println("Second Static Method Inside First Class\n");
		SecondClass.FourthMethod();
	}

}
