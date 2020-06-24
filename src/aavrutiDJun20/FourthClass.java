package aavrutiDJun20;

public class FourthClass {

	static void firstClassM1() {
		System.out.println("2) static firstClassM2 ---> static 'firstClassM1' of same fourth class 'without using reference variable'");
	}
	
	static void firstClassM2(){
		System.out.println("Fourth Class:\n");
		System.out.println("1) Static thirdClassM1 ---> static 'firstClassM2' of FourthClass 'without using reference variable'");
		FourthClass.firstClassM1(); //calling static method of same fourth class
	}
}
