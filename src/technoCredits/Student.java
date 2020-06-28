package technoCredits;

public class Student {

	Teacher teacher = new Teacher(); // null
	
//	static void m3(String name) { //7
//		System.out.println("Student m3"); //8
//		teacher.display(name); //10 //14 null pointer exception
//	}//15
	
	void m4(){
		teacher.display("Nimesh");
	}
	
	
}
