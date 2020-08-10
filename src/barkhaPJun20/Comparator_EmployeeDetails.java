package barkhaPJun20;

public class Comparator_EmployeeDetails {
	
	private int empId;
	private String empName;
	private double empSalary;
	private int empDeptId;
	
	public int getDeptId() {
		return empDeptId;
	}
	public void setDeptId(int deptId) {
		this.empDeptId = deptId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

}
