package technoCredits.singletonDesignPattern;

// Eager 
public class Connection2 {

	private static Connection2 con = new Connection2();
	private Connection2(){
		
	}
	
	//String temp = new Connection()
	static Connection2 getConnection(){	
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
