package aadeshJun20;

public class BankAccount {

	String uname; 
	String pwd; 
	int accnumb; 
	
	void setDetails( String username, String password, int bankAccountNumber )
	{
		uname= username;
		pwd= password;
		accnumb= bankAccountNumber;
		
		System.out.println("Your User name is " + uname);
		System.out.println(" Your Password is " + pwd);
		System.out.println(" Your Bank Account Number is " + accnumb);
	}
	
	
	void updatepassword(String updatepassword)
	{
		pwd= updatepassword;
	}
				
	
	
	void displayinfo()
	{
		
		System.out.println( "username is " + uname );
		System.out.println( "password is " + pwd );
		System.out.println( " Bank Account Number" + accnumb);
	}
		
	
	public static void main(String[] args)
	{
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("aadesh", "password", 12345);
		bankAccount.displayinfo();
		bankAccount.updatepassword("password@123");
		bankAccount.displayinfo();
	}
		
}
