package aavrutiDJun20;

public class ClientClass {
	
	public static void main(String[] args) {
		FirstClass firstClass = new FirstClass();
		//Rules
		System.out.println("RULES:");
		System.out.println("1) 'static method     --->  non-static method':  call using reference variable");
		System.out.println("2) 'static method     --->  static method'    :  call directly using Class Name");
		System.out.println("3) 'non-static method --->  static method'    :  call directly using Class Name");
		System.out.println("4) 'non-static method --->  non-static method':  call using reference variable");
		
		firstClass.firstClassM1(); //Calling non-static M1 method of FirstClass
		
		
	}
}
