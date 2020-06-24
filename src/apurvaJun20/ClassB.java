package apurvaJun20;

public class ClassB {
    void m3() {
   System.out.println("\n"+"This is non static method m3 of Class B called from static method m4 of ClassB");
    ClassC classc = new ClassC();
    classc.m6();
    }
    static void m4() {
    	System.out.println("\n"+"This is static method m4 of ClassB called from static method m2 of ClassA");
    	
    	ClassB classb = new ClassB();
    	classb.m3();
    }

}
