package sweetyMJun20;

public class ForthClass {
 static void seventhMethod(){
	System.out.println("In Forth Class: static Seven method()");
 }
  static void eightMethod(){
	System.out.println("In ForthClass: static eight method and calling seventhMethod() of Forth Class");
	 ForthClass.seventhMethod();
 }
}

