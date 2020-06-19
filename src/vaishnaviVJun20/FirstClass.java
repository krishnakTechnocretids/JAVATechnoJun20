package vaishnaviVJun20;

public class FirstClass {
   void firstMethod() {
	   System.out.println("You are inside first method of First Class");
	   secondMethod();
   }
   static void secondMethod() {
	   System.out.println("You are inside second method of First class");
	   SecondClass.fourthMethod();
   }
}
