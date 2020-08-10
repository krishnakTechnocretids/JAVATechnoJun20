package barkhaPJun20;

import java.util.Comparator;

public class Comparator_EmployeeDetails_empId implements Comparator<Comparator_EmployeeDetails> {

	@Override
	public int compare(Comparator_EmployeeDetails o1, Comparator_EmployeeDetails o2) {
		if (o1.getEmpId() == o2.getEmpId())
			return 0;
		else if (o1.getEmpId() > o2.getEmpId())  // ">" will give ascending order and "<" will give descending order
			return 1;
		else
			return -1;
	}
}