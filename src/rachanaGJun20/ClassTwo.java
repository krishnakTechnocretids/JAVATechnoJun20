package rachanaGJun20;

public class ClassTwo {

		void methodThree() {
			System.out.println("\nHey I am in methodThree of ClassTwo !");
			System.out.println("Method Type : Non-Static  Called from : Static(mathodFour|ClassTwo)\nCalling Type: Non-Static - Static \nTo call me : Object required");
			ClassThree classthree = new ClassThree();
			classthree.methodSix();
			
		}
		
		static void methodFour() {
			System.out.println("\nHey I am in methodFour of ClassTwo !");
			System.out.println("Method Type : Static  Called from : Static(methodTwo|ClassOne)\nCalling Type: Static - Staic \nTo call me : Class Name required");
			ClassTwo classtwo = new ClassTwo();
			classtwo.methodThree();
		}
}

