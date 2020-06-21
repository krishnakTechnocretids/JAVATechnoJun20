package aavrutiDJun20;

public class FirstClass {
	
	void firstClassM1() {
		System.out.println("\nFirst Class:\n");
		System.out.println("1) ClientClass main method ---> non static 'firstClassM1' method using 'reference variable'");
		FirstClass.firstClassM2(); //Calling static firstClassM2 method of same class
	}
	
	static void firstClassM2(){
		System.out.println("2) non static firstClassM1 method ---> static 'firstClassM2' method of same class 'without using reference variable'. \n");
		SecondClass.secondClassM2(); //Calling static method of SecondClass
	}

}
