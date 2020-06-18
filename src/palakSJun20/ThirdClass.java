package palakSJun20;

public class ThirdClass {
	static void FifthMethod(){
		System.out.println("Fifth Static Method Inside Third Class\n");
		FourthClass.SecondMethod();
	}
	
	void SixthMethod(){
		System.out.println("Sixth Method Inside Third Class");
		ThirdClass.FifthMethod();
	}
}
