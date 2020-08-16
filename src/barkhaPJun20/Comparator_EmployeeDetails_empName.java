package barkhaPJun20;

import java.util.Comparator;

public class Comparator_EmployeeDetails_empName implements Comparator<Comparator_EmployeeDetails> {

	
	@Override
	public int compare(Comparator_EmployeeDetails o1, Comparator_EmployeeDetails o2) {
		if (o1.getEmpName().compareTo(o2.getEmpName())==0)
			return 0;
		else if (o1.getEmpName().compareTo(o2.getEmpName())>0) 
			return 1;
		else
			return -1;
	}
}