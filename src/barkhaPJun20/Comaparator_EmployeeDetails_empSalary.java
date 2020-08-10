package barkhaPJun20;

import java.util.Comparator;

public class Comaparator_EmployeeDetails_empSalary implements Comparator<Comparator_EmployeeDetails> {
	
	@Override
	public int compare(Comparator_EmployeeDetails o1, Comparator_EmployeeDetails o2) {
		if (o1.getEmpSalary() == o2.getEmpSalary())
				return 0;
				else if (o1.getEmpSalary() > o2.getEmpSalary())  // ">" will give ascending order and "<" will give descending order
					return 1;
				else
					return -1;
	}

}
