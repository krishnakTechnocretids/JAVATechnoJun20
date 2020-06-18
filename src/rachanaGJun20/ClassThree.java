package rachanaGJun20;

public class ClassThree {

	static void methodFive() {
		System.out.println("\nHey I am in methodFive of ClassThree !");
		System.out.println("Method Type : Static  Called from : Non-Static(methodSix|ClassThree)\nCalling Type: Static - Non-Static\nTo call me : Object & Class name not required,Call Directly");
	}
	
	 void methodSix() {
		 System.out.println("\nHey I am in methodSix of ClassThree !");
		 System.out.println("Method Type : Non-Static  Called from : Non-Static(methodThree|ClassTwo)\nCalling Type: Non-Static - Non-Static \nTo call me : Object required");
		 methodFive();
	}
}
