package rachanaGJun20;

public class ClassOne {
	
	void methodOne() {
		
		System.out.println("\nHey I am methodOne of classOne !");
		System.out.println("Method Type : Non-Static  Called from : Static(main method)\nCalling Type: Static - NonStatic \nTo call me : Object required");
		methodTwo();
	}
	
	static void methodTwo() {
		System.out.println("\nHey I am methodTwo of ClassOne !");
		System.out.println("Method Type : Static   Called from :Non-Static (methodOne|ClassOne)\nCalling Type: Non-Static - Static \nTo call me : Object and Class name not required,Call Directly  ");
		ClassTwo.methodFour();
	}
}
