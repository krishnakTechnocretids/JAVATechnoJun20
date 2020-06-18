package palakSJun20;

public class SecondClass {
	
	void ThirdMethod(){
		System.out.println("Third Method Inside Second Class\n");
		ThirdClass thirdClass = new ThirdClass();
		thirdClass.SixthMethod();
	}
	
	static void FourthMethod(){
		System.out.println("Fourth Static Method Inside Second Class");
		SecondClass secondClass = new SecondClass();
		secondClass.ThirdMethod();
	}

}
