package sweetyMJun20;

public class ClientClass {
	
	public static void main(String[] args){
		FirstClass firstclass=new FirstClass();
		firstclass.firstMethod(); 
		System.out.println("************************************************");
		FirstClass.secondMethod();
		System.out.println("************************************************");
		SecondClass secondclass=new SecondClass();
		secondclass.thirdMethod();
		System.out.println("************************************************");
		ThirdClass thirdclass=new ThirdClass();
		thirdclass.sixthMethod();
		System.out.println("************************************************");
		ThirdClass.fifthMethod();
		System.out.println("************************************************");
		ForthClass.eightMethod();
		System.out.println("************************************************");
		SecondClass.forthMethod();
			}
		}

