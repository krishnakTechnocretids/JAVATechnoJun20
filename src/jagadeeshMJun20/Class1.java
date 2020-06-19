package jagadeeshMJun20;

public class Class1 {
void m1(){
	System.out.println("Inside Class1 and Method1 ");
	Class1.m2();
}
static void m2(){
	System.out.println("Inside Class1 and Method2 ");
	Class2.m4();
}

}
