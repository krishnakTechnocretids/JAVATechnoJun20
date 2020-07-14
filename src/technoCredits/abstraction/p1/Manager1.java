package technoCredits.abstraction.p1;

abstract public class Manager1 {
	int managerId;
	String managerName;
	
	Manager1(int managerId){
		this.managerId = managerId;// I->L // L-> I // L -> L
		if(managerId == 101)
			managerName = "Prashant";
		else if(managerId == 102)
			managerName = "Harsh";
		else
			managerName = "Krishna";
	}
	
	void m1() {
		
	}
	abstract void displayInfo();
}
