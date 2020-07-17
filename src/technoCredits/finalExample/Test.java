package technoCredits.finalExample;

public class Test {

	static final int DBVERSION; // CE
	final String DBNAME;
	static{
		DBVERSION=10;
	}
	
	Test(String dbName){
		DBNAME = dbName;
	}
	
	void display() {
		System.out.println(DBVERSION);
	}
	
	public static void main(String[] args) {
		new Test("DB1").display();
	}
	
}
