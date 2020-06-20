package technoCredits;

public class Test4 {

	void m1() {
		System.out.println("Test4 m1");
	}
	
	void m2() { //3
		System.out.println("Test4 m2"); //4
		//Student.m3("Paresh"); //6 //16
		Student s1 = new Student();
		s1.teacher.display("Mahesh");
		System.out.println(s1.teacher.tId);
	} //17
	
	public static void main(String[] args) {
		Test4 test4 = new Test4(); // 1
		test4.m2(); //2 //18
	} //19
}
