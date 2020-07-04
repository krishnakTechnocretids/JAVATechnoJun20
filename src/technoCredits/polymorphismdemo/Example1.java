package technoCredits.polymorphismdemo;

public class Example1 {

	static void start() {
	System.out.println("Default method");
		// chrome browser
		// default test env URL
		// default username , password
	}
	
	static public void start(String browser) {
		System.out.println(browser + " open");
		System.out.println("Login with default username and password");
	}
	
	protected String start(String browser, String uname, String pwd) {
		System.out.println(browser + " open");
		System.out.println(uname + ":" + pwd);
		return "";
	}
	
	private void start(String uname, String pwd) {
		System.out.println("Default browser");
		System.out.println(uname + ":" + pwd);
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.start("IE");
		example1.start("IE", "mkaanni", "123");
		System.out.println(10);
	}
	
}
