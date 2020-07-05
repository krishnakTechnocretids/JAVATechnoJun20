package technoCredits.polymorphismdemo;

public class InterviewQ2 {

	void m1(int x, double d) {
		System.out.println("1");
	}
	
	void m1(double d, int x) {
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		InterviewQ2 interviewQ2 = new InterviewQ2();
		interviewQ2.m1(10, 20.50);// 10.20, 20.50
		//interviewQ2.m1(10.20, 20.50); CE
		//interviewQ2.m1(10, 10);
	}
}

// m1(10,20.50)