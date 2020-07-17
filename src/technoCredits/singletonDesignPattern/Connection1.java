package technoCredits.singletonDesignPattern;

// Static block - Eager
public class Connection1 {

	final private static Connection1 con;
	
	static{
		con = new Connection1();
	}
	private Connection1(){
		
	}
	
	//String temp = new Connection()
	static Connection1 getConnection(){	
		return con;
	}
	
	boolean isCredentialsValid(String uname, String password) {
		return true;
	}
	
	void selectData(String query) {
		System.out.println("Select Query");
	}
	
	void deleteData(String query) {
		System.out.println("Delete Query");
	}
}
