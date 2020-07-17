package technoCredits.singletonDesignPattern;

public class Client {

	public static void main(String[] args) {
		Connection connection1 = Connection.getConnection();
		connection1.isCredentialsValid("u1","p1");
		
	
		Connection connection2 = Connection.getConnection();
		connection2.isCredentialsValid("u2","p2");	
		
		System.out.println(connection1);
		System.out.println(connection2);
	}
}
