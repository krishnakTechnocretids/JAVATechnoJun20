package technoCredits.throwthrows;

public class StudentDetails {

	int rno;
	String name;
	
	void setData(int rno, String name) {
		if(this.rno <=0) {
			throw new ArithmeticException();
		}
		this.rno = rno;
		this.name = name;
	}
}
