/*Employee class having attribute -> empid, empname, empsalary.

A) Use comparable to sort all employees based on empid.
----------------------------------------------------------------------
B) Use comparator to sort all employees based on empid.
C) Use comparator to sort all employees based on empname.
D) Use comparator to sort all employees based on salary.
*/

// This is for Comparable....sorting on only one attribute like here empID
package barkhaPJun20;

public class Comparable_Employee implements Comparable<Comparable_Employee> {
	
	int empId;
	String empName;
	double empSalary;
	
	Comparable_Employee(int empId, String empName,double empSalary){
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
		
	}

	@Override
	public int compareTo(Comparable_Employee o) {
		//return this.empId-o.empID
		if (this.empId == o.empId)
			return 0;
		else if (this.empId > o.empId)  // ">" will give ascending order and "<" will give descending order
			return 1;
		else
			return -1;
	}
	/*for name comparison 
	public int compareTo(Comparator_Comparable_Employee o) {    //compareTo always return integer value
		//return this.empName.compareTo(o.empName)
		if (this.empName.compareTo(o.empName)==0)
			return 0;
		else if (this.empName.compareTo(o.empName)>0)  // ">" will give ascending order and "<" will give descending order
			return 1;
		else
			return -1;
			*/

}
