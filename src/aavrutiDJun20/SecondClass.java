package aavrutiDJun20;

public class SecondClass {

	void secondClassM1() {
		System.out.println("2) Static secondClassM2 method ---> non-static 'secondClassM1' method of same class by using 'reference variable'\n ");
		ThirdClass thirdClass = new ThirdClass();
		thirdClass.thirdClassM2(); //Calling non static method of third class
	}
	
	static void secondClassM2(){
		System.out.println("Second Class:\n");
		System.out.println("1) Static firstClassM2 method ---> static 'secondClassM2' method 'without using reference variable'.");
		SecondClass secondClass = new SecondClass();
		secondClass.secondClassM1(); //Calling Non static method from static method
	}
}
