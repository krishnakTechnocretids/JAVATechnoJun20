package yashCJun20;

public class SecondClass {
	
	void m3() {
		System.out.println("In m3 method of SecondClass ");
		ThirdClass thirdClass =  new ThirdClass();
		System.out.println("Calling non-static m6 method of Third class from Second Class");
		thirdClass.m6();
	}

	 static void m4(){
		System.out.println("In m4 method of SecondClass");
		SecondClass secondClass = new SecondClass();
		System.out.println("Calling non-static m3 method of Second class from Second Class");
		secondClass.m3();
	}
}
