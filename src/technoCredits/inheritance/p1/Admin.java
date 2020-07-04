package technoCredits.inheritance.p1;

public class Admin{

	private int adminId = 10;
	protected int adminDept = 10109;
	public String adminDeptAlias = "Ad";
	
	protected void displayAllInfo() {
		Admin admin = new Admin();
		System.out.println("Admin info....");
	}
}
