package rachanaGJun20;

public class ClassTwo {

		void methodThree() {
			System.out.println("\nHey I am in methodThree of ClassTwo !");
			System.out.println("Method Type : Non-Static  Called from : Static(mathodFour|ClassTwo) \nTo call me : Object required");
			ClassThree classthree = new ClassThree();
			classthree.methodSix();
			
		}
		
		static void methodFour() {
			System.out.println("\nHey I am in methodFour of ClassTwo !");
			System.out.println("Method Type : Static  Called from : Static(methodTwo|ClassOne) \nTo call me : Class Name required");
			ClassTwo classtwo = new ClassTwo();
			classtwo.methodThree();
		}
}

