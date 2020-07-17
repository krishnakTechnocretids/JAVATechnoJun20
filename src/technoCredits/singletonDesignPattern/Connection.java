package technoCredits.singletonDesignPattern;

// Lazy 
public class Connection {

	private static Connection con = null;
	private Connection(){
		
	}
	
	static Connection getConnection(){	
		if(con == null)
			con = new Connection();
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
