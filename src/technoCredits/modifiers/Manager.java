package technoCredits.modifiers;

 class Manager {
	private String uname="manager@1";
	static private String password = "kyubatau";
	
	private void displayEmpInfo(int empid) {
		// uname + password
		// uname + password 
		System.out.println("ALL info about employee");
		
	}
	
	private void displayIncrementPer(int empid) {
		//uname + password
		System.out.println(empid + ":" + "---percent");
		System.out.println(uname + ":" + password);
	}
	
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.displayEmpInfo(10109);
		manager.displayIncrementPer(10109);
	}
}
