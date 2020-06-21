package aavrutiDJun20;

public class ThirdClass {

	static void thirdClassM1() {
		System.out.println("2) Non Static thirdClassM2 ---> static 'thirdClassM1' of same class 'without creating reference variable'\n");
		FourthClass.firstClassM2(); //calling static method of fourth class
	}
	
	void thirdClassM2(){
		System.out.println("Third Class:\n");
		System.out.println("1) Non Static secondClassM1 ---> non static 'thirdClassM2' method using 'reference variable'");
		ThirdClass.thirdClassM1(); //calling static method
	}
}
